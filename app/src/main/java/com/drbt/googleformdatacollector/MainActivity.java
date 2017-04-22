package com.drbt.googleformdatacollector;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void goToInput(View v) {
        startActivity(new Intent(MainActivity.this,InputActivity.class));
    }

    public void goToReport(View v) {
        startActivity(new Intent(MainActivity.this,AnalyticsActivity.class));
    }

    public void exitActivity(View v) {

        this.finish();
    }
}
