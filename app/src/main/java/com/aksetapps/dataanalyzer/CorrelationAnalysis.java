package com.aksetapps.dataanalyzer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class CorrelationAnalysis extends AppCompatActivity {
    Button btnKPCC,btnSpermans,btnPartial,btnMultiple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correlation_analysis);
        btnKPCC=(Button)findViewById(R.id.btnKPCC);
        btnKPCC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent KPCC=new Intent(CorrelationAnalysis.this, com.aksetapps.dataanalyzer.KPCC.class);
                startActivity(KPCC);
            }
        });
        btnSpermans=(Button)findViewById(R.id.btnSpearmans);
        btnSpermans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Spearmans=new Intent(CorrelationAnalysis.this,SpearmanRankCorrelation.class);
                startActivity(Spearmans);
            }
        });
        btnPartial=(Button)findViewById(R.id.btnPartial);
        btnPartial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Partial=new Intent(CorrelationAnalysis.this,Partial.class);
                startActivity(Partial);
            }
        });
        btnMultiple=(Button)findViewById(R.id.btnMultiple);
        btnMultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Multiple=new Intent(CorrelationAnalysis.this,Muiltiple.class);
                startActivity(Multiple);
            }
        });
    }
}
