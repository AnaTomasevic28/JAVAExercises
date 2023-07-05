package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

public class Postebin4IstiSuprotniZnak {
    /*
     * 4. Za uneta dva broja ispisati poruku "Istog znaka" ako su oba broja istog znaka,
     * a poruku "Suprotnog znaka", ako nisu istog znaka.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int x, y;

        x = sc.nextInt ();
        y = sc.nextInt ();

        if ((x < 0 && y < 0) || (x > 0 && y > 0)){
            System.out.println ("Istog znaka");
        }
        else if (( x < 0 && y > 0) || ( x > 0 && y < 0)){
            System.out.println ("Suprotnog znaka");
        }
    }
}
