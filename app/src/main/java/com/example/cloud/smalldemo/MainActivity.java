package com.example.cloud.smalldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import net.wequick.small.Small;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Small.setBaseUri("http://example.com/");
        Small.setUp(this, new net.wequick.small.Small.OnCompleteListener() {

            @Override
            public void onComplete() {
            }
        });
    }

    public void click(View view) {
        Small.openUri("hello", MainActivity.this);//启动默认的Activity，参考wiki中的UI route启动其他Activity
    }
}
