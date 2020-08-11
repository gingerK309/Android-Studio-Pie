package com.example.project4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txt1,txt2;
    Switch chk;
    RadioGroup rGroup;
    RadioButton nuga,oreo,pie;
    Button fin,reset;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");
        txt1=(TextView)findViewById(R.id.text1);
        chk=(Switch)findViewById(R.id.chkAgree);
        txt2=(TextView)findViewById(R.id.text2);
        rGroup=(RadioGroup)findViewById(R.id.group);
        nuga=(RadioButton)findViewById(R.id.nuga);
        oreo=(RadioButton)findViewById(R.id.oreo);
        pie=(RadioButton)findViewById(R.id.pie);
        fin=(Button)findViewById(R.id.fin);
        reset=(Button)findViewById(R.id.reset);
        img=(ImageView)findViewById(R.id.image);
        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chk.isChecked()==true){
                    txt2.setVisibility(android.view.View.VISIBLE);
                    rGroup.setVisibility(android.view.View.VISIBLE);
                    img.setVisibility(android.view.View.VISIBLE);
                }
                else{
                    txt2.setVisibility(android.view.View.INVISIBLE);
                    rGroup.setVisibility(android.view.View.INVISIBLE);
                    img.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });
        rGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (rGroup.getCheckedRadioButtonId()){
                    case R.id.nuga:
                        img.setImageResource(R.drawable.nuga);
                        break;
                    case R.id.oreo:
                        img.setImageResource(R.drawable.oreo);
                        break;
                    case R.id.pie:
                        img.setImageResource(R.drawable.pie);
                        break;
                }
            }
        });
        fin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chk.setChecked(false);
                rGroup.clearCheck();
                txt2.setVisibility(android.view.View.INVISIBLE);
                rGroup.setVisibility(android.view.View.INVISIBLE);
                img.setVisibility(android.view.View.INVISIBLE);
            }
        });
    }
}