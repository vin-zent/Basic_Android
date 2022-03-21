package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button SignIn,toggleButton,Button2,Switchbtn,Imagebtn,CheckBox,Alertbtn,
            SpinnerButton,AutoButton,Buttonrating,btndate,btnTime,btnprogress,stylebtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SignIn = (Button) findViewById(R.id.signin);
        Button2= (Button)findViewById(R.id.Toast);
        toggleButton =(Button)findViewById(R.id.ToggleButton);
        Switchbtn =(Button) findViewById(R.id.ButtonSwitch);
        Imagebtn =(Button) findViewById(R.id.ButtonImage);

        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity2.this,LoginPage.class));
            }
        });


        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,ToastActivity.class));
            }
        });

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,ToggleActivity.class));
            }
        });

        Switchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,SwitchButtton.class));
            }
        });

        Imagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,Imagebutton.class));
            }
        });

        CheckBox = (Button) findViewById(R.id.Buttoncheck);
        CheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,CheckActivity.class));
            }
        });

        Alertbtn = (Button) findViewById(R.id.Alertdialoguebtn);
        Alertbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,AlertActivity.class));
            }
        });

        SpinnerButton =(Button) findViewById(R.id.Spinnerbtn);

        SpinnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,SpinnerActivity.class));
            }
        });

        AutoButton=(Button) findViewById(R.id.AutoComplete);
        AutoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,AutoActivity.class));
            }
        });

        Buttonrating = (Button) findViewById(R.id.RatingButtton);
        Buttonrating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,RatingActivity.class));
            }
        });

        btndate = (Button)findViewById(R.id.dateButton);
        btndate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,DateActivity.class));

            }
        });

        btnTime =(Button)findViewById(R.id.Timebutton);
        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,TimeActivity.class));
            }
        });

        btnprogress=(Button)findViewById(R.id.progress);
        btnprogress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,Progress.class));
            }
        });

        Button asyncBtn =(Button)findViewById(R.id.asyncprogress);
        asyncBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,AysncProgress.class));

            }
        });

        stylebtn=(Button)findViewById(R.id.styles);
        stylebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,styleActivity.class));
            }
        });
        Button btnfrag = findViewById(R.id.fragmentbtn);
        btnfrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,Fragment_Activity.class));
            }
        });

    }
}