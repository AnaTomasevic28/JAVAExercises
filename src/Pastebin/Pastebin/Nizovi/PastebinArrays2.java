package Pastebin.Pastebin.Nizovi;

import java.util.Scanner;

public class PastebinArrays2 {
    /*
    *2. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
    * Primer: [1, 2, 3, 4, 5] -> 1 3 5
    *
    * b) Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.
     */

    public static void ispisiSvakiDrugi ( int[] niz){

        for (int i = 1; i < niz.length ; i++) {
            System.out.print (niz[i] + " ");
            i++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Molim unesite duzinu niza koji zelite:");
        int n = sc.nextInt ();

        int niz [] = new int [n];

        System.out.println ("Unesite n celih brojeva niza: ");

        for (int i = 0; i < niz.length; i++){
            niz [i] = sc.nextInt ();
        }

        for (int i = 1; i < niz.length; i++) {
            System.out.print (niz [i] + " ");
            i++;
        }
        System.out.println ();

        ispisiSvakiDrugi (niz);
    }
}
