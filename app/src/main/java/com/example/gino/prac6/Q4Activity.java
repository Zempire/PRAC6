package com.example.gino.prac6;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Q4Activity extends AppCompatActivity {

    EditText googleAddress;
    Button openMapBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);

        googleAddress = findViewById(R.id.googleAddress);
        openMapBtn = findViewById(R.id.openMapBtn);

        openMapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onMapClicked();
            }
        });
    }

    public void onMapClicked() {
        String url = String.format("geo:0,0?q=" + googleAddress.getText().toString());
        Uri gmmIntentUri = Uri.parse(url);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}
