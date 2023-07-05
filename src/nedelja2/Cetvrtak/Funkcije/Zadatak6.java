package nedelja2.Cetvrtak.Funkcije;

public class Zadatak6 {

    // II Napisati funkcije koje racunaju (vracaju)
    //    *    zbir brojeva zadataog niza (int[], double[])

    static int zbirIntNiza (int[] niz){
        int rezultat = 0;
        for (int i = 0; i < niz.length; i++) {
            rezultat += niz[i];
        }
        return rezultat;
    }

    static double zbirDoubleNiza (double[] niz){
        double rezultat1 = 0;
        for (int i = 0; i < niz.length; i++) {
            rezultat1 += niz[i];
        }
        return rezultat1;
    }

    public static void main(String[] args) {

        int[] intNIz = {1,2,3,4,5};

        int zbir = zbirIntNiza (intNIz);
        System.out.println (zbir);



        double[] doubleNiz = {1.5, 1.5};

        double zbir1 = zbirDoubleNiza (doubleNiz);
        System.out.println (zbir1);

    }
}
