package com.example.test.case2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.romantic.gl.Case2NativeRender;

public class Case2MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Case2NativeRender.init();
        MyGLSurfaceView view = new MyGLSurfaceView(this);
        setContentView(view);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Case2NativeRender.deInit();
    }
}