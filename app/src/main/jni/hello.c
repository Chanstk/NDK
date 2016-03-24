#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_example_chanst_ndkdemo_MainActivity_hello(JNIEnv *env, jobject instance) {

    // TODO

    return (*env)->NewStringUTF(env, "hello jni");
}
