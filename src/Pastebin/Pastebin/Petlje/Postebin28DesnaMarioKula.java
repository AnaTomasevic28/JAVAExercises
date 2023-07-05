package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

public class Postebin28DesnaMarioKula {
    /*
    28. Za unetu visinu h, iscrtati desnu Mario kulu. Npr za h = 5:
            |    #
            |   ##
            |  ###
            | ####
            |#####
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println ("Molim unesite visinu kule koju zelite: ");
        int h = sc.nextInt ();


        for (int i = 1; i <= h; i++) { // h = 5
            for (int j = (h - i); j >= 1; j--) { // j = 4  ,   4 >= 1
                System.out.print (" ");
            }
            for (int j = 1; j <= i; j++) {  // 1 <= 5
                System.out.print ("#");
            }
            System.out.println ();
        }

/*
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print ("#");
            }
            System.out.println ();
        }
*/

    }
}
