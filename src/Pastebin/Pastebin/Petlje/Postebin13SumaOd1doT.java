package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

public class Postebin13SumaOd1doT {
//13.* Za unet pozitivan ceo broj n, ispisati za svaki pozitivan ceo broj t,
// koji je strogo manji od njega (dakle t < n), sumu svih pozitivnih celih brojeva od 1 do tog broja (dakle 1 + 2 + 3 + ... + t).
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.println ("Unesite jedan pozitivan ceo broj");
    int n = sc.nextInt ();

    int suma = 0;

    for (int i = 1; i <= n; i++) {
        suma += i;
        System.out.println ("Zbir svih brojeva od 1 do " + i + " je " + suma);
    }





}

}
