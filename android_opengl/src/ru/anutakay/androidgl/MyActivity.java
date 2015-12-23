package ru.anutakay.androidgl;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by anutakay
 */

public class MyActivity extends Activity {

    private MyGLSurfaceView mGLView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mGLView = (MyGLSurfaceView) findViewById(R.id.gl_surface);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mGLView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mGLView.onResume();
    }
}
