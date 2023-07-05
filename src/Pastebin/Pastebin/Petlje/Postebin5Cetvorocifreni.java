package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

public class Postebin5Cetvorocifreni {
    /*
    *5.* Za unet cetvorocifren broj ispisati razliku proizvoda njegovih prvih dveju cifara
    * od zbira njegovih drugih dveju cifara.
    *
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Unesite cetvorocifreni broj");
        int x = sc.nextInt ();

        int razlika;

        int a, b, c, d;

        a = x/1000;
        b = (x - a*1000) / 100;
        c = (x - a*1000 - b*100)/10;
        d = x - a*1000 - b*100 - c*10;

       razlika = a*b - (c+d);

        System.out.println (razlika);
    }
}
