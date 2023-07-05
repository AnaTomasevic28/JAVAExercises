package nedelja1.utorak;

import java.util.Scanner;

public class Zadatak4 {
    /*
    *Korisnik unosi ceo broj x. Ispisati apsolutnu vrednost broja x (bez koriscenja ugradjenih matematickih funkcija)
Ispisati poruku "x-u je promenjen znak" ukoliko je uneta negativna vrednost
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();

        if ( x < 0 ){
            x *= -1;
            System.out.println(" X je promenjen znak");
        }
        System.out.println(x);
    }

    }


