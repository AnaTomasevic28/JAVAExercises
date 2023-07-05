package Pastebin.Pastebin.Liste;

import java.util.ArrayList;
import java.util.Arrays;

//10. Napisati funkciju koja vraca sve neparne brojeve iz ArrayListe.
public class PostebinListe10 {

    static void neparniIzListe(ArrayList<Integer> lista){

        for (int i = 0; i < lista.size (); i++) {
            if (lista.get (i) % 2 != 0){
                System.out.print (lista.get (i) + " ");
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<> (Arrays.asList (1,2,3,4,5,6,7));

        neparniIzListe (lista);
    }
}
