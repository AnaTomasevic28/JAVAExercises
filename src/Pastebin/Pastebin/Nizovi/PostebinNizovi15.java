package Pastebin.Pastebin.Nizovi;

//15. Napisati funkciju koja ispituje da li je suma niza veca od njegovog proizvoda.

public class PostebinNizovi15 {

    public static boolean sumaVecaOdProizvoda (int[] niz){
        int suma = 0;
        int proizvod = 1;

        for (int i = 0; i < niz.length; i++) {
            suma += niz[i];
        }

        System.out.println (suma);

        for (int i = 0; i < niz.length; i++) {
            proizvod *= niz[i];
        }

        System.out.println (proizvod);

        if (suma > proizvod)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {

        int[] niz = {1,2,3,4,5,6, 0};

        System.out.println (sumaVecaOdProizvoda (niz));

    }
}
