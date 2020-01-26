package com.afriyan_fr.twilight;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class df1 extends AppCompatActivity {
    WebView webview;
    ProgressBar pb;
    TextView txt;
    Button btn;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_df1);
        pb = (ProgressBar)findViewById(R.id.progressbar);
        txt = (TextView)findViewById(R.id.texttool);
        btn = (Button)findViewById(R.id.btnback);
        img = (ImageView) findViewById(R.id.backtohome);
        String getid = getIntent().getExtras().getString("id");
        webview = (WebView)findViewById(R.id.webview);
        webview.setWebViewClient(new myWebclient());
        webview.getSettings().setJavaScriptEnabled(true);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(df1.this,MainActivity.class);
                startActivity(i);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(df1.this,dasarfotografi.class);
                startActivity(i);
            }
        });
        switch (getid){
            case "1":
                txt.setText("Sejarah Fotografi");
                webview.loadUrl("http://twilightfotografi.club/sejarah-fotografi/");
                break;
            case "2":
                txt.setText("Mengenal Exposure");
                webview.loadUrl("http://twilightfotografi.club/mengenal-exposure/");
                break;
            case "3":
                txt.setText("Mengenal Iso");
                webview.loadUrl("http://twilightfotografi.club/mengenal-iso/");
                break;
            case "4":
                txt.setText("Mengenal Apperture");
                webview.loadUrl("http://twilightfotografi.club/mengenal-apperture/");
                break;
            case "5":
                txt.setText("Mengenal Shutter Speed");
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
