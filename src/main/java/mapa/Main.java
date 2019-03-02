package mapa;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Long, Student> map = new TreeMap<>();

        // int - 4bajty - 32 bity
        // long - 8bajtów - 64 bity
        Student s = new Student(101L, "a", "b");
        map.put(s.getIndeks(), s);

        s = new Student(102L, "c", "z");
        map.put(s.getIndeks(), s);

        s = new Student(103L, "g", "x");
        map.put(s.getIndeks(), s);

        s = new Student(104L, "h", "w");
        map.put(s.getIndeks(), s);

        // poprawne wyszukiwanie tylko podając odpowiedni typ
        map.get(101); // == null
        map.get(101L); // == student s

        // metoda nie zadziała, ponieważ kluczem jest Long
        if (map.containsKey(101)) {
            System.out.println(map.get(101)); // nie zadziała
        }

        if (map.containsKey(101L)) {
            System.out.println("Znaleziono: " + map.get(101L));
        } else {
            System.out.println("Nie znalazłem indeksu 101l");
        }

        // wypisanie studenta o indeksie 102L
        System.out.println(map.get(102L));

        System.out.println("Liczba studentów: " + map.size());

        System.out.println("Wypisuję wszystkich studentów:");
        for (Student value : map.values()) {
            System.out.println("Student: " + value);
        }
    }
}