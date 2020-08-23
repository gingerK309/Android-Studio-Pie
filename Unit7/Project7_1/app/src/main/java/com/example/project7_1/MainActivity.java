package com.example.project7_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout baseLayout;
    ImageView img;
    EditText rotateNum;
    Integer rn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Project7_1");
        baseLayout=(RelativeLayout)findViewById(R.id.baseLayout);
        img= (ImageView)findViewById(R.id.image);
        rotateNum =(EditText)findViewById(R.id.num);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater flater=getMenuInflater();
        flater.inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.img1:
               img.setImageResource(R.drawable.mountain);
               item.setChecked(true);
               return true;
            case R.id.img2:
                img.setImageResource(R.drawable.island);
                item.setChecked(true);
                return true;
            case R.id.img3:
                img.setImageResource(R.drawable.fox);
                item.setChecked(true);
                return true;
            case R.id.rotate:
                rn= Integer.parseInt(rotateNum.getText().toString());
              img.setRotation(rn);
                return  true;
        }

        return false;
    }
}