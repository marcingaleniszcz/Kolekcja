package Kolekcjaa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ListaInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();
        List<Integer> lista1 = new ArrayList<>();
        System.out.println("podaj wartosci:");
        for (int i = 0; i < 5 ; i++) {
            lista1.add(Integer.parseInt(scanner.nextLine()));

        }
        System.out.println(lista1);

    }
}
