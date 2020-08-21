package com.example.project6_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    Chronometer cm;
    LinearLayout touch;

    RadioButton cal,time;
   DatePicker datePick;
    TimePicker timePick;
    TextView year,month,day,hour,minute;
    int selectYear,selectMonth,selectDay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("시간 예약");
        touch=(LinearLayout)findViewById(R.id.touch);
        cm= (Chronometer)findViewById(R.id.cm);
        cal=(RadioButton)findViewById(R.id.date);
        time=(RadioButton)findViewById(R.id.time);
        datePick=(DatePicker) findViewById(R.id.datePick);
        timePick=(TimePicker)findViewById(R.id.timePick);
        year=(TextView)findViewById(R.id.year);
        month=(TextView)findViewById(R.id.month);
        day=(TextView)findViewById(R.id.day);
        hour=(TextView)findViewById(R.id.hour);
        minute=(TextView)findViewById(R.id.minute);
        cal.setVisibility(View.INVISIBLE);
        time.setVisibility(View.INVISIBLE);
        timePick.setVisibility(View.INVISIBLE);
        datePick.setVisibility(View.INVISIBLE);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timePick.setVisibility(View.INVISIBLE);
                datePick.setVisibility(View.VISIBLE);
            }
        });
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timePick.setVisibility(View.VISIBLE);
                datePick.setVisibility(View.INVISIBLE);
            }
        });
        cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cm.setBase(SystemClock.elapsedRealtime());
                cm.start();
                cm.setTextColor(Color.RED);
                cal.setVisibility(View.VISIBLE);
                time.setVisibility(View.VISIBLE);
            }
        });

        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cm.stop();
                cm.setTextColor(Color.BLUE);
                year.setText(Integer.toString(datePick.getYear()));
                month.setText(Integer.toString(datePick.getMonth()));
                day.setText(Integer.toString(datePick.getDayOfMonth()));
                hour.setText(Integer.toString(timePick.getCurrentHour()));
                minute.setText(Integer.toString(timePick.getCurrentMinute()));
                timePick.setVisibility(View.INVISIBLE);
                datePick.setVisibility(View.INVISIBLE);
                cal.setVisibility(View.INVISIBLE);
                time.setVisibility(View.INVISIBLE);
            }
        });

    }
}