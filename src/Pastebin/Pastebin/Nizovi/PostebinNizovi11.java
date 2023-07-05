package Pastebin.Pastebin.Nizovi;

//11. Napisati funkciju koja duplira sve elemente niza.
//        Primer: [1, 2, 3, 4, 5] -> [2, 4, 6, 8, 10]

public class PostebinNizovi11 {

    public static int[] dupliraniElNiza (int[] niz){

        for (int i = 0; i < niz.length; i++) {
            niz[i] *= 2;
        }

        return niz;
    }

    public static void main(String[] args) {

        int[] niz = {2,3,4,5,6};

        dupliraniElNiza (niz);

        for (int i = 0; i < niz.length; i++) {
            System.out.print (niz[i] + " ");
        }

    }
}
