package com.example.unit4_project01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    CheckBox chk1,chk2,chk3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("연습문제4-7");
        chk1=(CheckBox)findViewById(R.id.chk1);
        chk2=(CheckBox)findViewById(R.id.chk2);
        chk3=(CheckBox)findViewById(R.id.chk3);
        btn=(Button)findViewById(R.id.btn);
        chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chk1.isChecked()==true) btn.setEnabled(true);
                else btn.setEnabled(false);
            }
        });
        chk2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chk2.isChecked()==true) btn.setClickable(true);
                else btn.setClickable(false);
            }
        });
        chk3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chk3.isChecked()==true) btn.setRotation(45);
                else btn.setRotation(0);
            }
        });
    }
}