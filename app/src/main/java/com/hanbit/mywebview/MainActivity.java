package com.hanbit.mywebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView mWebView;
    WebSettings mWebSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView) findViewById(R.id.mWebView);
        mWebSettings = mWebView.getSettings();

        mWebSettings.setJavaScriptEnabled(true);
        mWebSettings.setUseWideViewPort(true);
        mWebSettings.setSupportZoom(true);

        mWebView.setWebViewClient(new WebViewClient());
        //mWebView.loadUrl("http://www.daum.net");

        //html같은 파일은 assets 디렉토리에 넣어야 함
        mWebView.loadUrl("file:///android_asset/www/index.html");
    }
}
