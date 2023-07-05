package nedelja4.Utorak.Domaci;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Tocak> lista = new ArrayList<> ();
        lista.add (new Tocak(400 ) );
        lista.add (new Tocak (100));
        lista.add (new Tocak (205));
        //lista.add (new Tocak (25));

        Motor m = new Motor (lista, 2000,2000 );
        //System.out.println (m);

       // m.removeOstecenu ();
//        for (int i = 0; i < m.getListaTockova ().size (); i++) {
//            System.out.println (m.daLiJeOstecen (m.getListaTockova ().get (i)));
//        }
//        System.out.println ();
//        m.ubaciRezervnu ();
//        for (int i = 0; i < m.getListaTockova ().size (); i++) {
//            System.out.println (m.daLiJeOstecen (m.getListaTockova ().get (i)));
//        }
//        System.out.println (m.getListaTockova ().get (1));


        Kamion k = new Kamion (lista, 40_000, 2015);
//        System.out.println (k);
//        k.removeOstecenu ();
//
//        System.out.println (k.getListaTockova());
//        k.ubaciRezervnu ();
//        System.out.println (k.getListaTockova ());

        Automobil a = new Automobil (lista, 10000, 2016);
       // System.out.println (a);

        a.daLiJeOstecen ();
        System.out.println (a.getListaTockova ());

        a.removeOstecenu ();
        System.out.println (a.getListaTockova ());






    }
}
