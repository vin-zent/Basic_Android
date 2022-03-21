package com.example.module2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ContextActivity extends AppCompatActivity {
    Button ContextButton;

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("Select An item");
        menu.add(0,v.getId(),0,"item1");
        menu.add(0,v.getId(),0,"item2");
        menu.add(0,v.getId(),0,"item#");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getTitle()=="item1"){
            Toast.makeText(this, "item1 clicked", Toast.LENGTH_SHORT).show();
        }
        else if (item.getTitle()=="item2"){
            Toast.makeText(this, "item2 clicked", Toast.LENGTH_SHORT).show();
        }
        else if (item.getTitle()=="item3"){
            Toast.makeText(this, "item3 clicked", Toast.LENGTH_SHORT).show();
        }
        else{
            return false;
        }

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context);

        ContextButton=findViewById(R.id.Longbtn);

        ContextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerForContextMenu(ContextButton);
            }
        });




    }
}