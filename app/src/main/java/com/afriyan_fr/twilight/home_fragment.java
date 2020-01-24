package com.afriyan_fr.twilight;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import org.w3c.dom.Text;

public class home_fragment extends Fragment {

    public  TextView txt;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.home_fragment,container,false);
        CardView btn1 = view.findViewById(R.id.card1n1);
        CardView btn2 = view.findViewById(R.id.card1n2);
        CardView btn3 = view.findViewById(R.id.card1n3);
        CardView btn4 = view.findViewById(R.id.card2n4);
        CardView btn5 = view.findViewById(R.id.card2n2i);
        CardView btn6 = view.findViewById(R.id.card2n3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"1",Toast.LENGTH_LONG).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"2",Toast.LENGTH_LONG).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"3",Toast.LENGTH_LONG).show();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"4",Toast.LENGTH_LONG).show();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"5",Toast.LENGTH_LONG).show();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"6",Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
