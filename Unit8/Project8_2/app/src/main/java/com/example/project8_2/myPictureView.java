package com.example.project8_2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.Nullable;

import static androidx.core.content.ContextCompat.getSystemService;

public class myPictureView  extends View {

    String imagePath = null;
    public myPictureView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);


    }
    @Override
    protected  void onDraw(Canvas canvas){
        super.onDraw(canvas);
        if(imagePath!=null){
            Bitmap bitmap = BitmapFactory.decodeFile(imagePath);
            canvas.drawBitmap(bitmap,getWidth()/29,getHeight()/5,null);
            bitmap.recycle();
        }
    }

}
