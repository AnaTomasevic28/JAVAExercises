package Pastebin.Pastebin.Nizovi;

//14. Napisati funkciju koja vraca zbir drugog najmanjeg i drugog najveceg elementa niza.

public class PostebinNizovi14 {

    public static int zbirDrugogNajmanjegIDrugogNajveceg ( int[] niz){
        int suma;
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] < minimum){
                minimum = niz[i];
            }
        }

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > maximum){
                maximum = niz[i];
            }
        }
// minimum je 1
// maximum je 7


        int[] noviNiz = new int[niz.length - 2];

        int brojac = 0;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] != minimum && niz[i] != maximum){
                noviNiz[brojac] = niz[i];
                brojac++;
            }
        }

        for (int i = 0; i < noviNiz.length; i++) {
            System.out.print (noviNiz[i] + " ");
        }

        System.out.println ();


        int drugiMinimum = Integer.MAX_VALUE;
        int drugiMaximum = Integer.MIN_VALUE;


        for (int i = 0; i < noviNiz.length; i++) {
            if (noviNiz[i] < drugiMinimum) {
                drugiMinimum = noviNiz[i];
            }
        }
        System.out.println (drugiMinimum);


        for (int i = 0; i < noviNiz.length; i++) {
            if (noviNiz[i] > drugiMaximum) {
                drugiMaximum = noviNiz[i];
            }
        }
        System.out.println (drugiMaximum);

        suma = drugiMaximum + drugiMinimum;

        return suma;
    }

    public static void main(String[] args) {

        int[] niz = {1,10,20,100,300,-15,-10};

        for (int i = 0; i < niz.length; i++) {
            System.out.print (niz[i] + " ");
        }
        System.out.println ();

        System.out.println (zbirDrugogNajmanjegIDrugogNajveceg (niz));

    }
}
