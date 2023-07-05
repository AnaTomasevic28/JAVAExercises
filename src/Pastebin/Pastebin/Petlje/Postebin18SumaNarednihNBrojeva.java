package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

public class Postebin18SumaNarednihNBrojeva {

    //18. Uneti pozitivan ceo broj n. Zatim izracunati sumu unetih narednih n brojeva (double).

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Uneti jedan ceo pozitivan broj 'x' ");
        int x = sc.nextInt ();
        int suma = 0;

        for (int i =x+1; i <= 2*x; i++) {
            suma += i;
        }
        System.out.println ("Zbir narednih 'x' brojeva je: " + suma);
    }
}
