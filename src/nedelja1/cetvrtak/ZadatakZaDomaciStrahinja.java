package nedelja1.cetvrtak;

import java.util.Scanner;

public class ZadatakZaDomaciStrahinja {
    public static void main(String[] args) {

        /*
         * Za domaci:
         * Racuna zbir prvih n brojeva.
         *
         * */

        Scanner sc = new Scanner (System.in);
        int n;
        n = sc.nextInt ();

        int zbir = 0;

        for (int i = 0; i <= n; i++){
            zbir += i;
        }
        System.out.println (zbir);

    }
}
