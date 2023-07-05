package Pastebin.Pastebin.Liste;

import java.util.ArrayList;
import java.util.Arrays;

// 8. Napisati funkciju koja vraca zbir svih elemenata iz ArrayListe.
public class PostebinListe8 {

    static int zbirElemenata(ArrayList<Integer> lista){

        int suma = 0;

        for (int i = 0; i < lista.size (); i++) {
            suma += lista.get (i);
        }
        return suma;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<> (Arrays.asList (1,2,3,4,5));

        System.out.println (zbirElemenata (lista1));
    }
}
