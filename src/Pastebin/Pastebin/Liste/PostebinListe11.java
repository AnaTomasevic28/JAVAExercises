package Pastebin.Pastebin.Liste;

import java.util.ArrayList;
import java.util.Arrays;

//11. Napisati funkciju koja vraca prosecnu vrednost iz ArrayListe.
public class PostebinListe11 {

    static double prosecnaVrednost(ArrayList<Integer> lista){
        int sum = 0;

        for (int i = 0; i < lista.size (); i++) {
            sum += lista.get (i);
        }

        return sum / (lista.size () * 1.0);
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<> (Arrays.asList (1,2,3,4,5,6));

        System.out.println (prosecnaVrednost (lista));
    }
}
