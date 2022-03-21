package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    RelativeLayout rell1;
    LinearLayout rell2;
    Button splsh;
    EditText Usrname,Password;

    Handler handler = new Handler ();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            //My two Relative Layouts
            rell1.setVisibility(View.VISIBLE);
            rell2.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        Usrname =(EditText) findViewById(R.id.usr);
        Password =(EditText) findViewById(R.id.pwd);



        rell1 = (RelativeLayout)findViewById(R.id.rel1);
        rell2 = (LinearLayout)findViewById(R.id.rel2);

        handler.postDelayed(runnable,2000);

        splsh = (Button) findViewById(R.id.splashbtn);
        splsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if(Usrname.getText().toString().equals("admin") && Password.getText().toString().equals("admin")){
                    startActivity(new Intent(MainActivity3.this,MainActivity.class));
//                }
//                else {
//                    Toast.makeText(getApplicationContext(),"Invalid",Toast.LENGTH_SHORT).show();
//                    Usrname.setText("");
//                    Password.setText("");
//                }

            }
        });
        //This is delay for timeout

    }
}