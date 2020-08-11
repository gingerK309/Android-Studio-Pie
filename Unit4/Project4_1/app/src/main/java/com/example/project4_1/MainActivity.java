package com.example.project4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1,edit2;
    Button add,sub,mul,div,remind;
    TextView txtRes;
    String num1,num2;
    float result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기(수정)");
        edit1=(EditText) findViewById(R.id.Edit1);
        edit2=(EditText)findViewById(R.id.Edit2);
        add=(Button)findViewById(R.id.btnAdd);
        sub=(Button)findViewById(R.id.btnSub);
        mul=(Button)findViewById(R.id.btnMul);
        div=(Button)findViewById(R.id.btnDiv);
        remind=(Button)findViewById(R.id.btnRm);
        txtRes=(TextView)findViewById(R.id.TextResult);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=edit1.getText().toString();
                num2= edit2.getText().toString();
                if(num1.isEmpty()||num2.isEmpty()) Toast.makeText(getApplicationContext(),"값을 입력해주세요!",Toast.LENGTH_LONG).show();
                else {result=Float.parseFloat(num1)+Float.parseFloat(num2);
                txtRes.setText("계산 결과 : "+result);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=edit1.getText().toString();
                num2= edit2.getText().toString();
                if(num1.isEmpty()||num2.isEmpty()) Toast.makeText(getApplicationContext(),"값을 입력해주세요!",Toast.LENGTH_LONG).show();
                else {result=Float.parseFloat(num1)-Float.parseFloat(num2);
                txtRes.setText("계산 결과 : "+result);
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=edit1.getText().toString();
                num2= edit2.getText().toString();
                if(num1.isEmpty()||num2.isEmpty()) Toast.makeText(getApplicationContext(),"값을 입력해주세요!",Toast.LENGTH_LONG).show();
                else {
                    result=Float.parseFloat(num1)*Float.parseFloat(num2);
                txtRes.setText("계산 결과 : "+result);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=edit1.getText().toString();
                num2= edit2.getText().toString();
                if(num1.isEmpty()||num2.isEmpty()) Toast.makeText(getApplicationContext(),"값을 입력해주세요!",Toast.LENGTH_LONG).show();
                else if(Float.parseFloat(num2)==0){
                    Toast.makeText(getApplicationContext(),"0으로 나눌 수 없습니다.",Toast.LENGTH_LONG).show();
                }
                else {
                    result=Float.parseFloat(num1)/Float.parseFloat(num2);
                txtRes.setText("계산 결과 : "+String.format("%.2f",result));}
            }
        });
        remind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=edit1.getText().toString();
                num2= edit2.getText().toString();
                if(num1.isEmpty()||num2.isEmpty()) Toast.makeText(getApplicationContext(),"값을 입력해주세요!",Toast.LENGTH_LONG).show();
                else {result=Float.parseFloat(num1)%Float.parseFloat(num2);
                txtRes.setText("계산 결과 : "+result);}
            }
        });
    }
}