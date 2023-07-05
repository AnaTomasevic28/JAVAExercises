package Pastebin.Pastebin.Nizovi;

import java.util.Scanner;

public class PastebinArrays3 {
    /*
    * 3. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Izracunati sumu tog niza.
    * Primer: [1, 2, 3, 4, 5] -> 15 (1 + 2 + 3 + 4 + 5 = 15)
    *
    * b) Napraviti funkciju koja vraca sumu prosledjenog niza.
     */

    public static int suma (Scanner skener){
        System.out.println ("Molimo unesite duzinu niza: ");
        int duzina = skener.nextInt ();

        int[] niz = new int[duzina];

        System.out.println ("Molimo unesite elemente niza: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = skener.nextInt ();
        }

        int suma = 0;

        for (int i = 0; i < niz.length; i++) {
            suma += niz[i];
        }

        return suma;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

//        System.out.println ("Molimo unesite duzinu niza");
//        int n = sc.nextInt ();
//
//        int niz [] = new int[n];
//
//        for (int i = 0; i < niz.length; i++){
//            niz [i] = sc.nextInt ();
//        }
//        int sum = 0;
//
//        for (int i = 0; i < niz.length; i++){
//            sum += niz [i];
//        }
//        System.out.println ("Zbir je: " + sum);

        System.out.println ("Suma niza je: " + suma (sc));

    }
}
