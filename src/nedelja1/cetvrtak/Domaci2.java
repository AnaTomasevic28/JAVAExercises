package nedelja1.cetvrtak;

import java.util.Scanner;

public class Domaci2 {
    public static void main(String[] args) {
        /*
        * Domaci Zadatak 2:
        *
        * Napraviti program gde cete uneti pomocu Scanner-a neki broj koji predstavlja novcano stanje firme.
        * Zatim uneti broj radnika u toj firmi. Svakom radniku mora biti isplacena plata od 100 din npr. Od
        * ukupne svote novca treba oduzeti ukupno para koliko se isplacuje radnicima, i istampati vrednost
        * novca koja preostaje firmi (Primer u zadatku uradjen da je plata 100) (Odaberite svoje vrednosti).
        *
        */

        Scanner sc = new Scanner (System.in);
        double novcanoStanjeFirme;
        double plata = 10;

        System.out.println ("Budzet firme za isplatu zarade je: ");
        novcanoStanjeFirme = sc.nextDouble ();

        System.out.println ("Ukupan broj zaposlenih u firmi je: ");
        int brojRadnika = sc.nextInt ();

        for (int i = 1; i<= brojRadnika; i++){
            novcanoStanjeFirme -= plata;
            if (novcanoStanjeFirme < plata){
                System.out.println ("Plata nije isplacena za " + (brojRadnika- i ) + "radnika.");
                break;
            }
        }
        System.out.println ("Broj zaposlenih u firmi : " + brojRadnika + ".");
        System.out.println ("Kada se zaposlenima isplate zarade preostaje " + novcanoStanjeFirme + " dinara.");
    }
}
