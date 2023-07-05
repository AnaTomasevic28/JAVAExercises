package Pastebin.Pastebin.Nizovi;

//18.* Napisati funkciju koja deli proslednjen niz na dva jednaka dela i onda ih sabira element po element.
//     Npr:
//     [1, 2, 3, 4, 5, 6] -> [1, 2, 3] + [4, 5, 6] -> [5, 7, 9]
//     [1, 2, 3, 4, 5] -> [1, 2, 3] + [3, 4, 5] -> [4, 6, 8]
public class PostebinNizovi18 {

    public static int[] deobaIZbirNiza (int[] niz){
        int duzinaNiza = niz.length;
        System.out.println (duzinaNiza);

        int duzinaPolovineNiza;

        if (duzinaNiza % 2 == 0){
            duzinaPolovineNiza = duzinaNiza / 2;
        }
        else
            duzinaPolovineNiza = duzinaNiza / 2 + 1;

        int[] duploKraciNiz1 = new int[duzinaPolovineNiza];
        int[] duploKraciNiz2 = new int[duzinaPolovineNiza];
        int[] zbirKracihNizova = new int[duzinaPolovineNiza];

// formiranje prve polovine niza, niz1
        if(duzinaNiza % 2 != 0) {

            for (int i = 0; i < niz.length / 2 + 1; i++) {
                duploKraciNiz1[i] = niz[i];
            }

// ispis prve polovine niza

          ispisNiza (duploKraciNiz1);

// formiranje druge polovine niza, niz2

            int brojac = 0;

            for (int i = duploKraciNiz2.length - 1; i < niz.length; i++) {
                duploKraciNiz2[brojac] = niz[i];
                brojac++;
            }

// ispis druge polovine niza

            ispisNiza (duploKraciNiz2);

// forimiranje konacnog niza

            for (int i = 0; i < zbirKracihNizova.length; i++) {
                zbirKracihNizova[i] = duploKraciNiz1[i] + duploKraciNiz2[i];
            }
        }

        if (duzinaNiza % 2 == 0){
// formiranje prve polovine niza

                for (int i = 0; i < (niz.length / 2); i++) {
                    duploKraciNiz1[i] = niz[i];
                }

// ispis prve polovine niza

              ispisNiza (duploKraciNiz1);

// formiranje druge polovine niza

                int brojac = 0;

                for (int i = duploKraciNiz2.length; i < niz.length; i++) {
                    duploKraciNiz2[brojac] = niz[i];
                    brojac++;
                }

// ispis druge polovine niza

            ispisNiza (duploKraciNiz2);


// forimiranje konacnog niza

                for (int i = 0; i < zbirKracihNizova.length; i++) {
                    zbirKracihNizova[i] = duploKraciNiz1[i] + duploKraciNiz2[i];
                }
        }


        return zbirKracihNizova;
    }

    // funkcija za ispis niza

    public static void ispisNiza (int[] niz){

        for (int i = 0; i < niz.length; i++) {
            System.out.print (niz[i] + " ");
        }
        System.out.println ();
    }
//
//    static int[] podeliIOsvoji(int[] niz){
//        int[] resenje;
//        int[] niz1;
//        int[] niz2;
//        // delim na dva niza
//        if (niz.length % 2 == 0) {
//            resenje = new int[niz.length / 2];
//            niz1 = new int[niz.length / 2];
//            niz2 = new int[niz.length / 2];
//            for (int i = 0; i < niz1.length; i++) {
//                niz1[i] = niz[i];
//                niz2[i] = niz[i + niz1.length];
//            }
//        } else {
//            resenje = new int[niz.length / 2 + 1];
//            niz1 = new int[niz.length / 2 + 1];
//            niz2 = new int[niz.length / 2 + 1];
//            for (int i = 0; i < niz1.length; i++) {
//                niz1[i] = niz[i];
//                niz2[i] = niz[i + niz1.length - 1];
//            }
//        }
//
//        for (int i = 0; i < resenje.length; i++) {
//            resenje[i] = niz1[i] + niz2[i];
//        }
//
//        return resenje;
//    }

    public static void main(String[] args) {

        int[] niz = {10,20,30,40,50,60,70,80, 90};

        ispisNiza (niz);

        System.out.println ();

       ispisNiza (deobaIZbirNiza (niz));

    }
}
