package nedelja2.Cetvrtak.Funkcije;

public class Zadatak7 {

    //    * III Napisati funkciju koja racuna prosek double niza

    static double prosekDoubleNiza (double[] niz){
        double zbir = 0;
        for (int i = 0; i < niz.length; i++) {
            zbir += niz[i];
        }
        double prosek = zbir/niz.length;
        return prosek;
    }

    public static void main(String[] args) {

//        double[] nizDoubleBrojeva = {1.5, 1.5, 3.0, 6.0};
//
//        double prosecnaVrednostElementa = prosekDoubleNiza (nizDoubleBrojeva);
//        System.out.println (prosecnaVrednostElementa);

        System.out.println ( new double[] {1.5, 1.5, 3.0, 6.0});

    }
}
