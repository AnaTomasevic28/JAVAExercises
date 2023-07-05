package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

public class Postebin27LevaMarioKula {
   /*
    27. Za unetu visinu h, iscrtati levu Mario kulu. Npr za h = 5:
            |#
            |##
            |###
            |####
            |#####
            (| obelezava pocetak reda i to ne crtate)

    */

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println ("Molim unesite visinu kule koju zelite: ");
        int h = sc.nextInt ();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print ("#");
            }
            System.out.println ();
        }

    }

}
