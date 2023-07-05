package Pastebin.PastebinOOP.Zadatak7;

import Pastebin.PastebinOOP.Zadatak1.Osoba;

public class Voznja {
    public static void main(String[] args) {

        Osoba o = new Osoba ("Marko", "Milovanovic");

        Automobil a1 = new Automobil ("Skoda", "Oktavia", 123456, o);
        System.out.println (a1);

        System.out.println (a1.getVlasnik ());
        a1.setVlasnik (new Osoba ("Ana", "Tomasevic"));
        System.out.println (a1.getVlasnik ());
        System.out.println ("==================================");

        Automobil a2 = new Automobil ("Dacia", "Logan", 456789);
        System.out.println (a2);

        System.out.println (a2.getVlasnik ());
        a2.setVlasnik (o);
        System.out.println (a2.getVlasnik ());

        System.out.println (a2.getMarka ());
        System.out.println (a2.getModel ());
        System.out.println (a2.getSerijskiBroj ());

    }
}
