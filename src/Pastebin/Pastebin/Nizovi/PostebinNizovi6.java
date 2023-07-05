package Pastebin.Pastebin.Nizovi;

//6. Napisati funkciju koja racuna proizvod 3 broja.

import java.util.Scanner;

public class PostebinNizovi6 {

    static int proizvodTriBroja (int x, int y, int z){

        return x*y*z;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println ("Molimo unesite tri broja");

        int x = sc.nextInt ();
        int y = sc.nextInt ();
        int z = sc.nextInt ();

        System.out.println (proizvodTriBroja (x,y,z));

    }
}
