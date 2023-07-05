package nedelja2.Cetvrtak.Funkcije;

import java.util.Scanner;

public class Zadatak1 {
    // * 1. Napisati funkciju koja prima 3 cela broja i vraca njihov zbir

    static int zbir (int a, int b, int c){
        int rezultat = a + b + c;
        return rezultat;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int x = sc.nextInt ();
        int y = sc.nextInt ();
        int z = sc.nextInt ();

        int resenje = zbir(x,y,z);
        System.out.println (resenje);
    }
}
