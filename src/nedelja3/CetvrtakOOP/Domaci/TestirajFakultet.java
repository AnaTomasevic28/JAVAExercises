package nedelja3.CetvrtakOOP.Domaci;

import java.util.ArrayList;
import java.util.Arrays;

public class TestirajFakultet {
    public static void main(String[] args) {

        Departman matematika = new Departman ("Matematika", -3, -2);

        System.out.println (matematika);

        matematika.setBrojStudenataDepartmana (25);
        matematika.setBrojStrucnihPredmeta (5);
        System.out.println (matematika);

        Departman biologija = new Departman ("Biologija", 13, 4);
        System.out.println (biologija);

        Departman informatika = new Departman ("Informatika", 9, 7);
        System.out.println (informatika);
        System.out.println ();

        ArrayList<Departman> listaDepartmana = new ArrayList<> (Arrays.asList (matematika, biologija, informatika));

        Fakultet faks = new Fakultet ("Prirodno-matematicki", listaDepartmana);

        System.out.println (faks);
        System.out.println ();

        faks.dodajPredmete ();
        System.out.println (matematika);
        System.out.println (biologija);

        System.out.println ();

        matematika.setBrojStudenataDepartmana (-85);
        System.out.println (matematika);


    }
}
