package Pastebin.Pastebin.Nizovi;

import java.util.Scanner;

public class PostebinArrays4 {
    /*
    * 4. -//-. Ispisati svaki treci element u obrnutom redosledu.
    * Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
    *
    * b) Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.
     */

    public static void svakiTreciObrnuti (int[] niz){

        for (int i = niz.length-1; i >= 0; i--) {
            System.out.print (niz[i] + " ");
            i -= 2;
        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println ("Molimo unesite duzinu niza");
        int n = sc.nextInt ();

        int niz [] = new int[n];

        for (int i = 0; i< niz.length; i++) {
            niz [i] = sc.nextInt ();
        }
//
//        for (int i = niz.length - 1; i >= 0; i--){
//            System.out.println (niz [i]);
//            i = i-2;
//        }

        System.out.println ("Svaki treci element niza je: ");
       svakiTreciObrnuti (niz);
    }
}
