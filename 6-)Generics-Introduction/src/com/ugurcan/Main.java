package com.ugurcan;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("Ugurcan");
        items.add(4);
        items.add(5);

        List items1 = new ArrayList<>();
        //You are able to add two different type without having an error on compiling.
        //This is not possible with generics as you have to define the type.
        items1.add(1);
        items1.add("Ugurcan");

        
        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for(int i : n) {
            System.out.println( i * 2);
        }
    }
}
