package Pastebin.PastebinOOP.Zadatak16;

public class Test {
    public static void main(String[] args) {
//        Automobil a1 = new Automobil ("BG924DF", "Skoda", "drumsko", 5);
//        System.out.println (a1);
//        a1.oduzmiPutnika (1);
//        a1.isprazniAuto ();
//        a1.oduzmiPutnika ();
//        a1.dodajPutnika ();
//        a1.dodajPutnika (2);
//        a1.napuniAuto ();;
//        a1.setBrojPutnika (10);
//        a1.napuniAuto ();
//        System.out.println (a1.getBrojPutnika ());
        Kamion k1 = new Kamion ("BG254JL", "Scania", "drumsko");
//        k1.dodajProizvod ("jabuke");
//        k1.dodajProizvod ("kruske");
//        k1.oduzmiPorizvod ("jabuke");
//        System.out.println (k1.getProizvodi ());
        System.out.println (k1);
//        k1.dodajPutnika (3);
//        System.out.println (k1.brojTockova ());
        k1.dodajPutnika (2);
        k1.oduzmiPutnika (1);
        System.out.println (k1.getBrojPutnika ());

    }
}
