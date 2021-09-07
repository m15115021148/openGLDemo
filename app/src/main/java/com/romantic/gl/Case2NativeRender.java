package com.romantic.gl;

/**
 * Created by  on 2021/9/3.
 */
public class Case2NativeRender {
    static {
        System.loadLibrary("case2NativeRender");
    }

    public  static native void init();

    public  static native void deInit();

    public  native void setImageData(int format, int width, int height, byte[] bytes);

    public  native void onSurfaceCreated();

    public  native void onSurfaceChanged(int width, int height);

    public  native void onDrawFrame();
}
