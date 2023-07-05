package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

public class Postebin14VeciManji {
    /*
     *14. Za unete brojeve a i b ispisati veci od njih.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Molimo unesite broj 'a': ");
        int a = sc.nextInt ();

        System.out.println ("Molimo unesite broj 'b': ");
        int b = sc.nextInt ();

        if (a > b){
            System.out.println ("Veci broj je broj a " + a);
        }
        else if (b > a){
            System.out.println ("Veci broj je broj b " + b);
        }
    }

}
