package com.hanfl.behavior.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hanfl.behavior.R;

import butterknife.ButterKnife;

/**
 *
 */
public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        ButterKnife.bind(this);


    }
}
