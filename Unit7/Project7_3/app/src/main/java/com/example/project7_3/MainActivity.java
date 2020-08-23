package com.example.project7_3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   EditText name,email;
    Button btn;
    EditText editName,editEmail;
    TextView toast;
    View dialogV,toastV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("사용자 정보 입력");
        name=(EditText) findViewById(R.id.name);
        email=(EditText) findViewById(R.id.email);
        btn=(Button)findViewById(R.id.btn);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogV=(View) View.inflate(MainActivity.this,R.layout.dialog,null);
                AlertDialog.Builder dlg =new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("사용자 정보 입력");
                dlg.setIcon(R.drawable.user);
                dlg.setView(dialogV);
                editName=(EditText)dialogV.findViewById(R.id.dlgEdit1);
                editEmail=(EditText) dialogV.findViewById(R.id.dlgEdit2);
                editName.setText(name.getText().toString());
                editEmail.setText(email.getText().toString());
                dlg.setNegativeButton("취소",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast _toast= new Toast(MainActivity.this);
                                Display display=((WindowManager) getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
                                int x=(int)(Math.random()*display.getWidth());
                                int y=(int)(Math.random()*display.getHeight());
                                _toast.setGravity(Gravity.TOP|Gravity.LEFT,x,y);
                                toastV=(View) View.inflate(MainActivity.this,R.layout.toast,null);
                                toast=(TextView) toastV.findViewById(R.id.txt);
                                toast.setText("취소했습니다");
                                _toast.setView(toastV);
                                _toast.show();
                            }
                        });
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        editName=(EditText) dialogV.findViewById(R.id.dlgEdit1);
                        editEmail=(EditText) dialogV.findViewById(R.id.dlgEdit2);
                        name.setText(editName.getText().toString());
                        email.setText(editEmail.getText().toString());
                    }
                });
                dlg.show();
            }

        });




    }
}