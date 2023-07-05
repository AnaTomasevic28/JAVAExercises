package nedelja2.Cetvrtak.Domaci;

//a) Napraviti funkciju za ubacivanje celih brojeva u niz.
// U parametru metoda cemo imati broj koji predstavlja velicinu niza,
      // uneti duzinu niza preko skenera i proslediti je funkciji
// unutar funkcije cemo ubacivati elemente u niz i vratiti konacan niz.
//b) Proci kroz zadati niz iz primera a) i svaki neparan broj pretvoriti u parni.

import java.util.Scanner;

//Nadovezujem se na ovo Andrijino pitanje i tvoj odgovor. Jel to onda znači
// da mi tu dužinu niza dobijamo preko skenera u main-u
// i stavljamo je kao argument u samom pozivu funkcije u main-u?
public class Domaci1 {

static int[] kreiranjeNiza (Scanner skener){
    System.out.println ("Unesite duzinu niza: ");
    int duzinaNiza = skener.nextInt ();
    int[] niz = new int[duzinaNiza];
    System.out.println ("Unesite elemente niza: ");
    for (int i = 0; i < niz.length; i++) {
        niz[i] = skener.nextInt();
    }
    return niz;
}

static void ispisivanjeNiza (int[]niz){

    for (int i = 0; i < niz.length; i++) {
        System.out.print (niz[i] + " ");
    }
    System.out.println ();

}

static int[] neparniUParni (int[] niz){
    for (int i = 0; i < niz.length; i++) {
        if (niz[i] % 2 != 0){
            niz[i] += 1;
        }
    }
    return niz;
}


    public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);

    int[] niz1 =  kreiranjeNiza (sc);

    ispisivanjeNiza (niz1);

    neparniUParni (niz1);

    ispisivanjeNiza (niz1);



    }
}
