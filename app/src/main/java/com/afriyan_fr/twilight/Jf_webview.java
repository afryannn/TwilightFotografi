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

public class Jf_webview extends AppCompatActivity {
    WebView webview;
    ProgressBar pb;
    Button back;
    TextView txt;
    ImageView home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jf_webview);
        webview = (WebView) findViewById(R.id.webview);
        pb = (ProgressBar) findViewById(R.id.progressbar);
        back = (Button) findViewById(R.id.btnback);
        txt = (TextView) findViewById(R.id.texttool);
        home = (ImageView) findViewById(R.id.backtohome);
        String id = getIntent().getExtras().getString("id");
        webview.setWebViewClient(new myWebclient());
        webview.getSettings().setJavaScriptEnabled(true);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Jf_webview.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Jf_webview.this,jenisfotografi.class);
                startActivity(i);
                finish();
            }
        });
        switch (id){
            case "1":
                txt.setText("Aerial Photography");
                webview.loadUrl("http://twilightfotografi.club/aerial-photography/");
                break;
            case "2":
                txt.setText("Architectural Photography");
                webview.loadUrl("http://twilightfotografi.club/348-2/");
                break;
            case "3":
                txt.setText("Commercial Photography");
                webview.loadUrl("http://twilightfotografi.club/comercial-advertising-photography/");
                break;
            case "4":
                txt.setText("Fashion Photography");
                webview.loadUrl("http://twilightfotografi.club/fashion-photography/");
                break;
            case "5":
                txt.setText("Food Photography");
                webview.loadUrl("http://twilightfotografi.club/food-photography/");
                break;
            case "6":
                txt.setText("Human Interest Photography");
                webview.loadUrl("http://twilightfotografi.club/black-white-photography/");
                break;
            case "7":
                txt.setText("Landscape Photography");
                webview.loadUrl("http://twilightfotografi.club/landscape-fotografi/");
                break;
            case "8":
                txt.setText("Macro Photography");
                webview.loadUrl("http://twilightfotografi.club/macro-photography/");
                break;
            case "9":
                txt.setText("Photojournalism Photography");
                webview.loadUrl("http://twilightfotografi.club/photojournalism-journalism-photography/");
                break;
            case "10":
                txt.setText("Potrait Photography");
                webview.loadUrl("http://twilightfotografi.club/portrait-photography/");
                break;
            case "11":
                txt.setText("Sport Photography");
                webview.loadUrl("http://twilightfotografi.club/sport-photography/");
                break;
            case "12":
                txt.setText("Stage Photography");
                webview.loadUrl("http://twilightfotografi.club/stage-photography/");
                break;
            case "13":
                txt.setText("Still Life Photography");
                webview.loadUrl("http://twilightfotografi.club/still-life-photography/");
                break;
            case "14":
                txt.setText("Street Photography");
                webview.loadUrl("http://twilightfotografi.club/street-photography/");
                break;
            case "15":
                txt.setText("Wedding Photography");
                webview.loadUrl("http://twilightfotografi.club/wedding-photography/");
                break;
            case "16":
                txt.setText("Wildlife Photography");
                webview.loadUrl("http://twilightfotografi.club/wildlife-fotografi/");
                break;
        }
    }
    public void onBackPressed() {
        Intent i = new Intent(Jf_webview.this,jenisfotografi.class);
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
        if((keyCode==KeyEvent.KEYCODE_BACK) && webview.canGoBack()){
            webview.goBack();
            return true;
        }
        return super.onKeyDown(keyCode,event);
    }
}

