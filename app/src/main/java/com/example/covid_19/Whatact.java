package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Whatact extends AppCompatActivity {
    private Button prev;
    private Button home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatact);
        prev=(Button)findViewById(R.id.pre);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Whatact.this,Mythbust.class);
                startActivity(intent);
            }
        });
        home=(Button)findViewById(R.id.ho);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Whatact.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void browser2(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mohfw.gov.in/pdf/PreventionandManagementofCOVID19FLWEnglish.pdf"));
        startActivity(browserIntent);
    }
}