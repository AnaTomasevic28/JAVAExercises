package nedelja1.utorak;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite cenu artikla: ");
        double cenaArtikla = sc.nextDouble();

        System.out.println("Unesite stanje na svom bankovnom racunu: ");
        double stanjeNaRacunu = sc.nextDouble();

        if (stanjeNaRacunu < cenaArtikla){
            System.out.println("Ne mozete kupiti artikal.");
        }
        else {
            System.out.println("Kupili ste artikal.");
        }

        if (stanjeNaRacunu < cenaArtikla) {
            System.out.println("Preostalo stanje na racunu je: " + stanjeNaRacunu);
        }
        else {
            System.out.println("Preostalo stanje na racunu je: " + (stanjeNaRacunu - cenaArtikla));
        }


    }
/*
    2.
    Korisnik unosi cenu artikla (double) i raspolozivo stanje svog racuna.(double)
    Ispisati poruku:
            - "Ne mozete kupiti artikal"; ukoliko korisnik nema dovoljno novca na racunu
- "Kupili ste artikal"; ukoliko korisnik ima dovoljno novca na racunu
    Ispisati poruku "Preostalo stanje na racunu: <stanje_na_racunu>"

 */






}
