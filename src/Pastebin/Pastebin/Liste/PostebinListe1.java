package Pastebin.Pastebin.Liste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1. Napisati fukciju koja prima ArrayListu integera i ispisuje sve njene elemente.
public class PostebinListe1 {

    static void ispisListe (List<Integer> lista){

        System.out.println (lista);

//        for (int i = 0; i < lista.size (); i++) {
//            System.out.print (lista.get (i) + " ");
//        }
//        System.out.println ();

    }

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<> (Arrays.asList (1,2,3,4,5,6));

        ispisListe (lista);
    }
}
