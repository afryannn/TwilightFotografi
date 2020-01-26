package com.afriyan_fr.twilight;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;

public class jenisfotografi extends AppCompatActivity {
    CardView crd1,crd2,crd3,crd4,crd5,crd6,crd7,crd8,crd9,crd10,crd11,crd12,crd13,crd14,crd15,crd16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenisfotografi);
        crd1 = (CardView) findViewById(R.id.card1);
        crd2 = (CardView) findViewById(R.id.card2);
        crd3 = (CardView) findViewById(R.id.card3);
        crd4 = (CardView) findViewById(R.id.card4);
        crd5 = (CardView) findViewById(R.id.card5);
        crd6 = (CardView) findViewById(R.id.card6);
        crd7 = (CardView) findViewById(R.id.card7);
        crd8 = (CardView) findViewById(R.id.card8);
        crd9 = (CardView) findViewById(R.id.card9);
        crd10 = (CardView) findViewById(R.id.card10);
        crd11 = (CardView) findViewById(R.id.card11);
        crd12 = (CardView) findViewById(R.id.card12);
        crd13 = (CardView) findViewById(R.id.card13);
        crd14 = (CardView) findViewById(R.id.card14);
        crd15 = (CardView) findViewById(R.id.card15);
        crd16 = (CardView) findViewById(R.id.card16);
        crd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jenisfotografi.this,Jf_webview.class);
                i.putExtra("id","1");
                startActivity(i);
                finish();
            }
        });
        crd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jenisfotografi.this,Jf_webview.class);
                i.putExtra("id","2");
                startActivity(i);
                finish();
            }
        });
        crd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jenisfotografi.this,Jf_webview.class);
                i.putExtra("id","3");
                startActivity(i);
                finish();
            }
        });
        crd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jenisfotografi.this,Jf_webview.class);
                i.putExtra("id","4");
                startActivity(i);
                finish();            }
        });
        crd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jenisfotografi.this,Jf_webview.class);
                i.putExtra("id","5");
                startActivity(i);
                finish();
            }
        });
        crd6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jenisfotografi.this,Jf_webview.class);
                i.putExtra("id","6");
                startActivity(i);
                finish();            }
        });
        crd7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jenisfotografi.this,Jf_webview.class);
                i.putExtra("id","7");
                startActivity(i);
                finish();            }
        });
        crd8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jenisfotografi.this,Jf_webview.class);
                i.putExtra("id","8");
                startActivity(i);
                finish();            }
        });
        crd9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jenisfotografi.this,Jf_webview.class);
                i.putExtra("id","9");
                startActivity(i);
                finish();            }
        });
        crd10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jenisfotografi.this,Jf_webview.class);
                i.putExtra("id","10");
                startActivity(i);
                finish();            }
        });
        crd11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jenisfotografi.this,Jf_webview.class);
                i.putExtra("id","11");
                startActivity(i);
                finish();            }
        });
        crd12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jenisfotografi.this,Jf_webview.class);
                i.putExtra("id","12");
                startActivity(i);
                finish();            }
        });
        crd13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jenisfotografi.this,Jf_webview.class);
                i.putExtra("id","13");
                startActivity(i);
                finish();            }
        });
        crd14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jenisfotografi.this,Jf_webview.class);
                i.putExtra("id","14");
                startActivity(i);
                finish();            }
        });
        crd15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jenisfotografi.this,Jf_webview.class);
                i.putExtra("id","15");
                startActivity(i);
                finish();            }
        });
        crd16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jenisfotografi.this,Jf_webview.class);
                i.putExtra("id","16");
                startActivity(i);
                finish();            }
        });
    }
}
