package com.javagda23.Kolekcjaa.zad2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt());
        }
        double suma = 0;
        for(Integer integer : list){
            suma+=integer;
        }
        System.out.println("Suma: " + suma);
        System.out.println("Średnia: "+ suma/list.size());
    }
}
