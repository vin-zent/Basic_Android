package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class AysncProgress extends AppCompatActivity {
    Button progressdwld;
    ProgressBar asyProgress;
    TextView pertxt;
    static int ic = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aysnc_progress);

        progressdwld = (Button) findViewById(R.id.asyncdwld);
        asyProgress = (ProgressBar) findViewById(R.id.proAsync);
        pertxt = (TextView) findViewById(R.id.percentagea);

        progressdwld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AsyncClassEx AsyncTask =new AsyncClassEx();
                AsyncTask.execute();


            }
        });

    }
    class AsyncClassEx extends AsyncTask<Integer,Integer,String>  {
        @Override
        protected void onPreExecute() {
            asyProgress.setVisibility(View.VISIBLE);
            pertxt.setVisibility(View.VISIBLE);
        }


        @Override
        protected String doInBackground(Integer...integers) {
            for(int i=0;i<=100;i++){
                ic=i;
                asyProgress.setProgress(ic);
//                pertxt.setText(ic+"%");

                try {
                    Thread.sleep(100);
//                    pertxt.setText(ic+"%");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                pertxt.setText(ic+"%");
            }
//            pertxt.setText(ic+"%");
            return "complete";
        }

        @Override
        protected void onPostExecute(String o) {
//            pertxt.setText(ic+"%");

            if(ic==100){
                Toast.makeText(getApplicationContext(),"dwld comlpt",Toast.LENGTH_SHORT).show();
                asyProgress.setVisibility(View.INVISIBLE);
                pertxt.setVisibility(View.INVISIBLE);
            }
            super.onPostExecute(o);
        }
    }

}