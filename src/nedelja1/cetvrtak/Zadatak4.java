package nedelja1.cetvrtak;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {


        // 4. Napisati program koji za uneti ceo broj n racuna proizvod svih brojeva od 1...n

        /*
         * Divide and Conquer
         * Zavadi pa vladaj
         *
         * 1. Treba da napravim skener i int n da uneseme preko sc.nextInt();
         * 2. Racun proizvod svih brojeva od 1...n
         * 2.1 imam petlju koja ide od 1...n
         */

        //a) preko while-a

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();

        int proizvod = 1;
        for (int i = 1; i <= n; i++) {
            proizvod *= i;
        }
        System.out.println (proizvod);


        /*
         * proizvod = 1
         * ulazim u for
         * i = 1
         * proizvod = proizvod * i = 1 * 1 = 1
         * i++;
         * i = 2
         * proizvod = proizvod * i = 1 * 2 = 2
         * i++;
         * i = 3
         * proizvod = proizvod * i = 2 * 3 = 6;
         * i++;
         * i = 4; 4 > 3
         * sout proizvod -> 6
         * */
    }
}
