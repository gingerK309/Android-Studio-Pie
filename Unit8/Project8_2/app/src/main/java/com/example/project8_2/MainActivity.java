package com.example.project8_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    Button prev,next;
    myPictureView pic;
    int curr;
    File[] imageFiles;
    String imageName;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    setTitle("연습문제8-7");
    ActivityCompat.requestPermissions(this,new String[] {android.Manifest.permission.WRITE_EXTERNAL_STORAGE},MODE_PRIVATE);
    prev=(Button)findViewById(R.id.prev);
    next=(Button) findViewById(R.id.next);
   pic =(myPictureView)findViewById(R.id.myPictureView);
    txt=(TextView)findViewById(R.id.num);

    imageFiles=new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/Pictures").listFiles();
    imageName = imageFiles[0].toString();

    txt.setText((curr+1)+"/"+imageFiles.length);
    pic.imagePath = imageName;

     prev.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             if(curr<=0){
                 curr=imageFiles.length-1;
                 imageName =imageFiles[curr].toString();
                 pic.imagePath = imageName;
                 pic.invalidate();

             }
             else{
                 curr--;
                 imageName =imageFiles[curr].toString();
                 pic.imagePath = imageName;
                 pic.invalidate();

             }
             txt.setText((curr+1)+"/"+imageFiles.length);
         }
     });
     next.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             if(curr>=imageFiles.length-1){
                 curr=0;
                 imageName =imageFiles[curr].toString();
                 pic.imagePath = imageName;
                 pic.invalidate();
             } else{
                 curr++;
                 imageName=imageFiles[curr].toString();
                 pic.imagePath=imageName;
                 pic.invalidate();

             }    txt.setText((curr+1)+"/"+imageFiles.length);
         }
     });

    }

}