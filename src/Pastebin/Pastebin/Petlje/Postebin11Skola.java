package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

public class Postebin11Skola {
    /*
     * 11. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
	"Dobrodosao u {x}. razred, {ime} {prezime}",
	pod pretpostavkom da je trenutna godina 2023. Pretpostavimo da ima 12 razreda. A ako korisnik nije djak ispisati jednu odgovarajucu
    poruku od:
	"{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Molimo unesite ime ucenika: ");
        String ime = sc.nextLine ().toLowerCase ();

        System.out.println ("Molimo unesite prezime ucenika: ");
        String prezime = sc.nextLine ().toLowerCase ();

        System.out.println ("Molimo unesite godinu rodjenja ucenika: ");
        int godinaRodjenja = sc.nextInt ();

        switch (godinaRodjenja){
            case 2016:
                System.out.println ("Dobrodosao/Dobrodosla u 1. razred " + ime + " " + prezime + ".");
                break;
            case 2015:
                System.out.println ("Dobrodosao/Dobrodosla u 2. razred " + ime + " " + prezime + ".");
                break;
            case 2014:
                System.out.println ("Dobrodosao/Dobrodosla u 3. razred " + ime + " " + prezime + ".");
                break;
            case 2013:
                System.out.println ("Dobrodosao/Dobrodosla u 4. razred " + ime + " " + prezime + ".");
                break;
            case 2012:
                System.out.println ("Dobrodosao/Dobrodosla u 5. razred " + ime + " " + prezime + ".");
                break;
            case 2011:
                System.out.println ("Dobrodosao/Dobrodosla u 6. razred " + ime + " " + prezime + ".");
                break;
            case 2010:
                System.out.println ("Dobrodosao/Dobrodosla u 7. razred " + ime + " " + prezime + ".");
                break;
            case 2009:
                System.out.println ("Dobrodosao/Dobrodosla u 8. razred " + ime + " " + prezime + ".");
                break;
            case 2008:
                System.out.println ("Dobrodosao/Dobrodosla u 9. razred " + ime + " " + prezime + ".");
                break;
            case 2007:
                System.out.println ("Dobrodosao/Dobrodosla u 10. razred " + ime + " " + prezime + ".");
                break;
            case 2006:
                System.out.println ("Dobrodosao/Dobrodosla u 11. razred " + ime + " " + prezime + ".");
                break;
            case 2005:
                System.out.println ("Dobrodosao/Dobrodosla u 12. razred " + ime + " " + prezime + ".");

        }
        if (godinaRodjenja < 2005){
            System.out.println (ime + " " + prezime + " je zavrsio/la skolu");
        }
        else if ( godinaRodjenja > 2016){
            System.out.println (ime + " " + prezime + " tek treba da zapocne skolovanje.");
        }
    }
}
