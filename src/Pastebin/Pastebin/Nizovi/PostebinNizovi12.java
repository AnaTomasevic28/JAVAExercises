package Pastebin.Pastebin.Nizovi;

public class PostebinNizovi12 {

//12. Napisati funkciju koja sabira 2 niza iste duzine element po element. (Dakle prosledjujemo 2 niza, a vracamo taj novi niz)
//    Primer: [2, 4, 6] + [1, 4, 4]  -> [3, 8, 10]

    public static int[] sabranNiz (int[] niz1, int[] niz2){
        int[] noviNiz = new int[niz1.length];

        for (int i = 0; i < niz1.length; i++) {
            noviNiz [i] = niz1[i] + niz2[i];
        }


        return noviNiz;
    }


    public static void main(String[] args) {

        int[] niz1 = {1, 2, 3, 4, 5};
        int[] niz2 = {6, 7, 8, 9, 10};

        int[] noviNiz = sabranNiz (niz1, niz2);

        for (int i = 0; i < noviNiz.length; i++) {
            System.out.print (noviNiz[i] + " ");
        }



    }
}
