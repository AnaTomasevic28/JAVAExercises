package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

public class Postebin17Digitron {

    //17. Napraviti digitron koji prima double, char, double,
    // gde je char neki od simbola: {+, -, *, /, %, ^} i ispisuje resenje odgovarajuce operacije.

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println ("Unesite prvi double broj: ");
        double A = sc.nextDouble ();

        System.out.println ("Unesite simbol racunske operacije (+, -, *, /, %, ^): ");
        char C = sc.next ().trim (). charAt (0);

        System.out.println ("Unesite drugi double broj: ");
        double B = sc.nextDouble ();


        if (C == '+') {
            System.out.println ("Zbir A i B iznosi: " + (A + B));
        } else if (C == '-') {
            System.out.println ("Razlika A i B iznosi: " + (A - B));
        } else if (C == '*') {
            System.out.println ("Proizvod A i B iznosi: " + A * B);
        } else if (C == '/') {
            System.out.println ("Kolicnik A i B iznosi: " + A / B);
        } else if (C == '%') {
            System.out.println ("Ostatak pri deljenju A i B iznosi: " + A % B);
        } else if (C == '^') {
            System.out.println ("Rezultat stepenovanja A sa B iznosi: " + Math.pow (A, B));
        }



    }
}
