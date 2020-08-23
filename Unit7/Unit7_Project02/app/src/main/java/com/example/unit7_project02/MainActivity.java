package com.example.unit7_project02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 Button btn;
 View toastV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("연습문제7-5");
        btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=new Toast(MainActivity.this);
                Display display=((WindowManager)getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
                int x=(int) (Math.random()*display.getWidth());
                int y=(int) (Math.random()*display.getHeight());
                toast.setGravity(Gravity.TOP|Gravity.LEFT,x,y);
                toastV=(View)View.inflate(MainActivity.this,R.layout.toast,null);
                toast.setView(toastV);
                toast.show();

            }
        });
    }
}