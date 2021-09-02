package com.example.test.gl;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by  on 2021/9/2.
 */
public class GL10JNIView extends GLSurfaceView {
    private MyRender myRenderer;

    public GL10JNIView(Context context) {
        super(context);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        myRenderer = new MyRender();
        setRenderer(myRenderer);
    }

}
