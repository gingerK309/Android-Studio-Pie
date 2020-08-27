package com.example.project8_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    EditText diary;
    Button write;
    String fileName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("간단 일기장");
        dp=(DatePicker)findViewById(R.id.date);
        diary=(EditText)findViewById(R.id.diary);
        write=(Button) findViewById(R.id.save);

        Calendar cal= Calendar.getInstance();
        int year =cal.get(Calendar.YEAR);
        int month=cal.get(Calendar.MONTH);
        int day=cal.get(Calendar.DAY_OF_MONTH);
        String existFile= Integer.toString(year)+"_"+Integer.toString(month+1)+"_"+Integer.toString(day)
                +".txt";
        String readTxt= readDiary(existFile);
        diary.setText(readTxt);
        write.setEnabled(true);

        dp.init(year, month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                fileName=Integer.toString(year)+"_"+Integer.toString(monthOfYear+1)+"_"+Integer.toString(dayOfMonth)
                        +".txt";
                String str = readDiary(fileName);
                diary.setText(str);
                write.setEnabled(true);
            }
        });

        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    FileOutputStream output = openFileOutput(fileName,Context.MODE_PRIVATE);
                    String str = diary.getText().toString();
                    output.write(str.getBytes());
                    output.close();
                    Toast.makeText(getApplicationContext(),fileName+"이 저장됨",Toast.LENGTH_SHORT).show();
                } catch (IOException e){

                }
            }
        });

    }
    String readDiary(String fName){
        String text= null;
        FileInputStream input;
        try{
            input= openFileInput(fName);
            byte[] txt = new byte[5000];
            input.read(txt);
            input.close();
            text = (new String(txt)).trim();
            write.setText("수정 하기");
        }catch(IOException e){
            diary.setHint("일기 없음");
            write.setText("새로 저장");
        }
        return text;
    }
}