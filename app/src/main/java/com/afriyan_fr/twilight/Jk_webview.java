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

public class Jk_webview extends AppCompatActivity {
    WebView webview;
    ProgressBar pb;
    ImageView bc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jk_webview);
        TextView txt = (TextView) findViewById(R.id.texttool);
        bc = (ImageView) findViewById(R.id.backtohome);
        pb = (ProgressBar) findViewById(R.id.progressbar);
        Button back = (Button) findViewById(R.id.btnback);
        String id = getIntent().getExtras().getString("id");
        webview = (WebView) findViewById(R.id.webview);
        webview.setWebViewClient(new myWebclient());
        webview.getSettings().setJavaScriptEnabled(true);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Jk_webview.this,jeniscamera.class);
                startActivity(i);
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Jk_webview.this,MainActivity.class);
                startActivity(i);
            }
        });
        switch (id){
            case "1":
                txt.setText("Kamera Prosumer");
                webview.loadUrl("http://twilightfotografi.club/kamera-prosumer/");
                break;
            case "2":
                txt.setText("Kamera Bridge");
                webview.loadUrl("http://twilightfotografi.club/kamera-bridge/");
                break;
            case "3":
                txt.setText("Kamera DSLR");
                webview.loadUrl("http://twilightfotografi.club/kamera-dslr/");
                break;
            case "4":
                txt.setText("Kamera Mirrorless");
                webview.loadUrl("http://twilightfotografi.club/kamera-mirrorless/");
                break;
            case "5":
                txt.setText("Kamera Action");
                webview.loadUrl("http://twilightfotografi.club/kamera-action/");
                break;
            case "6":
                txt.setText("Kamera Polaroid");
                webview.loadUrl("http://twilightfotografi.club/kamera-polaroid/");
                break;
            case "7":
                txt.setText("Kamera Boutique");
                webview.loadUrl("http://twilightfotografi.club/kamera-boutique/");
                break;
            case "8":
                txt.setText("Kamera Medium Format");
                webview.loadUrl("http://twilightfotografi.club/kamera-medium-format/");
                break;
            case "9":
                txt.setText("Kamera Pocket/Saku");
                webview.loadUrl("http://twilightfotografi.club/jenis-kamera/");
                break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(Jk_webview.this,jeniscamera.class);
        startActivity(i);
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
