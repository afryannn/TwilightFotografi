package com.afriyan_fr.twilight;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class tnt_webview extends AppCompatActivity {

    WebView webView;
    ProgressBar pb;
    TextView txt;
    Button back;
    ImageView home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tnt_webview);
        webView = (WebView) findViewById(R.id.swebview);
        pb = (ProgressBar) findViewById(R.id.progressbar);
        txt = (TextView) findViewById(R.id.texttool);
        back = (Button) findViewById(R.id.btnback);
        home = (ImageView) findViewById(R.id.backtohome);
        webView.setWebViewClient(new myWebclient());
        String abc = getIntent().getExtras().getString("id");
        webView.getSettings().setJavaScriptEnabled(true);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tnt_webview.this,tipsntrik.class);
                startActivity(i);
                finish();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tnt_webview.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        switch (abc){
            case "1":
                txt.setText("Perbedaan DSLR dan Mirrorless");
                webView.loadUrl("http://twilightfotografi.club/2019/11/22/10-perbedaan-kamera-mirrorless-dan-dslr/");
                break;
            case "2":
                txt.setText("20 Tips Fotografi");
                webView.loadUrl("http://twilightfotografi.club/2019/11/20/20-tips-fotografi-keren-untuk-para-pemula/");
                break;
            case "3":
                txt.setText("4 Memotret Objek Bergerak");
                webView.loadUrl("http://twilightfotografi.club/2019/11/20/memotret-objek-bergerak/");
                break;
            case "4":
                txt.setText("10 cara merawat DSLR");
                webView.loadUrl("http://twilightfotografi.club/2019/11/20/tips-trik/");
                break;

        }
    }
    public void onBackPressed() {
        Intent i = new Intent(tnt_webview.this,tipsntrik.class);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
    public class myWebclient extends WebViewClient {
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
        if((keyCode==KeyEvent.KEYCODE_BACK) && webView.canGoBack()){
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode,event);
    }
}
