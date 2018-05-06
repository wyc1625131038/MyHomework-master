package com.example.hp.myhomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button bn1 = (Button)findViewById(R.id.m1);
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,LinearActivity.class);
                startActivity(intent1);
            }
        });
        Button bn2 = (Button)findViewById(R.id.m2);
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,RelativeActivity.class);
                startActivity(intent2);
            }
        });
        Button bn3 = (Button)findViewById(R.id.m3);
        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this,TableActivity.class);
                startActivity(intent3);
            }
        });
        Button bn4 = (Button)findViewById(R.id.m4);
        bn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this,GridActivity.class);
                startActivity(intent4);
            }
        });
    }
}
