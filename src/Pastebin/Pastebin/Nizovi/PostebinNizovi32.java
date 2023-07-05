package Pastebin.Pastebin.Nizovi;

//32. Napisati funkciju koja za zadati niz celih brojeva vraca taj niz zarotiran za 2 mesta udesno
//        Npr:
//        [1, 2, 3, 4, 5] -> [4, 5, 1, 2, 3]

public class PostebinNizovi32 {

    public static int[] zarotirajNiz (int[] niz){
        int[] zarotiranNiz = new int[niz.length];
        int n = 3;
       // int brojac = 0;

        for (int i = 0; i < zarotiranNiz.length; i++) {
            int j = (i+n+1) % niz.length;
            zarotiranNiz[i] = niz[j];
        }
//            if (i < 2)
//            zarotiranNiz[i] = niz[niz.length-2 + i];
//            else {
//                zarotiranNiz[i] = niz[brojac];
//                brojac++;
//            }
//        }
        return zarotiranNiz;
    }
                                            // (i+n+1) % niz.length
// i = 0; n = 3; niz.length = 5 ==>  3
// i = 1; n = 2; niz.length = 5 ==>  4
// i = 2; n = 2; niz.length = 5 ==>  0
// i = 3; n = 2; niz.length = 5 ==>  1
// i = 4; n = 2; niz.length = 5 ==>  2

    static void ispisNiza(int[] niz){
        for (int i = 0; i < niz.length; i++) {
            System.out.print (niz[i] + " ");
        }
    }

    public static void main(String[] args) {

        int [] niz = {1,2,3,4,5}; // 16,18,1,2,3,4,5,12,15

        ispisNiza (zarotirajNiz (niz));
        System.out.println ();
    }

}
