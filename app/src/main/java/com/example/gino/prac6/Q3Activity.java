package com.example.gino.prac6;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Q3Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView playBtn, pauseBtn;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);

        playBtn = findViewById(R.id.playBtn);
        pauseBtn = findViewById(R.id.pauseBtn);

        mediaPlayer = MediaPlayer.create(Q3Activity.this, R.raw.lacrimosa);

        playBtn.setOnClickListener(this);
        pauseBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.playBtn:
                mediaPlayer.start();
                playBtn.setVisibility(View.GONE);
                pauseBtn.setVisibility(View.VISIBLE);
                break;
            case R.id.pauseBtn:
                mediaPlayer.pause();
                playBtn.setVisibility(View.VISIBLE);
                pauseBtn.setVisibility(View.GONE);
                break;
        }
    }
}
