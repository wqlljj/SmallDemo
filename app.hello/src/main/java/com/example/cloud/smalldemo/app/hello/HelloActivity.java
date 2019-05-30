package com.example.cloud.smalldemo.app.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.cloud.smalldemo.lib.util.SystemUtil;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        SystemUtil.init(this);
    }

    public void click(View view) {
        ((TextView) findViewById(R.id.hello)).setText(SystemUtil.IMEI());
        Log.i("RCUID", "click: "+SystemUtil.IMEI()+"\n"+
        SystemUtil.ID()+"\n"+
        SystemUtil.SN()+"\n"+
        SystemUtil.MAC()+"\n"+
        SystemUtil.ID());
    }
}
