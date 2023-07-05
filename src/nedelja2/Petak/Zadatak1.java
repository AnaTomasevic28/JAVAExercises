package nedelja2.Petak;

public class Zadatak1 {

    //Napisati funkciju koja vraca najmanji element niza celih brojeva
    ///Napisati funkciju koja vraca najveci element niza celih brojeva
    //Napisati funkciju koja prima dva niza celih brojeva i vraca niz dobijen nadovezivanjem drugog niza na prvi
    //Napisati funkciju koja proverava da li prosledjeni ceo broj se nalazi u prosledjenom nizu celih brojeva

    static int najmanjiBroj (int[] nizCelihBrojeva){
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < nizCelihBrojeva.length; i++) {
            if ( nizCelihBrojeva[i] < minimum){
                minimum = nizCelihBrojeva[i];
            }

        }
        return minimum;
    }

    static int najveciBroj (int[] nizCelihBrojeva){
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < nizCelihBrojeva.length; i++) {
            if ( nizCelihBrojeva[i] > maximum){
                maximum = nizCelihBrojeva[i];
            }

        }
        return maximum;
    }

    static int[] noviNiz (int[] niz1, int[] niz2){
        int[] niz3 = new int[niz1.length+niz2.length];

        for (int i = 0; i < niz1.length; i++) {
            niz3[i] = niz1[i];
        }

        for (int i = 0; i < niz2.length ; i++) { // i = niz1.length, i < niz3.length
            niz3[i+niz1.length] = niz2[i]; // niz3[i] = niz2[i-niz1.length]
        }
        return niz3;
    }

    //Napisati funkciju koja proverava da li prosledjeni ceo broj se nalazi u prosledjenom nizu celih brojeva
    //Ovo je linearna pretraga. Postoji i binarna pretraga, ali radi samo ako je niz sortiran.
    static  boolean daLiPostoji (int x, int[] niz){
        for (int i = 0; i < niz.length; i++) {
            if( x == niz[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] niz = {1,2,3,4,5};

        int[] niz1 = {6,7,8,9,10,11};

        int[] spojeniNizovi = noviNiz (niz, niz1);

        int broj = 15;

        System.out.println (najmanjiBroj (niz));

        System.out.println (najveciBroj (niz));

        for (int i = 0; i < spojeniNizovi.length; i++) {
            System.out.print (spojeniNizovi[i] + " ");
        }
        System.out.println ();

        System.out.println (daLiPostoji (broj, niz));

    }

}
