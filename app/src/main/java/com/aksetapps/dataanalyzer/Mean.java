package com.aksetapps.dataanalyzer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Mean extends AppCompatActivity {

    Button btn;
    TextView tv;
    EditText et;
    String[] str;
    String s1,s2,s3,s4,s5,s6,s7;
    int int1,int2,int3,int4,int5,int6,int7,mean;
    String meanStr;
    String str1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_mean);
        btn=(Button)findViewById(R.id.btn);
        tv=(TextView)findViewById(R.id.tv);
        et=(EditText)findViewById(R.id.et);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1=et.getText().toString();
                str=str1.split("\\s+");
                s1=str[0];
                s2=str[1];
                s3=str[2];
                s4=str[3];
                s5=str[4];
                s6=str[5];
                s7=str[6];
                int1=Integer.parseInt(s1);
                int2=Integer.parseInt(s2);
                int3=Integer.parseInt(s3);
                int4=Integer.parseInt(s4);
                int5=Integer.parseInt(s5);
                int6=Integer.parseInt(s6);
                int7=Integer.parseInt(s7);
                mean=(int1+int2+int3+int4+int5+int6+int7)/7;
                meanStr=String.valueOf(mean);
                Log.v("hello",s1);
                tv.setText(meanStr);
            }
        });



    }

}

