package com.example.gino.prac6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView q1, q2, q3, q4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        q1 = findViewById(R.id.question1);
        q2 = findViewById(R.id.question2);
        q3 = findViewById(R.id.question3);
        q4 = findViewById(R.id.question4);

        q1.setOnClickListener(this);
        q2.setOnClickListener(this);
        q3.setOnClickListener(this);
        q4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.question1:
                Intent Q1Intent = new Intent(MainActivity.this, Q1Activity.class);
                startActivity(Q1Intent);
                break;
            case R.id.question2:
                Intent Q2Intent = new Intent(MainActivity.this, Q2Activity.class);
                startActivity(Q2Intent);
                break;
            case R.id.question3:
                Intent Q3Intent = new Intent(MainActivity.this, Q3Activity.class);
                startActivity(Q3Intent);
                break;
            case R.id.question4:
                Intent Q4Intent = new Intent(MainActivity.this, Q4Activity.class);
                startActivity(Q4Intent);
                break;
        }
    }
}
