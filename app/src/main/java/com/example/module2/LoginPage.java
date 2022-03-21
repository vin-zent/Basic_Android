package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        EditText Usrname,Password;
        Button Login,Clr;

        Usrname = (EditText)findViewById(R.id.editTextTextPersonName);
        Password=(EditText)findViewById(R.id.editTextTextPassword);
        Login = (Button)findViewById(R.id.button);
        Clr =(Button)findViewById(R.id.button2);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Usrname.getText().toString().equals("admin") && Password.getText().toString().equals("1234")){
                    Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Invalid",Toast.LENGTH_SHORT).show();
                }
            }
        });

        Clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Usrname.setText("");
                Password.setText("");
            }
        });

    }
}