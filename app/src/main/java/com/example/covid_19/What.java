package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class What extends AppCompatActivity {
    private Button but;
    private Button ne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what);
        but=(Button)findViewById(R.id.button2);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(What.this,MainActivity.class);
                startActivity(intent);
            }
        });
        ne=(Button)findViewById(R.id.button3);
        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(What.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}