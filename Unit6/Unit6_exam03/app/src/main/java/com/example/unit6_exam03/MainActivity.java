package com.example.unit6_exam03;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost=getTabHost();

        TabHost.TabSpec dog = tabHost.newTabSpec("DOG").setIndicator("강아지");
        dog.setContent(R.id.tabDog);
        tabHost.addTab(dog);

        TabHost.TabSpec cat = tabHost.newTabSpec("CAT").setIndicator("고양이");
       cat.setContent(R.id.tabCat);
        tabHost.addTab(cat);

        TabHost.TabSpec rabbit = tabHost.newTabSpec("RABBIT").setIndicator("토끼");
        rabbit.setContent(R.id.tabRabbit);
        tabHost.addTab(rabbit);

        TabHost.TabSpec horse = tabHost.newTabSpec("HORSE").setIndicator("말");
        horse.setContent(R.id.tabHorse);
        tabHost.addTab(horse);


        tabHost.setCurrentTab(0);

    }
}