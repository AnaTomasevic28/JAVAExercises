package nedelja1.Vikend;

import java.util.Scanner;

public class OlimpijskeMedalje {
    public static void main(String[] args) {
        /*
    *--Grananje
1. Olimpijske medalje
Korisnik unosi imena 3 drzava koje su se takmicile na olimpijskim igrama
u Tokiju 2021. Nakon toga unosi redom po 3 cela broja za svaku (ukupno 9 brojeva)
koje redom oznacavaju broj osvojenih zlatnih medalja,
broj osvojenih srebrnih medalja, broj osvojenih bronzanih medalja.
Na standardni izlaz ispisati ime pobednicke drzave. Pobednicka drzava je ona
koja ima vise zlatnih medalja u odnosu na ostale dve. Ukoliko neke 2 drzave
imaju isti broj osvojenih zlatnih medalja, onda je pobedila ona koja ima najvise
srebrnih medalja. Ukoliko dve drzave takodje imaju isti broj osvojenih
srebrnih medalja, onda se gledaju bronzane, a ukoliko imaju isti broj svih medalja
ispisati poruku "Nereseno".
------------------------------------------------------------------------------------
Primer 1:
Input:
"Engleska" "Srbija" "Nemacka"
3 4 1
5 1 1
2 2 2
Output:
"Srbija"
Primer 2:
Input:
"Japan" "USA" "Francuska"
1 2 3
1 2 1
0 0 0
Output:
"Japan"
Primer 3:
Input:
"Belgija" "Italija" "Egipat"
1 2 3
1 2 3
1 2 3
Output:
"Nereseno"

         */
        Scanner sc = new Scanner (System.in);

        System.out.println ("Molimo unesite ime tri drzave ucesnice Olimpijskih igara u Tokiju 2021.godine.");
// formiranje niza drzave
        String[] drzave = new String[3];

        drzave[0] = sc.next ();
        drzave[1] = sc.next ();
        drzave[2] = sc.next ();

        sc.nextLine ();
        //System.out.println (drzave);

        System.out.println ("Molimo unesite broj osvojenih zlatnih medalja za svaku drzavu");

        //formiranje niza zlatnih medalja
        int[] medalje1 = new int[3];

        for (int i = 0; i < 3; i++) {
            medalje1[i] = sc.nextInt ();
        }
        // formiranje niza srebrnih medalja

        System.out.println ("Molimo unesite broj osvojenih srebrnih medalja za svaku drzavu");

        int[] medalje2 = new int[3];

        for (int i = 0; i < 3; i++) {
            medalje2[i] = sc.nextInt ();
        }

        // formiranje niza bronzanih medalja
        System.out.println ("Molimo unesite broj osvojenih bronzanih medalja za svaku drzavu");

        int[] medalje3 = new int[3];

        for (int i = 0; i < 3; i++) {
            medalje3[i] = sc.nextInt ();
        }

        // stampa niza drzave
        for (int i = 0; i < drzave.length; i++) {
            System.out.print (drzave[i] + " ");
        }
        System.out.println (" ");

        //stampa niza zlatne medalje
        for (int i = 0; i < medalje1.length; i++) {
            System.out.print (medalje1[i] + " ");
        }
        System.out.println (" ");

        //stampa niza srebrne medalje
        for (int i = 0; i < medalje2.length; i++) {
            System.out.print (medalje2[i] + " ");
        }
        System.out.println (" ");

        //stampa niza bronzane medalje
        for (int i = 0; i < medalje3.length; i++) {
            System.out.print (medalje3[i] + " ");
        }
        System.out.println (" ");

        //poredjenje zlatnih medalja

        if (medalje1[0] > medalje1[1] && medalje1[0] > medalje1[2]) {
            System.out.println ("Pobednik je : " + drzave[0]);
        } else if (medalje1[1] > medalje1[0] && medalje1[1] > medalje1[2]) {
            System.out.println ("Pobednik je : " + drzave[1]);
        } else if (medalje1[2] > medalje1[0] && medalje1[2] > medalje1[1]) {
            System.out.println ("Pobednik je : " + drzave[2]);
        } else {

            if (medalje2[0] > medalje2[1] && medalje2[0] > medalje2[2]) {
                System.out.println ("Pobednik je : " + drzave[0]);
            } else if (medalje2[1] > medalje2[0] && medalje2[1] > medalje2[2]) {
                System.out.println ("Pobednik je : " + drzave[1]);
            } else if (medalje2[2] > medalje2[1] && medalje2[2] > medalje2[0]) {
                System.out.println ("Pobednik je : " + drzave[2]);
            } else {

                if (medalje3[0] > medalje3[1] && medalje3[0] > medalje3[2]) {
                    System.out.println ("Pobednik je : " + drzave[0]);
                } else if (medalje3[1] > medalje3[0] && medalje3[1] > medalje3[2]) {
                    System.out.println ("Pobednik je : " + drzave[1]);
                } else if (medalje3[2] > medalje3[0] && medalje3[2] > medalje3[1]) {
                    System.out.println ("Pobednik je : " + drzave[2]);
                } else {
                    System.out.println ("Nereseno.");
                }
            }

        }

    }
}




