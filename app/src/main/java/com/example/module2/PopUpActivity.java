package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PopUpActivity extends AppCompatActivity {
    Button btnpopUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up);

        btnpopUp=(Button) findViewById(R.id.pop);
        btnpopUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup = new PopupMenu(PopUpActivity.this,btnpopUp);
                popup.getMenuInflater().inflate(R.menu.example_menu,popup.getMenu());

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        Toast.makeText(PopUpActivity.this, ""+ menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;

                    }
                });
                popup.show();

            }
        });

    }
}