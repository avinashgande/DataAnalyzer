package com.aksetapps.dataanalyzer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Range extends AppCompatActivity {
Button r;
EditText lv,hv;
TextView answer;
String lov,hov,rangeStr;
int a,b,range;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_range);
        r=(Button)findViewById(R.id.button);
        lv=(EditText)findViewById(R.id.lv);
        hv=(EditText)findViewById(R.id.hv);
        answer=(TextView)findViewById(R.id.rangev);

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lov=lv.getText().toString();
                hov=hv.getText().toString();
                a=Integer.parseInt(lov);
                b=Integer.parseInt(hov);
             range=b-a;
             rangeStr=String.valueOf(range);
             answer.setText(rangeStr);

            }
        });

            }

    }

