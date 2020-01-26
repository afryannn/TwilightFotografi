package com.afriyan_fr.twilight;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;

public class dasarfotografi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasarfotografi);
        CardView btn1 = (CardView) findViewById(R.id.card1n1);
        CardView btn2 = (CardView) findViewById(R.id.card1n2);
        CardView btn3 = (CardView) findViewById(R.id.card1n6);
        CardView btn4 = (CardView) findViewById(R.id.card1n7);
        CardView btn5 = (CardView) findViewById(R.id.card1n8);

        btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              Intent i = new Intent(dasarfotografi.this,df1.class);
              i.putExtra("id","1");
              startActivity(i);
              finish();
           }
       });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dasarfotografi.this,df1.class);
                i.putExtra("id","2");
                startActivity(i);
                finish();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dasarfotografi.this,df1.class);
                i.putExtra("id","3");
                startActivity(i);
                finish();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dasarfotografi.this,df1.class);
                i.putExtra("id","4");
                startActivity(i);
                finish();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dasarfotografi.this,df1.class);
                i.putExtra("id","4");
                startActivity(i);
                finish();
            }
        });
    }
}
