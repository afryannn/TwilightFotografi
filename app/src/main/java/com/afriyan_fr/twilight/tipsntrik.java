package com.afriyan_fr.twilight;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;

public class tipsntrik extends AppCompatActivity {
    CardView a1,a2,a3,a4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipsntrik);
        a1 = (CardView) findViewById(R.id.card1n1);
        a2 = (CardView) findViewById(R.id.card3n1);
        a3 = (CardView) findViewById(R.id.card4b1);
        a4 = (CardView) findViewById(R.id.card5b1);
        Button abc = (Button) findViewById(R.id.btnback);
        abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tipsntrik.this,MainActivity.class);
                i.putExtra("id","1");
                startActivity(i);
                finish();
            }
        });
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tipsntrik.this,tnt_webview.class);
                i.putExtra("id","1");
                startActivity(i);
                finish();
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tipsntrik.this,tnt_webview.class);
                i.putExtra("id","2");
                startActivity(i);
                finish();
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tipsntrik.this,tnt_webview.class);
                i.putExtra("id","3");
                startActivity(i);
                finish();
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tipsntrik.this,tnt_webview.class);
                i.putExtra("id","4");
                startActivity(i);
                finish();
            }
        });
    }
}
