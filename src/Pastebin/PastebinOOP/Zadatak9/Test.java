package Pastebin.PastebinOOP.Zadatak9;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> listaOcena = new ArrayList<> (Arrays.asList (2,5,3,4,5,5,4));
        ArrayList<Integer> listaOcena2 = new ArrayList<> (Arrays.asList (1,2,3,4,5,4,5));
        ArrayList<Integer> listaOcena3 = new ArrayList<> (Arrays.asList (5,5,5,5,5,5,5));

        Ucenik u1 = new Ucenik ("Maja", "Cvetkovic", listaOcena);
        Ucenik u2 = new Ucenik ("Ana", "Tomasevic", listaOcena2);
        Ucenik u3 = new Ucenik ("Srbijanka", "Stankovic", listaOcena3);

        Odeljenje odeljenje = new Odeljenje ("8/2");

        odeljenje.upisiUcenika (u1);
        odeljenje.upisiUcenika (u2);
        odeljenje.upisiUcenika (u3);

        System.out.println (odeljenje.opisnaOcena (u1));
        System.out.println (odeljenje.opisnaOcena (u2));
        System.out.println (odeljenje.opisnaOcena (u3));

//        System.out.println (odeljenje.velicinaOdeljenja ());

//        System.out.println (odeljenje.izlistajDnevnik ());

//        odeljenje.ispisiUcenika (u1);
//        System.out.println (odeljenje);
//        System.out.println (u1.prosek ());
//        System.out.println (u2.prosek ());
//        System.out.println (u3.prosek ());
//
//        System.out.println (odeljenje.prosecnaOcenaOdeljenja ());
        odeljenje.pogledajOcene (1);
    }
}
