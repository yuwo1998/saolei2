package com.example.zxq.saolei2;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Chronometer;

public class MainActivity extends Activity {
    public  static  int W;
    public  static  int H;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        W = dm.widthPixels;//宽度
        H = dm.heightPixels ;//高度

        setContentView(new MainView(this));
        new AlertDialog.Builder(this)
                .setCancelable(false)
                .setTitle("规则")
                .setMessage("每十靁，展汝谓除雷之所在")
                .setPositiveButton("是",null)
                .create()
                .show();
    }

}