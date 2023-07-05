package Pastebin.Pastebin.Nizovi;
//
//26. Napisati funkciju koji za zadat ugao u radijanima
//    racuna zbir sinusa, kosinusa, tangensa i kotangensa tog ugla.
public class PostebinNizovi26 {
    static double radijaniUStepene (double radijani){

        // stepeni = (360 * radijani) / (2 * PI)

        double stepeni = (360 * radijani) / (2 * Math.PI);

        return stepeni;
    }
    static double zbirSinCosTgCtg (double radijan){

        double suma;

        suma = Math.cos (radijan) + Math.sin (radijan) + Math.tan (radijan) + 1 / Math.tan (radijan);

        return suma;
    }

    public static void main(String[] args) {
        double radijan = Math.PI;

        System.out.println (zbirSinCosTgCtg (radijan));
    }
}
