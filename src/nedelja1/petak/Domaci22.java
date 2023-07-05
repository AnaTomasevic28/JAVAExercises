package nedelja1.petak;

public class Domaci22 {
    public static void main(String[] args) {
         /*
    *Domaci Zadatak 2:
     Definisati neki niz brojeva. Zatim:
     a) Svaki parni broj u nizu povecati za 1
     b) Svaki broj na parnoj poziciji povecati za 2
     (U ovom zadatku niz je od 1 do 10) (Ovaj zadatak uraditi ili u dve posebne klase ili dve posebne
petlje).
    */
        int [] niz = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // svaki broj na parnoj poziciji povecati za 2
        // 3, 2, 5, 4, 7, 6, 9, 8, 11, 10

        for ( int i = 0; i < niz.length; i++){
            if ( i % 2 == 0 ){
                System.out.println (niz[i] + 2);
            }
            else {
                System.out.println (niz [i]);
            }
        }
    }
}
