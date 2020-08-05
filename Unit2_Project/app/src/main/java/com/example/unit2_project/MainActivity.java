package com.example.unit2_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton oreo,pie;
    Button button,button2;
    EditText txt;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(EditText)findViewById(R.id.edit_text);
        button=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
        pie= (RadioButton)findViewById(R.id.pie);
        oreo=(RadioButton)findViewById(R.id.oreo);
        img=(ImageView)findViewById(R.id.imageView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = txt.getText().toString();
                Toast.makeText(getApplicationContext(),text,Toast.LENGTH_LONG).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String uri = txt.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });
        oreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.oreo);
            }
        });
        pie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.pie);
            }
        });
    }
}