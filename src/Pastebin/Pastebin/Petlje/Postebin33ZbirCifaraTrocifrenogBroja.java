package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

//33.* Za unet trocifren broj n izracunati sumu n1 - n2 + n3, gde je n1 vodeca cifra, n2 sredisnja cifra, a n3 polsednja cifra broja n.
//        (Dakle, n = n1n2n3)
//        Npr:
//        n = 876 -> 7 (jer imamo 8 - 7 + 6 | n1 = 8, n2 = 7, n3 = 6)
public class Postebin33ZbirCifaraTrocifrenogBroja {

    static int sumaTrocifrenogBroja (int x){
        int suma;

        int n1 = x/100;
        int n2 = (x - n1 *100) /10;
        int n3 = (x - n1 *100 - n2 *10);

        suma = n1 - n2 + n3;

        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Molimo unesite jedan trocifreni broj: ");
        int x = sc.nextInt ();

        System.out.println ("Rezultat je: " + sumaTrocifrenogBroja (x));

    }
}
