package nedelja1.petak;

public class Domaci21 {
    /*
    *Domaci Zadatak 2:
     Definisati neki niz brojeva. Zatim:
     a) Svaki parni broj u nizu povecati za 1
     b) Svaki broj na parnoj poziciji povecati za 2
     (U ovom zadatku niz je od 1 do 10) (Ovaj zadatak uraditi ili u dve posebne klase ili dve posebne
petlje).
    *
     */
    public static void main(String[] args) {

        int [] niz = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
// svaki parni broj u nizu povecati za 1
        // 1, 3, 3, 5, 5, 7, 7, 9, 9, 11

        for ( int i = 0; i < niz.length; i++){
            if ( niz[i] % 2 == 0 ){
                System.out.println (niz[i] + 1);
            }
            else {
                System.out.println (niz [i]);
            }
        }


    }

}
