package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

public class Postebin1ParNepar {
    /*
    *1. Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.
    *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt ();

        if (n % 2 == 0){
            System.out.println ("Paran");
        }
        else System.out.println ("Neparan");
    }
}
