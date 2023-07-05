package nedelja3.Ponedeljak;

/*
    1. Napisati funkciju koja prima ArrayListu integera i vraca ArrayListu ciji su elementi duplirani u odnosu na
 	proslednjenju ArrayListu.
    2. Napisati funkciju koja vraca najveci element iz ArrayListe.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZadaciListe {
// 1)

static List<Integer> dupliraniElementi(List<Integer> lista){

    List<Integer> duplaLista = new ArrayList<>(lista.size ());

    System.out.println (lista.size ());

    for (int i = 0; i < lista.size (); i++) {
        duplaLista.add (lista.get (i) * 2);
    }

//    duplaLista.add (lista.get (0)*2);
//    duplaLista.add (lista.get (1)*2);
//    duplaLista.add (lista.get (2)*2);
//    duplaLista.add (lista.get (3)*2);
//    duplaLista.add (lista.get (4)*2);

    return duplaLista;
}

static int maximum (List<Integer> lista){

    int maximum = Integer.MIN_VALUE;

    for (int i = 0; i < lista.size (); i++) {
        if (lista.get(i) > maximum){
            maximum = lista.get (i);
        }
    }
    return maximum;
}

//3. Napisati funkciju koja prima ArrayListu integera i niz integera
// i u prosledjenu listu dodaje sve elemente iz prosledjenog niza.

    static void dodajElemente(List<Integer> lista, int[] niz){
        for (int i = 0; i < niz.length; i++) {
            lista.add (niz[i]);
        }

    }

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<> (Arrays.asList (1,2,3,4,5));
        System.out.println (dupliraniElementi (lista));

        System.out.println (maximum (lista));

        int[] niz = {6,7,8,9,10};

        dodajElemente (lista, niz);

        System.out.println (lista);
    }
}
