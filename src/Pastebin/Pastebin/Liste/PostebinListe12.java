package Pastebin.Pastebin.Liste;

//12. Napisati funkciju koja vraca najduzi String iz ArrayListe Stringova.

import java.util.ArrayList;
import java.util.Arrays;

public class PostebinListe12 {

    static String najduziString(ArrayList<String> lista){
        String najduzi = "";

        //System.out.println (najduzi.length ());

        for (int i = 0; i < lista.size (); i++) {
            if (lista.get (i).length () > najduzi.length ()){
                najduzi = lista.get (i);
            }
        }

        return najduzi;
    }

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<> (Arrays.asList ("Ana", "mama", "Pavle", "Pakitosinjo", "Dunja", "Dalibor"));

        System.out.println (najduziString (lista));
    }
}
