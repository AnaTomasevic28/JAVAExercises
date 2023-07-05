package Pastebin.Pastebin.Nizovi;

import java.util.Scanner;

public class PostebinArrays5 {
    /*
    *
    * 5. -//-. Izracunati proizvod elemenata tog niza.
    * Primer: [2, 4] -> 8
    *
    * b) Napisati funkciju koja racuna proizvod elemenata zadatog niza.
    * */

    static int proizvod (int[] niz){
        int proizvod = 1;

        for (int i = 0; i < niz.length; i++) {
            proizvod *= niz[i];
        }
        return proizvod;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println ("Molim unesite duzinu niza");
        int n = sc.nextInt ();

        System.out.println ("Molim unesite brojeve: ");
        int [] niz = new int[n];

        for (int i = 0; i< niz.length; i++) {
            niz [i] = sc.nextInt ();
        }

        int proizvod = 1;

        for (int i = 0; i < niz.length; i++){
            proizvod *= niz[i];
        }

        System.out.println ("Proizvod clanova niza je: " + proizvod);

        System.out.println (proizvod (niz));
    }
}
