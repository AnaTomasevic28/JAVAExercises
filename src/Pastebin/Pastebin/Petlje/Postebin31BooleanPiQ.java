package Pastebin.Pastebin.Petlje;

import java.util.Scanner;
public class Postebin31BooleanPiQ {

static String booleanIzraz (Scanner skener){

    String tacno = "true";
    String netacno = "false";

    System.out.println ("Molimo unesite dve boolean vrednosti: ");

    boolean p = skener.nextBoolean ();
    boolean q = skener. nextBoolean ();


    if (p == true && q == true){
        return tacno;
    }
    else
        return netacno;
}

//   31.*  Korisnik unosi vrednost za dva booleana p i q. Ispisati vrednost ("True" ili "False") narednog izrazraza :
//         "Ako je p tacno, onda je i q tacno."



    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println (booleanIzraz (sc));



    }

}
