package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

public class Postebin6od0doN {
    /*
    *
    * 6. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Molim unesite jedan ceo pozitivan broj: ");
        int n = sc.nextInt ();

        for (int i = 0; i<=n; i++){
            System.out.print (i + ", ");
        }
    }
}
