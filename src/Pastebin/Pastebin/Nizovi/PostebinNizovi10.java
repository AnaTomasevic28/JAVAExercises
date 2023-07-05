package Pastebin.Pastebin.Nizovi;

//10.* Napisati funkciju koja vraca najmanji element niza.

public class PostebinNizovi10 {

    public static int najmanjiBrojNiza (int[] niz){

        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] < minimum){
                minimum = niz[i];
            }
        }

        return minimum;
    }

    public static void main(String[] args) {

        int[] niz = {2,5,48,78,63,59,31};

        System.out.println (najmanjiBrojNiza (niz));
    }
}
