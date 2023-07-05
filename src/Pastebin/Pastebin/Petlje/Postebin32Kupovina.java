package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

//    32.* Korisnik unosi novac na racunu kojim raspolaze kao i cenu nekog artikla. Na standardni izlaz ispisati koliko kopija tog
//         artika korisnik moze da kupi.
public class Postebin32Kupovina {

    static int kolikoArtikala (Scanner skener){

        System.out.print("Molim unesite stanje na vasem racuinu: ");
        double stanjeNaRacunu = skener.nextDouble ();


        System.out.print("Molim unesite cenu zeljenog artikla: ");
        double cenaArtikla = skener.nextDouble ();


        int brojac = 0;

        while (stanjeNaRacunu >= cenaArtikla){
            stanjeNaRacunu -= cenaArtikla;
            brojac++;
        }

        return brojac;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Mozete kupiti " + kolikoArtikala (sc) + " artikla.");


    }

}
