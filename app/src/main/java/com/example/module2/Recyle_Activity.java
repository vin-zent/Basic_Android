package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Recyle_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyle);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        setAdapter(recyclerView);
    }

    private void setAdapter(RecyclerView recyclerView) {
        List<ModelPerson> modelPersonList = new ArrayList<>();
        AdapterPerson adapterPerson = new AdapterPerson(modelPersonList, this);

        recyclerView.setAdapter(adapterPerson);
        ModelPerson person = new ModelPerson("Mario ", "abc@email.com", R.drawable.abc);
        modelPersonList.add(person);
        person = new ModelPerson("Peter", "abc@email.com", R.drawable.abc);
        modelPersonList.add(person);
        person = new ModelPerson("Anna", "abc@email.com", R.drawable.abc);
        modelPersonList.add(person);
        person = new ModelPerson("Paul", "abc@email.com", R.drawable.abc);
        modelPersonList.add(person);
        person = new ModelPerson("abc", "abc@email.com", R.drawable.abc);
        modelPersonList.add(person);
        person = new ModelPerson("efg", "abc@email.com", R.drawable.abc);
        modelPersonList.add(person);
        person = new ModelPerson("hijk", "abc@email.com", R.drawable.abc);
        modelPersonList.add(person);
        person = new ModelPerson("lmnop", "abc@email.com", R.drawable.abc);
        modelPersonList.add(person);
        person = new ModelPerson("qrst", "abc@email.com", R.drawable.abc);
        modelPersonList.add(person);
    }

}
