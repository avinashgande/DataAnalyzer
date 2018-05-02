package com.aksetapps.dataanalyzer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCT,btnDisp,btnDist,btnCA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCT=(Button)findViewById(R.id.btnCT);
        btnCT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CT=new Intent(MainActivity.this,CentralTendency.class);
                startActivity(CT);
            }
        });
        btnDisp=(Button)findViewById(R.id.btnDisp);
        btnDisp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Disp=new Intent(MainActivity.this,MeasuresofDispersion.class);
                startActivity(Disp);
            }
        });
        btnDist=(Button)findViewById(R.id.btnDist);
        btnDist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dist=new Intent(MainActivity.this,TheoriticalDistribution.class);
                startActivity(Dist);
            }
        });
        btnCA=(Button)findViewById(R.id.btnCA);
        btnCA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CA=new Intent(MainActivity.this,CorrelationAnalysis.class);
                startActivity(CA);
            }
        });


    }
}







