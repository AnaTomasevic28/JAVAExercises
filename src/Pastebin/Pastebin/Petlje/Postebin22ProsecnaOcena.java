package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

public class Postebin22ProsecnaOcena {
   /*
    22. Korisnik unosi ime i prezime (jedan String), ime predmeta (String) i prosecnu ocenu istog (double). Validni predmeti su:
    {Srpski, Engleski, Matematika, Fizika, Hemija, Fizicko, Biologija, Istorija, Geografija}
    Na standardni izlaz ispisati poruku:
            "{ime i prezime} je {atribut} iz {kategorija predmeta}, jer je imao/la prosecnu ocenu {prsoecnu ocenu} iz predmeta {ime predmeta}",
    gde je atribut:
            1.) "veoma dobar/ra", ako je prosecna ocena iznad 3.5
            2.) "dobar/ra", ako je prosecna ocena izmedju 2.5 i 3.5
            3.) "veoma los/a", ako je prsoecna ocena ispod 2.5
    kategorija predmeta:
            1.) "prirodnih nauka" - Matematika, Fizika, Hemija
	        2.) "jezika" - Srpski, Engleski
	        3.) "opstih predmeta" - Biologoija, Istorija, Geografija
    Dakle, za unos:
            - "Ana Brankovic", "Biologija", 4.2
    poruka bi izgledala:
            "Ana Brankovic je veoma dobar/ra iz opstih predmeta, jer je imao/la prosecnu ocenu 4.2 iz predmeta Biologija"
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println ("Unesite ime i prezime ucenika: ");
        String imePrezime = sc.nextLine ();

        System.out.println ("Unesite ime predmeta: ");
        String predmet = sc.nextLine ();

        System.out.println ("Unesite prosecnu ocenu: ");
        double prosecnaOcena = sc.nextDouble ();

        // jedan if da smestim ocenu u adekvatan atribut
        // drugi if da smestim predmet u odgovarajucu kategoriju predmeta



    }

}
