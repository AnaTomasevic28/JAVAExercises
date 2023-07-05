package Pastebin.Pastebin.Nizovi;
//25.
//   a)Napisati funkciju koja konvertuje stepene u radijane.
//   b)Napisati funkciju koja konvertuje radijane u stepene.
//   (360 stepeni = 2*PI radijana)
public class PostebinNizovi25 {
    //  a)
    static double stepeniURadijane (double stepeni){

        //360 : 2*PI = 180 : x --> 360x = 360*PI --> x = PI
        //360 * radijani = 2PI * stepeni
        // radijani = (2*PI * stepeni) / 360

        double radijani = (2 * Math.PI * stepeni) / 360;

        return radijani;
    }
    //  b)
    static double radijaniUStepene (double radijani){

        // stepeni = (360 * radijani) / (2 * PI)

        double stepeni = (360 * radijani) / (2 * Math.PI);

        return stepeni;
    }

    public static void main(String[] args) {
        double stepeni = 180;
        double radijani = Math.PI;

        System.out.println (stepeniURadijane (stepeni));
        System.out.println (radijaniUStepene (radijani));
    }
}
