package nedelja3.Ponedeljak.Domaci;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
Domaci Zadatak:
        Napraviti dve funkcije:
        a) Prva funkcija kreira listu od 20 parnih brojeva.
        b) Druga funkcija uzima listu iz primera a) i eleminise sve brojeve koji su deljivi sa 4.
 */
public class Zadatak1 {

//    a)
static List<Integer> listaParnihBrojeva(Scanner skener){
    System.out.println ("Molimo unesite duzinu liste: ");

    int duzinaListe = skener.nextInt ();

    List<Integer> lista = new ArrayList<> ();

    System.out.println ("Unesite elemente liste: ");

    for (int i = 0; i < duzinaListe; i++) {
        int n = skener.nextInt ();
        if ((n % 2) == 0){
            lista.add (n);
        }
    }

    return lista;
}

//  b) eliminisi sve brojeve deljive sa 4

    static void brisiDeljiveSaCetiri(List<Integer> lista){



        for (int i = 0; i < lista.size ();) {
            if (lista.get (i) % 4 == 0){
                lista.remove (i);
            }
            else i++;                       // povecavam i samo kada ne brisem element, jer to znaci da prethodni ostaje
        }                                   // i da proveravam naredni,  a ako sam prethodni obrisala onda opet proveravam
                                            // element na istoj poziciji
        System.out.println (lista);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        List<Integer> lista1 = new ArrayList<> (listaParnihBrojeva (sc));

        System.out.println (lista1);

        brisiDeljiveSaCetiri (lista1);

    }
}
