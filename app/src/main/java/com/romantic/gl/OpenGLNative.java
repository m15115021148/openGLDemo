package com.romantic.gl;

import android.view.Surface;

/**
 * Created by  on 2021/9/2.
 */
public class OpenGLNative {
    static {
        System.loadLibrary("nativeGl");
    }
    public static native void init();

    public static native void startRenders();
    public static native void stopRenders();
    public static native void setSurfaces(Surface surface);
}
