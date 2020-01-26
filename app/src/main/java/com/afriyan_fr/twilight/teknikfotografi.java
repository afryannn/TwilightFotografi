package com.afriyan_fr.twilight;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;

public class teknikfotografi extends AppCompatActivity {
    CardView c1,c2,c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teknikfotografi);
        c1 = (CardView)findViewById(R.id.card1n1);
        c2 = (CardView)findViewById(R.id.card3n1);
        c3 = (CardView)findViewById(R.id.card4b1);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(teknikfotografi.this,Tf_webview.class);
                i.putExtra("id","1");
                startActivity(i);
                finish();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(teknikfotografi.this,Tf_webview.class);
                i.putExtra("id","2");
                startActivity(i);
                finish();
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(teknikfotografi.this,Tf_webview.class);
                i.putExtra("id","3");
                startActivity(i);
                finish();
            }
        });
    }
}
