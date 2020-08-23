package com.example.unit7_project03;


import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Button btn;
    RadioGroup rg;
    RadioButton dog,cat,rabbit,horse;
    View dialogV;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=(RadioGroup)findViewById(R.id.group);
        btn=(Button)findViewById(R.id.btn);
        dog=(RadioButton)findViewById(R.id.dog);
        cat=(RadioButton)findViewById(R.id.cat);
        rabbit=(RadioButton)findViewById(R.id.rabbit);
        horse=(RadioButton)findViewById(R.id.horse);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogV=(View) View.inflate(MainActivity.this,R.layout.dialog,null);
                img=(ImageView) dialogV.findViewById(R.id.dlgImage);
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                switch (rg.getCheckedRadioButtonId()){
                    case R.id.dog:
                        dlg.setTitle(dog.getText().toString());
                        img.setImageResource(R.drawable.dog);
                        dlg.setView(dialogV);
                        dlg.setPositiveButton("닫기",null);
                        dlg.show();
                       break;
                    case R.id.cat:
                        dlg.setTitle(cat.getText().toString());
                        img.setImageResource(R.drawable.cat);
                        dlg.setView(dialogV);
                        dlg.setPositiveButton("닫기",null);
                        dlg.show();
                        break;
                    case R.id.rabbit:
                        dlg.setTitle(rabbit.getText().toString());
                        img.setImageResource(R.drawable.rabbit);
                        dlg.setView(dialogV);
                        dlg.setPositiveButton("닫기",null);
                        dlg.show();
                        break;
                    case R.id.horse:
                        dlg.setTitle(horse.getText().toString());
                        img.setImageResource(R.drawable.horse);
                        dlg.setView(dialogV);
                        dlg.setPositiveButton("닫기",null);
                        dlg.show();
                        break;
                }
            }
        });
    }
}