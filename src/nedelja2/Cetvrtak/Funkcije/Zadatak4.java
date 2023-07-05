package nedelja2.Cetvrtak.Funkcije;

public class Zadatak4 {

    // * 4. Napisati funkciju koja ispisuje niz celih brojeva

    static void ispisiNiz (int [] niz){
        for (int i = 0; i < niz.length; i++) {
            System.out.print (niz[i] + " ");
        }
        System.out.println ();
    }

    public static void main(String[] args) {

        int [] niz1 = { 1, 2, 3, 4, 5 };

        ispisiNiz (niz1);
    }
}
