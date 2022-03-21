package com.example.module2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertActivity extends AppCompatActivity {
    Button Clickhere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        Clickhere =(Button) findViewById(R.id.click);
        Clickhere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder Build = new AlertDialog.Builder(AlertActivity.this);
                Build.setTitle("Confirm Exit!");
                Build.setMessage("Are you sure,You want to exit!") ;

                Build.setIcon(R.drawable.ic_launcher_background);
                Build.setCancelable(false);
                Build.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertActivity.this, "Yes is Clicked", Toast.LENGTH_SHORT).show();
                        finish();

                    }
                });

                Build.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertActivity.this, "No is Clicked", Toast.LENGTH_SHORT).show();
                        dialogInterface.cancel();
                    }
                });

                Build.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertActivity.this, "Cancel is Clicked", Toast.LENGTH_SHORT).show();
                        dialogInterface.cancel();
                    }
                });

                AlertDialog alertt = Build.create();
                alertt.show();

            }
        });
    }
}