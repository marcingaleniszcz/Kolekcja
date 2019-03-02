package mapa;


import lombok.Data;


@Data
public class Student {
    private Long indeks;
    private String imie;
    private String nazwisko;

    public Student(Long indeks, String imie, String nazwisko) {
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
}
