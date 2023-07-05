package nedelja2.Sreda;

import java.util.Scanner;

public class Domaci1 {
    //Domaci Zadatak 1:
    //Zadatak 3: Definisati neki niz imena.
    //    // Uneti ime preko Scannera
    //    // koje ce vratiti poruku ukoliko se uneto ime nalazi u nizu
    //Na Zadatku 3 sa casa dodati funkcionalnost koja ispisuje koliko puta se neko ime pojavljuje u nizu.


    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        String[] niz = {"Ana", "Maja", "Dragan", "Strahinja", "Petar", "Marko", "Maja", "Strahinja", "Maja"};

        System.out.println ("Molim unesite ime: ");

        String ime = sc.next();

        boolean B = false;
        int brojac = 0;

        for (String s : niz) {

            if (s.equalsIgnoreCase (ime)) {
                B = true;
                brojac += 1;
            } else {
                B = false;
            }
        }


        if (!B){
            System.out.println ("Ne postoji ime " + ime + " u nizu.");
        }
        else if (B){
            System.out.println ("Ime " + ime + " se pojavljuje " + brojac + " puta u nizu.");
        }

        // treba definisati neki brojac koji ce registrovati koliko puta se neko ime pojavljuje u nizu
    }
}
