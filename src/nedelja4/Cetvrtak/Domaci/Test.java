package nedelja4.Cetvrtak.Domaci;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Planina p1 = new Planina (1000, "Hisar");
        Planina p2 = new Planina (2000, "Zlatibor");
        Planina p3 = new Planina (3000, "Tara");
        Planina p4 = new Planina (4000, "Bjelasica");

        ArrayList<Planina> lista = new ArrayList<> ();
        lista.add (p4);
        lista.add (p3);
        lista.add (p1);
        lista.add (p2);

        Planinar planinar = new Planinar (lista, 3000, 10);

        System.out.println (planinar);
        System.out.println (planinar.najvecaPlanina ());

        planinar.popniSe (p4);

        System.out.println (planinar.clanarina ());

        System.out.println (planinar.sviUsponi ());
    }
}
