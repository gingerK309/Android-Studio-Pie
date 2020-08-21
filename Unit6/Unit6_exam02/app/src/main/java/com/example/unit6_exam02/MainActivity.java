package com.example.unit6_exam02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start,stop;
        final ViewFlipper vflip;
        start=(Button)findViewById(R.id.start);
        stop=(Button)findViewById(R.id.stop);
        vflip=(ViewFlipper)findViewById(R.id.flip);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vflip.startFlipping();
                vflip.setFlipInterval(1000);
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vflip.stopFlipping();
            }
        });
    }
}