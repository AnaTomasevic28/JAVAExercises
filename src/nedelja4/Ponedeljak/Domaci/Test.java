package nedelja4.Ponedeljak.Domaci;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Sportista aleksandra = new Sportista ("Aleksndra", 1934568799, 1000);
        Sportista dusan = new Sportista ("Dusan", 123456, 2000);
        Sportista ana = new Sportista ("Ana", 456789, 500);

        ArrayList<Sportista> lista = new ArrayList<> ();
        lista.add (aleksandra);
        lista.add (dusan);
        lista.add (ana);

        SportskiKlub manchester = new Manchester (lista, "Beograd", 5000);
        System.out.println (manchester);

        System.out.println (manchester.isplati ());
        System.out.println (manchester.prosecnaPLata ());
        manchester.removePreplaceni ();
        System.out.println (manchester.getClanoviKluba ());

        SportskiKlub klub = new SportskiKlub (lista, "Prokuplje", 1000);
        System.out.println (klub);
        System.out.println (klub.isplati ());
        System.out.println (klub.prosecnaPLata ());
        klub.removePreplaceni ();
        System.out.println (klub);

        Arsenal arsenal = new Arsenal (lista, "Cacak",10000);
        System.out.println (arsenal);

        Spartak spartak = new Spartak (lista, "Prijepolje", 200);
        System.out.println (spartak);



    }
}
