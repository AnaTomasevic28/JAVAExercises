package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

public class Postebin25ProsecnaVrednostArtikla {

    //    25.* Korisnik unosi cene artikala sve dok ne unese 0. Ispisati prosecnu vrednost artikala.


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Unesite cene artikala: ");
        double cenaArtikla = sc.nextDouble ();

        int brojac = 0;
        double suma = 0;

        while ( cenaArtikla != 0){
            brojac++;
            suma += cenaArtikla;
            cenaArtikla = sc.nextDouble ();
        }

        double prosecnaVrednost = suma/brojac;

        System.out.println ("Prosecna cena artikala je: " + prosecnaVrednost);

    }
}
