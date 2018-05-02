package com.aksetapps.dataanalyzer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class TheoriticalDistribution extends AppCompatActivity {

    Button btnBernolli,btnBinomial,btnPoisson,btnGeometric,btnHyperGeometric,btnContinuos,btnExponential,btnNormal,btnCauchy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theoritical_distribution);
        btnBernolli=(Button)findViewById(R.id.btnBernoulli);
        btnBernolli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bernoulli=new Intent(TheoriticalDistribution.this, com.aksetapps.dataanalyzer.Bernoulli.class);
                startActivity(Bernoulli);
            }
        });
        btnBinomial=(Button)findViewById(R.id.btnBinomial);
        btnBinomial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Binomial=new Intent(TheoriticalDistribution.this, com.aksetapps.dataanalyzer.Binomial.class);
                startActivity(Binomial);
            }
        });
        btnPoisson=(Button)findViewById(R.id.btnPoisson);
        btnPoisson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Poisson=new Intent(TheoriticalDistribution.this, com.aksetapps.dataanalyzer.Poisson.class);
                startActivity(Poisson);
            }
        });
        btnGeometric=(Button)findViewById(R.id.btnGeometric);
        btnGeometric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Geometric=new Intent(TheoriticalDistribution.this, com.aksetapps.dataanalyzer.Geometric.class);
                startActivity(Geometric);
            }
        });
        btnHyperGeometric=(Button)findViewById(R.id.btnHyperGeometric);
        btnHyperGeometric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HyperGeometric=new Intent(TheoriticalDistribution.this, com.aksetapps.dataanalyzer.HyperGeometric.class);
                startActivity(HyperGeometric);
            }
        });
        btnContinuos=(Button)findViewById(R.id.btnContinuos);
        btnContinuos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Continuos=new Intent(TheoriticalDistribution.this, com.aksetapps.dataanalyzer.Continuos.class);
                startActivity(Continuos);
            }
        });
        btnExponential=(Button)findViewById(R.id.btnExponential);
        btnExponential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Exponential=new Intent(TheoriticalDistribution.this, com.aksetapps.dataanalyzer.Exponential.class);
                startActivity(Exponential);
            }
        });
        btnNormal=(Button)findViewById(R.id.btnNormal);
        btnNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Normal=new Intent(TheoriticalDistribution.this, com.aksetapps.dataanalyzer.Normal.class);
                startActivity(Normal);
            }
        });
        btnCauchy=(Button)findViewById(R.id.btnCauchy);
        btnCauchy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Cauchy=new Intent(TheoriticalDistribution.this, com.aksetapps.dataanalyzer.Cauchy.class);
                startActivity(Cauchy);
            }
        });


    }
}


