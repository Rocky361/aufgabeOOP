package bfw.de;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Film film1 = new Film("Das Schweigen der Lämmer", "1991", 118, "Jonathan Demme");
        Film film2 = new Film("Die Mnster AG", "2002", 80, "Pete Docter");
        Film film3 = new Film("Good Fellas", "1995", 146, "");

        ArrayList<Film> filmArray = new ArrayList<>();
        filmArray.add(film1);
        filmArray.add(film2);
        filmArray.add(film3);

        for (Film filmArray1 : filmArray){
            filmArray1.getFilm();
        }

       /* film1.getFilm();
        film2.getFilm();
        film3.getFilm();*/

        film2.setName("Die Monster AG");
        film2.setLaengeInMinuten(92);
        film3.setErscheinungsJahr("1990");
        film3.setRegisseur("Martin Scorsese");

        System.out.println("-----KORRIGIERT-----");

        for (Film filmArray1 : filmArray){
            filmArray1.getFilm();
        }

        /*film1.getFilm();
        film2.getFilm();
        film3.getFilm();*/

    }
}