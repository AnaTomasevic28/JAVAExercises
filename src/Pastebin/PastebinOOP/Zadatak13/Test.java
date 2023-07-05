package Pastebin.PastebinOOP.Zadatak13;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Osoba osoba = new Osoba ("Ana", "Tomasevic");

        Namirnica hleb = new Namirnica ("Hleb", 50);
        Namirnica mleko = new Namirnica ("Mleko", 180);
        Namirnica jogurt = new Namirnica ("Jogurt", 220);
        Namirnica kafa = new Namirnica ("Kafa", 380);
        Namirnica hleb1 = new Namirnica ("Hleb", 50);
        Namirnica hleb2 = new Namirnica ("Hleb", 50);

        Korpa korpa = new Korpa ();
        korpa.dodajUKorpu (hleb);
        korpa.dodajUKorpu (hleb);
        korpa.dodajUKorpu (hleb);
        korpa.dodajUkorpu (mleko, 3);
//        System.out.println (korpa.getKorpaNamirnica ());
//        korpa.ukloniIzKorpeSveNamirniceN (mleko);
//        System.out.println (korpa.getKorpaNamirnica ());
//        korpa.isprazniKorpu ();
//        System.out.println (korpa.getKorpaNamirnica ());
//        System.out.println (korpa.cenaKrope ());
 //     System.out.println (korpa);
//        korpa.ukloniIzKorpe (mleko, 1);
//        korpa.ukloniIzKorpe (hleb);
 //       System.out.println (korpa);

        Kupac kupac = new Kupac (osoba, -100);
////        System.out.println (kupac);
////        System.out.println (kupac.getNovac ());
        kupac.setKorpaKupca (korpa);
////        kupac.kupi ();
        kupac.dodajUKorpuKupca (jogurt, 3);
//        kupac.ukloniIzKorpeSveNamirniceN (hleb);
        kupac.setNovac (2000);
        kupac.kupi ();
//        System.out.println (kupac.getKupljeneNamirnice ());
//        System.out.println (kupac.cenaKorpe ());
//        kupac.ukloniIzKorpe (jogurt, 2);
//        System.out.println (korpa);
        System.out.println (kupac);
//        System.out.println (kupac.cenaKorpe ());

    }
}
