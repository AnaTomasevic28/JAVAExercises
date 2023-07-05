package Pastebin.Pastebin.Liste;

import java.util.ArrayList;
import java.util.Arrays;

// 6.* Napisati funkciju koja trazi najveci element medju tri ArrayListe.
public class PostebinListe6 {

    static int najveciOdTri(ArrayList<Integer> lista1, ArrayList<Integer> lista2, ArrayList<Integer> lista3){

        int max1 = maximum (lista1);
        int max2 = maximum (lista2);
        int max3 = maximum (lista3);

        int maximum = max1;

        if (max1 < max2){
            maximum = max2;
        }
        if (max2 < max3){
            maximum = max3;
        }

    return maximum;
    }

    static int maximum(ArrayList<Integer> lista){

        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < lista.size (); i++) {
            if (lista.get (i) > maximum){
                maximum = lista.get (i);
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<> (Arrays.asList (1,2,3,4,5));

        ArrayList<Integer> lista2 = new ArrayList<> (Arrays.asList (6,7,8,9,10));

        ArrayList<Integer> lista3 = new ArrayList<> (Arrays.asList (1,3,5,7,9,11));

        System.out.println (najveciOdTri (lista1, lista2, lista3));
    }
}
