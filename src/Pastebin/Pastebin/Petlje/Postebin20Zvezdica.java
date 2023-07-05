package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

public class Postebin20Zvezdica {
    //20.* Unose se double konstante a, b, c, a zatim i pozitivan ceo broj n. Zatim se unose n double brojeva jedan po jedan.
    //Cim se unese jedan od tih brojeva, na standardni izlaz ispisuje se vrednost polinoma:
    // a*x^2 + b*x + c, gde je x taj uneti broj.

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Molimo unesite tri realna broja: ");
        final double A = sc.nextDouble ();
        final double B = sc.nextDouble ();
        final double C = sc.nextDouble ();

        System.out.println ("Unesite jedan ceo broj n: ");
        int n = sc.nextInt ();

        System.out.println ("Unesite relane brojeve n puta: ");
        double unos = sc.nextDouble ();
        double polinom = A * unos*unos + B * unos + C;

        boolean bool = false;
        int i = 1;

        while ( i<= n ){
            if (unos == A ){
                bool = true;
                break;
            }
            else if (unos == B){
                bool = true;
                break;
            }
            else if (unos == C){
                bool = true;
                break;
            }
            else {
                bool = false;
                unos = sc.nextDouble ();
                i++;
            }
        }

        if (bool==true){
            System.out.println (polinom);
        }


    }
}
