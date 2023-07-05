package nedelja2.Cetvrtak.Funkcije;

import java.util.Scanner;

public class Zadatak2 {

    //  * 2. Napisati funkciju koja prima 4 realna broja i vraca njihov proizvod

    static double proizvod ( double a, double b, double c, double d){
        double rezultat = a * b * c * d;
        return rezultat;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        double x = sc.nextDouble ();
        double y = sc.nextDouble ();
        double  z = sc.nextDouble ();
        double q = sc.nextDouble ();

        double resenje = proizvod (x,y,z,q);
        System.out.println (resenje);


    }
}
