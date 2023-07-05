package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

public class Postebin19ProizvodNarednihXBrojeva {

    public static void main(String[] args) {


    Scanner sc = new Scanner (System.in);

    System.out.println ("Uneti jedan ceo pozitivan broj 'x' ");
    int x = sc.nextInt ();
    int proizvod = 1;

        for (int i =x+1; i <= 2*x; i++) {
        proizvod *= i;
    }
        System.out.println ("Proizvod narednih 'x' brojeva je: " + proizvod);
    }
}
