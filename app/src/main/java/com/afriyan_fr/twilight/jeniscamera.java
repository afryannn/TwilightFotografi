package com.afriyan_fr.twilight;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;

public class jeniscamera extends AppCompatActivity {

    CardView card1,card2,card3,card4,card5,card6,card7,card8,card9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeniscamera);
        card1 = (CardView)findViewById(R.id.camcard1);
        card2 = (CardView) findViewById(R.id.camcard2);
        card3 = (CardView) findViewById(R.id.camcard3);
        card4 = (CardView) findViewById(R.id.camcard4);
        card5 = (CardView) findViewById(R.id.camcard5);
        card6 = (CardView) findViewById(R.id.camcard6);
        card7 = (CardView) findViewById(R.id.camcard7);
        card8 = (CardView) findViewById(R.id.camcard8);
        card9 = (CardView) findViewById(R.id.camcard9);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jeniscamera.this,Jk_webview.class);
                i.putExtra("id","1");
                startActivity(i);
                finish();
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jeniscamera.this,Jk_webview.class);
                i.putExtra("id","2");
                startActivity(i);
                finish();
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jeniscamera.this,Jk_webview.class);
                i.putExtra("id","3");
                startActivity(i);
                finish();
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jeniscamera.this,Jk_webview.class);
                i.putExtra("id","4");
                startActivity(i);
                finish();
            }
        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jeniscamera.this,Jk_webview.class);
                i.putExtra("id","5");
                startActivity(i);
                finish();
            }
        });
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jeniscamera.this,Jk_webview.class);
                i.putExtra("id","6");
                startActivity(i);
                finish();
            }
        });
        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jeniscamera.this,Jk_webview.class);
                i.putExtra("id","7");
                startActivity(i);
                finish();
            }
        });
        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jeniscamera.this,Jk_webview.class);
                i.putExtra("id","8");
                startActivity(i);
                finish();
            }
        });
        card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jeniscamera.this,Jk_webview.class);
                i.putExtra("id","9");
                startActivity(i);
                finish();
            }
        });
    }
}
