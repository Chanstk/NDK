package com.example.chanst.ndkdemo;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {
    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.im);
        button = (Button) findViewById(R.id.bt);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bt:
                Bitmap img1 = ((BitmapDrawable) getResources().getDrawable(
                        R.drawable.cir1)).getBitmap();
                int w = img1.getWidth(), h = img1.getHeight();
                int[] pix = new int[w * h];
                img1.getPixels(pix, 0, w, 0, 0, w, h);
                int[] resultInt = LibImgFun.ImgFun(pix, w, h);
                Bitmap resultImg = Bitmap.createBitmap(w, h, Bitmap.Config.RGB_565);
                resultImg.setPixels(resultInt, 0, w, 0, 0, w, h);
                imageView.setImageBitmap(resultImg);
                break;
        }
    }
}
