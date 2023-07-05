package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

public class Postebin12FizzBazzZazz {

    /*
     * 12. Za unet ceo broj n, ispisati za svaki od brojeva [1, n] "Fizz" ako je deljiv sa 3,
     *  "Buzz" ako je deljiv sa 5, "Zazz" ako je deljiv sa 7
     *  i sve ostale varijacije ("BuzzZazz" ako je deljiv i sa 5 i sa 7, ...)
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println ("Molim unesite jedan ceo broj: ");
        int x = sc.nextInt ();

        for (int i = 1; i <= x; i++) {
            if ((i % 5 != 0) && ( i % 3 != 0) && (i % 7 != 0) ) {
                System.out.println (i);
            }
            if ((i % 3 == 0) && (i % 5 == 0) && (i % 7 == 0)){
                System.out.println (i + " FizzBazzZazz");
            }
            else if ( (i % 3 == 0) && (i % 5 == 0) ){
                System.out.println (i + " FizzBazz");
            }
            else if ( (i % 3 == 0) && (i % 7 == 0)){
                System.out.println (i + " FizzZazz");
            }
            else if ((i % 5 == 0) && (i % 7 == 0)) {
                System.out.println (i + " BazzZazz");
            }
            else if ( i % 7 == 0){
                System.out.println (i + " Zazz");
            } else if (i % 5 == 0) {
                System.out.println (i + " Bazz");
            } else if (i % 3 == 0) {
                System.out.println (i + " Fizz");
            }
        }
    }
}
