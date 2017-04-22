package com.drbt.googleformdatacollector;

import android.app.Activity;
import android.content.Context;
import android.support.test.espresso.core.deps.guava.net.MediaType;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity {

    public static final MediaType FORM_DATA_TYPE
            = MediaType.parse("application/x-www-form-urlencoded; charset=utf-8");
    //URL derived from form URL
    public static final String URL="https://docs.google.com/forms/d/1dcq0Fgt5dSUoIiH119K5-eF-XMGiq3eVPt97Aocspx4/formResponse";
    //input element ids found from the live form page
    public static final String DNSO_NAME="entry.1041133122";
    public static final String SUBJECT_KEY="entry_1834657755";
    public static final String MESSAGE_KEY="entry_1110317093";

    private final Context context;
    private EditText emailEditText;
    private EditText subjectEditText;
    private EditText messageEditText;

    private WebView mWebview ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        mWebview  = new WebView(this);

        mWebview.getSettings().setJavaScriptEnabled(true); // enable javascript

        final Activity activity = this;

        mWebview.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
        });

        mWebview.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSeDnBhbk1FIt2z9i6Fc4VxQZnTROLH-wyNqLASEULkWgV5UmA/viewform");
        setContentView(mWebview );


    }
}
