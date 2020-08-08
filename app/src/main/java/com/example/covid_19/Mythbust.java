package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mythbust extends AppCompatActivity {
    private Button but;
    private Button but2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mythbust);
        but=(Button)findViewById(R.id.beh);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mythbust.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        but2=(Button)findViewById(R.id.beh1);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mythbust.this,Whatact.class);
                startActivity(intent);
            }
        });
    }
}