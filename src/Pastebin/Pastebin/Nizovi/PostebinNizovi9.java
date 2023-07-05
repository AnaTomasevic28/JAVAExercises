package Pastebin.Pastebin.Nizovi;

//9.* Napisati funkciju koja vraca najveci element niza.

public class PostebinNizovi9 {

    static int najveciBrojNiza (int[] niz){

        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > maximum){
                maximum = niz[i];
            }
        }

        return maximum;

    }

    public static void main(String[] args) {

        int[] niz = {2,5,48,78,63,59,31};

        System.out.println (najveciBrojNiza (niz));

    }
}
