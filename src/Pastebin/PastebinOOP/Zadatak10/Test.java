package Pastebin.PastebinOOP.Zadatak10;

import Pastebin.PastebinOOP.Zadatak13.Osoba;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Film film1 = new Film ("Gordost i predrasude", 2000, 10, "bla bla", 2,0,0);
        Film film2 = new Film ("Betmen", 1997, 10, "bla bla", 2,0,0);

//        System.out.println (film1.equals (film2));

        FilmNaStanju filmNaStanju1 = new FilmNaStanju (film1, 2, 2.0);
        FilmNaStanju filmNaStanju2 = new FilmNaStanju (film2, 1, 2.0);
        ArrayList<FilmNaStanju > katalog = new ArrayList<> ();
        katalog.add (filmNaStanju1);
        katalog.add (filmNaStanju2);
        VideoKlub vk = new VideoKlub ("Zabac", katalog);
//        System.out.println (vk.getKatalog ());
//
////        vk.iznajmiFilm (film2, 2);
////
//        vk.iznajmiFilm (film1, 17);
////        System.out.println (vk.getKatalog ());

        vk.dodajFilm (film1, 3.0);
        vk.dodajFilm (film2, 4.0, 2);
//        System.out.println (vk.getKatalog ());
//        System.out.println (vk.pregledajFilm (film2));
        vk.pregledajKatalog ();

        Korpa korpa = new Korpa ();
        korpa.setVk (vk);
//        korpa.dodajFilmUKorpu (film1);
//        vk.pregledajKatalog ();
        System.out.println (korpa.getUkupnaCena ());
        korpa.dodajFilmUKorpu (film2, 2);
        korpa.dodajFilmUKorpu (film1);
//        vk.pregledajKatalog ();
//        System.out.println (korpa.getUkupnaCena ());
//        korpa.izbaciIzKorpe (film2, 1);
//        korpa.izbaciSveIzKorpe ();
        System.out.println (korpa.getKorpa ());
        System.out.println (korpa.ispisiInventarKorpe ());

        Kupac kupac = new Kupac ("Ana", "Tomasevic", 3);

        kupac.setKorpa (korpa);
        kupac.kupi ();
        kupac.setRacun (20);
        kupac.kupi ();
        System.out.println (kupac.pregledajFilmove ());




    }
}
