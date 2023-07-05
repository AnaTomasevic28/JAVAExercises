package Pastebin.Pastebin.Liste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 4. Napisati funkciju koja vraca najveci element iz ArrayListe.
public class PostebinListe4 {

    static int maximum(List<Integer> lista){
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < lista.size (); i++) {
            if (lista.get (i) > maximum){
                maximum =  lista.get (i);
            }
        }

        return maximum;
    }


    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<> (Arrays.asList (1,2,3,4,5));

        System.out.println (maximum (lista));
    }
}
