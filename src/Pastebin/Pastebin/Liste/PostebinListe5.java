package Pastebin.Pastebin.Liste;

import java.util.ArrayList;
import java.util.Arrays;

//5. Napisati funkciju koja vraca drugi najmanji element iz ArrayListe.
// (Pretpostaviti da ce prosledjena ArrayLista uvek da ima barem 3 elementa).
public class PostebinListe5 {

    static int drugiNajmanji(ArrayList<Integer> lista){

        int min = minimum (lista);

        for (int i = 0; i < lista.size (); i++) {
            if (lista.get (i) == min){
                lista.remove (lista.get (i));
            }
        }

        return minimum (lista);
    }
    static int minimum (ArrayList<Integer> lista){
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < lista.size (); i++) {
            if (lista.get (i) < minimum){
                minimum = lista.get (i);
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<> (Arrays.asList (1,2,3,4,5));

        System.out.println (lista);

        System.out.println (drugiNajmanji (lista));
    }
}
