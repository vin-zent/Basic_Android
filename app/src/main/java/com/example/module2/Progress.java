package com.example.module2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Progress extends AppCompatActivity {
    private ProgressBar loading;
    private Button btndownload;
    private int progressStatus=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        Handler handler = new Handler();

        loading=(ProgressBar)findViewById(R.id.progressBar2);

        TextView txt= findViewById(R.id.increaser);
        btndownload = (Button)findViewById(R.id.btndwld);
        btndownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loading.setVisibility(View.VISIBLE);
                txt.setVisibility(View.VISIBLE);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (progressStatus<100){
                            progressStatus+=1;
                            try {
                                Thread.sleep(100);
                            }catch (Exception e){;

                            }
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    loading.setProgress(progressStatus);
                                    txt.setText(progressStatus+"%");
                                    if (progressStatus==100){
                                        loading.setVisibility(View.INVISIBLE);
                                        txt.setVisibility(View.INVISIBLE);

                                        Toast.makeText(getApplicationContext(),"Downloading Completed",Toast.LENGTH_SHORT).show();

                                    }
                                }
                            });

                        }
                    }

                }).start();
                /*txt.setVisibility(View.INVISIBLE);
                loading.setVisibility(View.INVISIBLE);*/

            }
        });
    }

////    @Override
////    public boolean onCreateOptionsMenu(Menu menu) {
////        getMenuInflater().inflate(R.menu.example_menu,menu);
////        return true;
////    }
////
////    @Override
////    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
////        switch (item.getItemId()){
////            case R.id.item1:
////                Intent i= new Intent(Progress.this,SourceCode.class);
////                i.putExtra("sc","wrgwgwihwoihgwohgofj");
////                startActivity(i);
////            default:
////                return super.onOptionsItemSelected(item);
//        }
//    }
}
