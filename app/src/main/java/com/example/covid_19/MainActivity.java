package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button but1;
    private Button b1;
    private Button bu1;
    private Button bu2;
    private Button bu3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bu1=(Button)findViewById(R.id.b1);
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,What.class);
                startActivity(intent);
            }
        });
        bu2=(Button)findViewById(R.id.b2);
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Mythbust.class);
                startActivity(intent);
            }
        });
        bu3=(Button)findViewById(R.id.b3);
        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Whatact.class);
                startActivity(intent);
            }
        });
    }
    public void browser2(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.coronatracker.com/country/india/"));
        startActivity(browserIntent);
    }
}