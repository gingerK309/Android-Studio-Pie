package com.example.project7_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout baseLayout;
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("배경색 바꾸기(컨텍스트 메뉴)");
        baseLayout =(LinearLayout)findViewById(R.id.baseLayout);
        btn1=(Button)findViewById(R.id.btn1);
        registerForContextMenu(btn1);
        btn2=(Button)findViewById(R.id.btn2);
        registerForContextMenu(btn2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        if(v==btn1) {
            menu.add(0, 1, 0, "배경색(빨강)");
            menu.add(0, 2, 0, "배경색(초록)");
            menu.add(0, 3, 0, "배경색(파랑)");
        }
        if(v==btn2) {
            menu.add(0,4,0,"버튼 45전 회전");
            menu.add(0,5,0,"버튼 크기 2배");
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case 1:
                baseLayout.setBackgroundColor(Color.rgb(255,102,102));
                return  true;
            case 2:
                baseLayout.setBackgroundColor(Color.rgb(51,255,102));
                return true;
            case 3:
                baseLayout.setBackgroundColor(Color.rgb(0,153,255));
                return true;
            case 4:
                btn2.setRotation(45);
                return true;
            case 5:
                btn1.setScaleX(2);
                btn2.setScaleX(2);
                return true;
        }
        return false;
    }
}