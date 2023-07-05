package nedelja2.Cetvrtak.Funkcije;

import java.util.Scanner;

public class Zadatak8 {

//    * IV Napisati funkciju koja kreira niz celih brojeva

static int[] nizCelihBrojeva (Scanner skener){
    System.out.println ("Unesite duzinu niza: ");
    int duzinaNiza = skener.nextInt ();
    int[] niz = new int[duzinaNiza];
    System.out.println ("Unesite elemente niza: ");
    for (int i = 0; i < niz.length; i++) {
        niz[i] = skener.nextInt ();
    }
    return niz;
}

static void ispisNiza (int[] niz){
    for (int i = 0; i < niz.length; i++) {
        System.out.print (niz[i] + " ");
    }
    System.out.println ();
}

    public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    int[] niz1 = nizCelihBrojeva (sc);

    ispisNiza (niz1);

    }

}
