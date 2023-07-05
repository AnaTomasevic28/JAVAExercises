package Pastebin.Pastebin.Petlje;

//21.* Uneti pozitivan ceo broj n. Zatim ispisati najmanji i najveci broj od unetih narednih n brojeva (double).

import java.util.Scanner;

public class Postebin21MinMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println ("Unesite jedan pozitivan ceo broj n: ");

        int n = sc.nextInt();
        System.out.println ("Unesite n double brojeva: ");

        double unos = sc.nextDouble();

        double minimalni = Double.MAX_VALUE;
        double maksimalni = Double.MIN_VALUE;

        for (int i = 1; i < n ; i++) {

            if (unos < minimalni){
                minimalni = unos;
            }
            if ( unos > maksimalni){
                maksimalni = unos;
            }
            unos = sc.nextDouble ();
        }

        System.out.println (minimalni);
        System.out.println (maksimalni);
    }
}
