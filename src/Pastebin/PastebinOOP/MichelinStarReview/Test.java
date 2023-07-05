package Pastebin.PastebinOOP.MichelinStarReview;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Restoran r1 = new Restoran ("Kota 99", 5.0, 3, 55);
//        System.out.println (r1);
        ArrayList<String> recenzije = new ArrayList<> ();
        r1.dodajRecenziju ("Ovaj restoran je dobar.");
        r1.dodajRecenziju ("Ukusna je hrana.");
        r1.dodajRecenziju ("Lepa je usluga.");
//        System.out.println (r1.getRecenzije ());
        Inspektor i1 = new Inspektor (r1);
        String s = "Ovaj restoran je dobar";
        i1.dodajOpis (s);
//        System.out.println (r1);
//        System.out.println (r1);
//        System.out.println (r1.getProsecnaOcena ());
//        System.out.println ("================");
//        r1.dodajOcenu (1.2);
//        System.out.println (r1);
//        r1.dodajOcenu (2);
//        System.out.println (r1);
        r1.dodajOcenu (4.5);
        System.out.println (r1);
//        r1.azurirajZvezdu ();
//        System.out.println (r1);
//        ArrayList<Double> ocene = new ArrayList<> ();
//        ocene.add (1.4);
//        ocene.add (2.7);
//        ocene.add (4.2);
//        r1.dodajViseOcena (ocene);
//        System.out.println (r1.getProsecnaOcena ());
//        System.out.println (r1);
//        i1.dodajOcenu (5);
//        System.out.println (r1);
//        System.out.println ();
    }
}
