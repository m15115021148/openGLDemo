package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.romantic.gl.OpenGLNative;
import com.romantic.gl.SViewHolder;

/**
 * @author cmeng
 */
public class MainActivity extends AppCompatActivity {
    private SurfaceView mSurfaceView;
    private SViewHolder mHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSurfaceView = findViewById(R.id.surfaceView);
        OpenGLNative.init();

        mHolder = new SViewHolder();

        mSurfaceView.getHolder().addCallback(mHolder);

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
        OpenGLNative.stopRenders();
    }
}