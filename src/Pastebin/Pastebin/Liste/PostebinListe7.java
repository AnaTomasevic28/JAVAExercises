package Pastebin.Pastebin.Liste;

import java.util.ArrayList;
import java.util.Arrays;

//7. Napisati funkciju koja prima dve ArrayListe i vraca listu dobijenu nadovezivanjem druge liste na prvu.
public class PostebinListe7 {

    static ArrayList<Integer> nadovezivanjeListi (ArrayList<Integer> lista1, ArrayList<Integer> lista2){

        for (int i = 0; i < lista2.size (); i++) {
            lista1.add (lista2.get (i));
        }

        return lista1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<> (Arrays.asList (1,2,3,4,5));

        ArrayList<Integer> lista2 = new ArrayList<> (Arrays.asList (6,7,8,9,10));

        System.out.println (nadovezivanjeListi (lista1, lista2));
    }
}
