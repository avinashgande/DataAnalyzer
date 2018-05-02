package com.aksetapps.dataanalyzer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CentralTendency extends AppCompatActivity {
    Button btnMean,btnMedian,btnMode,btnGeometricMean,btnHarmonicMean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central_tendency);
        btnMean=(Button)findViewById(R.id.btnMean);
        btnMean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mean=new Intent(CentralTendency.this, com.aksetapps.dataanalyzer.Mean.class);
                startActivity(Mean);
            }
        });
        btnMedian=(Button)findViewById(R.id.btnMedian);
        btnMedian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Median=new Intent(CentralTendency.this, com.aksetapps.dataanalyzer.Median.class);
                startActivity(Median);
            }
        });
        btnMode=(Button)findViewById(R.id.btnMode);
        btnMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mode=new Intent(CentralTendency.this, com.aksetapps.dataanalyzer.Mode.class);
                startActivity(Mode);
            }
        });
        btnGeometricMean=(Button)findViewById(R.id.btnGeometricMean);
        btnGeometricMean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GeometricMean=new Intent(CentralTendency.this, com.aksetapps.dataanalyzer.GeometricMean.class);
                startActivity(GeometricMean);
            }
        });
        btnHarmonicMean=(Button)findViewById(R.id.btnHarmonicMean);
        btnHarmonicMean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HarmonicMean=new Intent(CentralTendency.this, com.aksetapps.dataanalyzer.HarmonicMean.class);
                startActivity(HarmonicMean);
            }
        });

    }
}

