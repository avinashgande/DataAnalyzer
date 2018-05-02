package com.aksetapps.dataanalyzer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MeasuresofDispersion extends AppCompatActivity {
    Button btnRange,btnQD,btnMD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measuresof_dispersion);
        btnRange=(Button)findViewById(R.id.btnRange);
        btnRange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Range=new Intent(MeasuresofDispersion.this, com.aksetapps.dataanalyzer.Range.class);
                startActivity(Range);
            }
        });
        btnQD=(Button)findViewById(R.id.btnQD);
        btnQD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent QD=new Intent(MeasuresofDispersion.this,QuartileDeviation.class);
                startActivity(QD);
            }
        });
        btnMD=(Button)findViewById(R.id.btnMD);
        btnMD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MD=new Intent(MeasuresofDispersion.this,MeanDeviation.class);
                startActivity(MD);
            }
        });

    }
}



