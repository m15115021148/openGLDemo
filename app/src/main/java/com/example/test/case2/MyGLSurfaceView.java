package com.example.test.case2;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.Log;

import com.romantic.gl.Case2NativeRender;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by  on 2021/9/7.
 */
public class MyGLSurfaceView extends GLSurfaceView {
    private static final String TAG = "MyGLSurfaceView";

    public static final int IMAGE_FORMAT_RGBA = 0x01;
    public static final int IMAGE_FORMAT_NV21 = 0x02;
    public static final int IMAGE_FORMAT_NV12 = 0x03;
    public static final int IMAGE_FORMAT_I420 = 0x04;

    private MyGLRender mGLRender;
    private Case2NativeRender mNativeRender;

    public MyGLSurfaceView(Context context) {
        super(context);
        this.setEGLContextClientVersion(3);
        mNativeRender = new Case2NativeRender();
        mGLRender = new MyGLRender(mNativeRender);
        setRenderer(mGLRender);
        setRenderMode(RENDERMODE_CONTINUOUSLY);
    }

    public static class MyGLRender implements GLSurfaceView.Renderer {
        private Case2NativeRender mNativeRender;

        MyGLRender(Case2NativeRender myNativeRender) {
            mNativeRender = myNativeRender;
        }

        @Override
        public void onSurfaceCreated(GL10 gl, EGLConfig config) {
            Log.d(TAG, "onSurfaceCreated() called with: gl = [" + gl + "], config = [" + config + "]");
            mNativeRender.onSurfaceCreated();

        }

        @Override
        public void onSurfaceChanged(GL10 gl, int width, int height) {
            Log.d(TAG, "onSurfaceChanged() called with: gl = [" + gl + "], width = [" + width + "], height = [" + height + "]");
            mNativeRender.onSurfaceChanged(width, height);

        }

        @Override
        public void onDrawFrame(GL10 gl) {
            Log.d(TAG, "onDrawFrame() called with: gl = [" + gl + "]");
            mNativeRender.onDrawFrame();

        }
    }

}
