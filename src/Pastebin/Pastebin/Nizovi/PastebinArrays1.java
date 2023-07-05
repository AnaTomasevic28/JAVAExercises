package Pastebin.Pastebin.Nizovi;

import java.util.Scanner;


public class PastebinArrays1 {
    /*
    * 1. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati taj niz u obrtnutom redosledu
Primer: [4, 2, 3, 5] -> 5 3 2 4
     * b) Napraviti funkciju koja ispisuje dat niz u obrnutom redosledu.
     */

    static void ispisiObrnutiRasporedNiza (int[] niz){
        for (int i = niz.length - 1; i >=0 ; i--) {
            System.out.print(niz[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println ("Molimo unesite duzinu niza: ");
        int n = sc.nextInt ();

        int [] niz = new int[n];

        for (int i = 0; i < n; i++){
            niz [i] = sc.nextInt ();
        }

        /*for (int i = 0; i < niz.length ; i++){
            System.out.print (niz [i] + " ");
        }



        for ( int i = niz.length - 1; i >= 0; i--){
            System.out.print (niz [i] + " ");
        }

         */

        ispisiObrnutiRasporedNiza (niz);
    }
}
