package com.example.module2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Expandablelistdata {

    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableList = new HashMap<String , List<String>>();

        List<String> Pet_Animals = new ArrayList<String>();
        Pet_Animals.add("Dog");
        Pet_Animals.add("cat");
        Pet_Animals.add("parrot");
        Pet_Animals.add("rabbit");

        List<String> Wild_Animals = new ArrayList<String>();
        Wild_Animals.add("lion");
        Wild_Animals.add("tiger");
        Wild_Animals.add("bear");
        Wild_Animals.add("zebra");


        List<String> Water_Organism = new ArrayList<String>();
        Water_Organism.add("fish");
        Water_Organism.add("crocodile");
        Water_Organism.add("turtle");
        Water_Organism.add("snake");

        expandableList.put("Pet Animals",Pet_Animals);
        expandableList.put("Wild Animals",Wild_Animals);
        expandableList.put("Water organism",Water_Organism);

        return expandableList;
    }

}
