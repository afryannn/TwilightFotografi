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

public class Tf_webview extends AppCompatActivity {

    WebView webview;
    ProgressBar pb;
    Button back;
    ImageView hoome;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tf_webview);
        webview = (WebView) findViewById(R.id.swebview);
        pb = (ProgressBar) findViewById(R.id.progressbar);
        back = (Button) findViewById(R.id.btnback);
        hoome = (ImageView) findViewById(R.id.backtohome);
        txt = (TextView) findViewById(R.id.texttool);
        String adm = getIntent().getExtras().getString("id");
        webview.setWebViewClient(new myWebclient());
        webview.getSettings().setJavaScriptEnabled(true);
        hoome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tf_webview.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tf_webview.this,teknikfotografi.class);
                startActivity(i);
                finish();
            }
        });
        switch (adm){
            case "1":
                txt.setText("Macam Teknik Fotografi");
                webview.loadUrl("http://twilightfotografi.club/macam-teknik-fotografi/");
                break;
            case "2":
                txt.setText("Field of View");
                webview.loadUrl("http://twilightfotografi.club/field-of-view/");
                break;
            case "3":
                txt.setText("Angle of View");
                webview.loadUrl("http://twilightfotografi.club/angle-of-view/");
                break;
        }
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
        if((keyCode==KeyEvent.KEYCODE_BACK) && webview.canGoBack()){
            webview.goBack();
            return true;
        }
        return super.onKeyDown(keyCode,event);
    }

}
