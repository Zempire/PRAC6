package com.example.gino.prac6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class Q2Activity extends AppCompatActivity implements View.OnClickListener {

    Button firstBtn, secondBtn, thirdBtn, fourthBtn;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);

        firstBtn = findViewById(R.id.firstBtn);
        secondBtn = findViewById(R.id.secondBtn);
        thirdBtn = findViewById(R.id.thirdBtn);
        fourthBtn = findViewById(R.id.fourthBtn);
        progressBar = findViewById(R.id.progressBar);

        firstBtn.setOnClickListener(this);
        secondBtn.setOnClickListener(this);
        thirdBtn.setOnClickListener(this);
        fourthBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.firstBtn:
                progressBar.setProgress(25);
                break;
            case R.id.secondBtn:
                progressBar.setProgress(50);
                break;
            case R.id.thirdBtn:
                progressBar.setProgress(75);
                break;
            case R.id.fourthBtn:
                progressBar.setProgress(100);
                break;
            default:
                break;
        }
    }
}
