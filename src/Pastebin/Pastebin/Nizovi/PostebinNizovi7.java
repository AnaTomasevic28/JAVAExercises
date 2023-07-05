package Pastebin.Pastebin.Nizovi;


//7. Napisati funkciju koja ispisuje sve neparne brojeve zadatog niza.
public class PostebinNizovi7 {

    static void neparniBrojeviNiza (int[] niz){

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 != 0){
                System.out.print (niz[i] + " ");
            }
        }

    }

    public static void main(String[] args) {


        int[] niz = {2,5,48,78,63,59,31};

        neparniBrojeviNiza (niz);
    }
}
