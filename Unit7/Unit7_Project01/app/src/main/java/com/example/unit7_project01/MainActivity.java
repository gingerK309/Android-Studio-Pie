package com.example.unit7_project01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
LinearLayout baseLayout;
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("연습문제7-4");
        baseLayout=(LinearLayout)findViewById(R.id.baseLayout);
        img= (ImageView)findViewById(R.id.image);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(0,1,0,"강아지");
        menu.add(0,2,0,"고양이");
        menu.add(0,3,0,"토끼");
        return  super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case 1:
                img.setImageResource(R.drawable.dog);
                return true;
            case 2:
                img.setImageResource(R.drawable.cat);
                return true;
            case 3:
                img.setImageResource(R.drawable.rabbit);
                return true;

        }

        return false;
    }
}