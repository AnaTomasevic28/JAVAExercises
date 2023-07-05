package Pastebin.Pastebin.Nizovi;


//8. Napisati funkciju koja ispisuje sve parne brojeve zadatog niza.
public class PostebinNizovi8 {

static void parniBrojeviNiza (int[] niz){

    for (int i = 0; i < niz.length; i++) {
        if (niz[i] % 2 == 0){
            System.out.print (niz[i] + " ");
        }
    }

}


    public static void main(String[] args) {

        int[] niz = {2,5,48,78,63,59,31};

        parniBrojeviNiza (niz);
    }
}
