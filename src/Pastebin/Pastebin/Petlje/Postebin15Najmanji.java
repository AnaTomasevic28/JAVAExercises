package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

public class Postebin15Najmanji {

    //15. Za unete brojeve a, b i c ispisati najmanji od njih

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Unesite broj A:" );
        int a = sc.nextInt ();

        System.out.println ("Unesite broj B: ");
        int b = sc.nextInt ();

        System.out.println ("Unesite broj C: ");
        int c = sc.nextInt ();

        System.out.print ("Najmanji broj je broj ");

        if ( a<b && a<c){
            System.out.println ("A= " + a);
        } else if (b<a && b<c) {
            System.out.println ("B= " + b);
        } else if (c<a && c<b) {
            System.out.println ("C= " + c);
        }


    }
}
