package nedelja1.utorak;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

       /* Korisnik unosi broj svojih godina (int), svoju visinu u metrima (double) i minimalnu potrebnu visinu za ulazak u luna park(double).
        Ispisati poruku:
        - "Dobro dososli" - ukoliko je korisnik strogo stariji od 16 godina ili visi (ili jednak) od minimalne visine.
                - "Ne mozete prisustvovati luna parku" - ukoliko ima 16 ili manje godina i nije visi od minimalne visine.

        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Uneti godine starosti: ");
        int godine = sc.nextInt();

        System.out.println("Uneti visinu izrazenu u metrima: ");
        double visina = sc.nextDouble();

        double minVisina = 1.6;

        if ( visina >= 1.6 || godine > 16 ) {
            System.out.println("Dobro dosli.");
        }
        else {
            System.out.println("Ne mozete prisustvovati luna parku.");
        }


    }
}
