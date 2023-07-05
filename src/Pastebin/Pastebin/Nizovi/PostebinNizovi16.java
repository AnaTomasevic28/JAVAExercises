package Pastebin.Pastebin.Nizovi;

//16. Napisati funkciju koja racuna prosecnu vrednost double[] niza.


public class PostebinNizovi16 {

public static double prosecnaVrednostNiza (int[] niz) {
    int prosecnaVrednost = 0;
    int suma = 0;

    for (int i = 0; i < niz.length; i++) {
        suma += niz[i];
    }

    prosecnaVrednost = suma / niz.length;

    return prosecnaVrednost;
}

    public static void main(String[] args) {

        int[] niz = {2,4,6,8,10,12,14};

        System.out.println (prosecnaVrednostNiza (niz));

    }
}
