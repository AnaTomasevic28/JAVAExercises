package Pastebin.Pastebin.Nizovi;

//31.* Napisati funkciju koja za zadati niz celih brojeva i neki zadati ceo broj n vraca niz tih brojeva iz kojeg je uklanjeno svako
//     pojavljivanje tog broja n, ako:
// a)  U zadatom nizu nema duplikata
// b)  U zadatom nizu moze biti duplikata

public class PostebinNizovi31 {

    static int[] nizBezN (int[] niz, int n){
        int duzinaNiza=0;

        for (int i = 0; i < niz.length; i++) {
            if(niz[i] != n){
                duzinaNiza++;
            }
        }

        int[] nizBezN = new int[duzinaNiza];
        int brojac = 0;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] != n){
                nizBezN[brojac] = niz[i];
                brojac++;
            }
        }

        return nizBezN;
    }

    public static void ispisNiza (int[] niz){
        for (int i = 0; i < niz.length; i++) {
            System.out.print (niz[i] + " ");
        }
        System.out.println ();
    }

    public static void main(String[] args) {
        int [] niz = {1,1,1,1,2,3,4,5,10,7,8,9,10};
        int n = 1;


        ispisNiza (nizBezN (niz,n));
    }
}
