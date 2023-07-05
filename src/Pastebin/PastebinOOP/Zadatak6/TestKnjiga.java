package Pastebin.PastebinOOP.Zadatak6;

import Pastebin.PastebinOOP.Zadatak1.Osoba;

public class TestKnjiga {
    public static void main(String[] args) {

        Osoba o1 = new Osoba ("Pavle", "Tomasevic");
        Osoba o2 = new Osoba ("Dalibor", "Tomasevic");
        Osoba o3 = new Osoba ("Ana", "Tomasevic");

//        Knjiga k1 = new Knjiga ("Poslednje iskusenje",o2, o1, 609, 1955 );
//        System.out.println (k1);
//        System.out.println (k1.velicinaKnjige ());

        Knjiga k2 = new Knjiga ("Pepa", o3, 0, -5);
        System.out.println (k2);

        k2.setBrojStrana (-25);
        k2.setGodinaIzdanja (0);

    }
}
