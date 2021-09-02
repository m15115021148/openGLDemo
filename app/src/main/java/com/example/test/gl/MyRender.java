package com.example.test.gl;

import android.opengl.GLSurfaceView;

import com.romantic.gl.GL10Native;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by  on 2021/9/2.
 */
public class MyRender implements GLSurfaceView.Renderer {

    public MyRender(){}

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        GL10Native.init();
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        GL10Native.resize(width, height);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        GL10Native.step();
    }
}
