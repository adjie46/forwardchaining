package com.hafiz.forwardchaining.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.hafiz.forwardchaining.R;

public class webView extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        webView = findViewById(R.id.webview);
        Intent intent = getIntent();
        if (intent!=null){
            String namafile = intent.getStringExtra("namafile");
            openFile(namafile);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    private void openFile(String namafile){
        WebSettings webSetting;
        webSetting  = webView.getSettings();
        webSetting.setBuiltInZoomControls(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("file:///android_asset/html/"+namafile);
    }
}
