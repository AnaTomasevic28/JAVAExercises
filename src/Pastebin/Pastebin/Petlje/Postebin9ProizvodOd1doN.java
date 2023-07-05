package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

public class Postebin9ProizvodOd1doN {
    /*
     * 9. Ispisati proizvod prvih n celih brojeva [1, n]
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Molimo unesite jedan ceo broj: ");
        int n = sc.nextInt ();

        int proizvod = 1;

        for (int i = 2; i<=n; i++){
            proizvod *=i;
        }
        System.out.println (proizvod);
    }
}
