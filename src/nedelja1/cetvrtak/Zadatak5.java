package nedelja1.cetvrtak;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        // * 5. korisnik unosi dabl brojeve sve dok ne unese 0,0. izracunati zbir svih unetih brojeva

        Scanner sc = new Scanner (System.in);
        double x;
        double zbir = 0;

        System.out.println ("Unesite neki realan broj: ");

        while (true){
            x = sc.nextDouble ();
            if ( x != 0.0) {
                zbir += x;
            }
            else{
                break;
            }
        }
        System.out.println (zbir);
/*
        x = sc.nextDouble ();
        while ( x != 0.0 ){
            zbir += x;
            x = sc.nextDouble ();   // update unosa
        }
        System.out.println (zbir);
*/
    }
}
