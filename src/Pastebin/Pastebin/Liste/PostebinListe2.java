package Pastebin.Pastebin.Liste;

import java.util.ArrayList;
import java.util.Arrays;

//2. Napisati funkciju koja prima ArrayListu integera i
//   vraca ArrayListu ciji su elementi duplirani u odnosu na proslednjenju ArrayListu.
public class PostebinListe2 {

    static ArrayList<Integer> dupliranaLista(ArrayList<Integer> lista){

        ArrayList<Integer> resenje = new ArrayList<> ();

        for (int i = 0; i < lista.size (); i++) {
            resenje.add (lista.get (i) * 2);
        }
        return resenje;
    }

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<> (Arrays.asList (1,2,3,4,5));

        System.out.println (dupliranaLista (lista));
    }
}
