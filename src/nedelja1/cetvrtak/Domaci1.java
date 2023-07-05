package nedelja1.cetvrtak;

import java.util.Scanner;

public class Domaci1 {
    public static void main(String[] args) {

        //Domaci Zadatak 1:
        /*
        * Napraviti program koji ce Vam omoguciti da unosite neke Stringove sve dok ne napisete "stop".
        * Nakon sto napisete "stop", program treba da ispise sve Stringove koje ste do tada uneli.
        *
        */



        Scanner sc = new Scanner (System.in);

        String finalniText = "";

       while (true) {
           String unos = sc.nextLine ().toLowerCase ();
           if (!unos.equals ("stop")) {
               finalniText += unos + " ";
           } else {
               break;
           }
       }
        System.out.println (finalniText);
    }
}
