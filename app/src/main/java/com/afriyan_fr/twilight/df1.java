package com.afriyan_fr.twilight;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;

public class df1 extends AppCompatActivity {
    WebView webview;
    ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_df1);
        pb = (ProgressBar)findViewById(R.id.progressbar);
        String jget = getIntent().getExtras().getString("id");
        webview = (WebView)findViewById(R.id.webview);
        webview.setWebViewClient(new myWebclient());
        webview.getSettings().setJavaScriptEnabled(true);
        switch (jget){
            case "1":
                webview.loadUrl("http://twilightfotografi.club/sejarah-fotografi/");
                break;
            case "2":
                webview.loadUrl("http://twilightfotografi.club/mengenal-exposure/");
                break;
            case "3":
                webview.loadUrl("http://twilightfotografi.club/mengenal-iso/");
                break;
            case "4":
                webview.loadUrl("http://twilightfotografi.club/mengenal-apperture/");
                break;
            case "5":
                webview.loadUrl("http://twilightfotografi.club/mengenal-shutter-speed/");
                break;
        }
    }
    public class myWebclient extends WebViewClient{
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            pb.setVisibility(View.GONE);
        }
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view,url,favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return super.shouldOverrideUrlLoading(view, url);
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if((keyCode==KeyEvent.KEYCODE_BACK) && webview.canGoBack()){
            webview.goBack();
            return true;
        }
        return super.onKeyDown(keyCode,event);
    }
}
