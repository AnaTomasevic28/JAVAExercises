package nedelja2.Sreda;

import java.util.Scanner;

public class Zadatak3 {
    // Zadatak 3: Definisati neki niz imena.
    // Uneti ime preko Scannera
    // koje ce vratiti poruku ukoliko se uneto ime nalazi u nizu.

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        String[] niz = {"Ana", "Maja", "Dragan", "Strahinja", "Petar", "Marko"};

        System.out.println ("Molim unesite ime: ");

        String ime = sc.next();

        boolean B = true;

        for (int i = 0; i < niz.length; i++) {

            if (niz[i].equalsIgnoreCase (ime)){
                B = true;
                break;
            }
            else {
                B = false;
            }
        }

        if (B){
            System.out.println ("Postoji ime " + ime + " u nizu.");
        }
        else{
            System.out.println ("NE postoji ime " + ime + " u nizu.");
        }

    }

}
