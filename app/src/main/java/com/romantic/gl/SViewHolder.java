package com.romantic.gl;

import android.view.SurfaceHolder;

import androidx.annotation.NonNull;

/**
 * Created by  on 2021/9/2.
 */
public class SViewHolder implements SurfaceHolder.Callback {
    @Override
    public void surfaceCreated(@NonNull SurfaceHolder holder) {
        OpenGLNative.setSurfaces(holder.getSurface());
        OpenGLNative.startRenders();
    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {
        OpenGLNative.setSurfaces(holder.getSurface());
        OpenGLNative.startRenders();
    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder holder) {
        OpenGLNative.setSurfaces(null);
    }
}
