package Pastebin.Pastebin.Nizovi;

//33.** Napisati funkciju koja za zadati niz celih brojeva i zadati ceo broj k vraca taj niz zarotiran za k mesta, gde znak broja k
//      odredjuje smer rotacije.
//      Npr:
//      [1, 2, 3, 4, 5], k = 3 -> [3, 4, 5, 1, 2]
//      [1, 2, 3, 4, 5], k = -3 -> [4, 5, 1, 2, 3]
//      [1, 2], k = 0 -> [1, 2]
public class PostebinNizovi33 {

    static int[] zarotiranNizK(int[] niz, int k) {
//        int[] zarotiranNiz = new int[niz.length];
//
//        k = k % niz.length;
//
//        if (k > 0) {
//            for (int i = 0; i < niz.length; i++) {
//                if (k > i) {
//                    zarotiranNiz[i] = niz[niz.length - k + i]; // 5-3+0="3; 5-3+1="4; 5-3+2="5
//                } else {
//                    zarotiranNiz[i] = niz[i - k]; // 3 = 3-3 = 1;  4 = 4-3= 2;
//                }
//
//            }
//        }
//        else if (k < 0){
//            for (int i = 0; i < niz.length; i++) {   //      [1, 2, 3, 4, 5], k = -3 -> [4, 5, 1, 2, 3]
//                if (Math.abs (k) > i){
//                    zarotiranNiz[niz.length - 1 - i] = niz[ niz.length - k - i]; //5-3-0=2, 5-3-1=1, 5-3-2=0
//                }                //4, 3, 2   --> 4=2=>3, 3=1=>2, 2=0=>1
//                else
//                {
//                    zarotiranNiz[niz.length - 1 - i] = niz[];
//                }                   //1
//
//            }
//        }
//        return zarotiranNiz;

        k = k%niz.length;
        int[] zarotiranNiz = new int[niz.length];

        for(int i=0; i<niz.length; i++) {
            int j = (i+k+niz.length)%niz.length;
            zarotiranNiz[j] = niz[i];
        }
        return zarotiranNiz;
    }
        public static void main(String[]args){
            int[] originalNiz = {1, 2, 3, 4, 5};
            int n = 0;

            int[] noviNiz = zarotiranNizK (originalNiz, n);

            for (int i = 0; i < noviNiz.length; i++) {
                System.out.print (noviNiz[i] + " ");
            }
        }
    }


