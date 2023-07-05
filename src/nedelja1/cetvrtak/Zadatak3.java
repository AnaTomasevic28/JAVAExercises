package nedelja1.cetvrtak;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
          /*
         * * 3. Napisati program koji za uneti ceo broj n ispisuje brojeve:
         *   a) [1, n]
         *   b) [-14, 2n]
         *   c) [n, -n]
         *
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //a) [1, n]
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        System.out.println("===================");

        //b) [-14, 2n]
        for (int i = -14; i <= 2*n; i++) {
            System.out.println(i);
        }

        System.out.println("===================");

        //c) [n, -n]
        for (int i = n; i >= -n; i--) {
            System.out.println(i);
        }

    }
}
