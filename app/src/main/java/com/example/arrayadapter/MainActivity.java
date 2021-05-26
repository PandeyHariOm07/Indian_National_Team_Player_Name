package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1 = (TextView)findViewById(R.id.cricket);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CricketTeam.class);
                startActivity(intent);

            }
        });
        TextView textView2 = (TextView)findViewById(R.id.football);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Football.class);
                startActivity(intent);

            }
        });
        TextView textView3 = (TextView)findViewById(R.id.volleyball);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Volleyball.class);
                startActivity(intent);

            }
        });
        TextView textView4 = (TextView)findViewById(R.id.hockey);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Hockey.class);
                startActivity(intent);

            }
        });
    }
}