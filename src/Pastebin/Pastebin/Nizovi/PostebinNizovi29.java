package Pastebin.Pastebin.Nizovi;
//29. Napisati fuknciju koja vraca double duzinu poluprecnika kruga
//    za prosledjenu double povrsinu kruga.

public class PostebinNizovi29 {

    static double duzinaPoluprecnika(double povrsinaKruga){
//  P = r2 π;   r2 = P / PI;  r = koren od ( P / PI )

        return Math.sqrt (povrsinaKruga / Math.PI);

    }

    public static void main(String[] args) {
        double povrsinaKruga = 4 * Math.PI;

        System.out.println (duzinaPoluprecnika (povrsinaKruga));
    }
}
