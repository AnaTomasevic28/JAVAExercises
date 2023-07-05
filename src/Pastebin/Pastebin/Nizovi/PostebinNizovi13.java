package Pastebin.Pastebin.Nizovi;


//13. Napisati funkciju koja nadovezuje 2 niza, drugi na kraj prvog.
//    Primer: [1, 2, 3] [17, 20, -3, 14, 20] -> [1, 2, 3, 17, 20, -3, 14, 20]
public class PostebinNizovi13 {

    public static int[] nadovezivanjeNizova ( int[] niz1, int[] niz2){

        int[] noviNiz = new int[niz1.length + niz2.length];


        if (niz1.length > niz2.length){

            for (int i = 0; i < niz2.length; i++) {
                noviNiz[i] = niz2[i];
            }
            for (int i = 0; i < niz1.length; i++) {
                noviNiz[i + niz2.length] = niz1[i];
            }
        } else if (niz2.length > niz1.length) {

            for (int i = 0; i < niz1.length; i++) {
                noviNiz[i] = niz1[i];
            }                       // 6
            for (int i = 0; i < niz2.length; i++) {
                noviNiz[i + niz1.length] = niz2[i];
            }
        }
        return noviNiz;
    }


    public static void main(String[] args) {

        int[] niz1 = {1,2,3,4};
        int[] niz2 = {5,6,7,8,9,10};

        int[] noviNiz = (nadovezivanjeNizova (niz1, niz2));

        for (int i = 0; i < noviNiz.length; i++) {
            System.out.print (noviNiz[i] + " ");
        }

    }

}
