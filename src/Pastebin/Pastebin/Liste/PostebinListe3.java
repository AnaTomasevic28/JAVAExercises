package Pastebin.Pastebin.Liste;

// 3. Napisati funkciju koja proverava da li su dve double ArrayListe potpuno iste.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PostebinListe3 {

    static void daLiSuIste(List<Integer> lista1, List<Integer> lista2){
        System.out.println (lista1.equals (lista2));
    }


    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<> (Arrays.asList (1,2,3,4,5));

        ArrayList<Integer> lista2 = new ArrayList<> (Arrays.asList (1,2,3,4,5,6));

        daLiSuIste (lista1, lista2);
    }
}
