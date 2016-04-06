package com.example.chanst.ndkdemo;

/**
 * Created by chanst on 16-3-26.
 */
public class LibImgFun {
    static {
        System.loadLibrary("ImgFun");
    }
    /**
     * @param w the current view width
     * @param h the current view height
     */
    public static native int[] ImgFun(int[] buf, int w, int h);
}
