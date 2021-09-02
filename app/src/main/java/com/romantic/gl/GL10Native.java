package com.romantic.gl;

/**
 * Created by  on 2021/9/2.
 */
public class GL10Native {
    static {
        System.loadLibrary("gl10");
    }
    public static native void resize(int width, int height);
    public static native void step();
    public static native void init();
}
