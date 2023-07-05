package Pastebin.Pastebin.Liste;

import java.util.ArrayList;
import java.util.Arrays;

//9. Napisati funkciju koja vraca proizvod svih elemenata uvecanih za 3 iz ArrayListe.
public class PostebinListe9 {

    static int proizvodPlusTri(ArrayList<Integer> lista){

        elementiPlusTri (lista);

        int proizvod = 1;

        for (int i = 0; i < lista.size (); i++) {
            proizvod *= lista.get (i);
        }

        return proizvod;
    }

    static ArrayList<Integer> elementiPlusTri(ArrayList<Integer> lista){

        for (int i = 0; i <lista.size (); i++) {
            lista.set(i, (lista.get (i) + 3));
        }

        return lista;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<> (Arrays.asList (-1,-1,-1));

        System.out.println (proizvodPlusTri (lista1));
    }
}
