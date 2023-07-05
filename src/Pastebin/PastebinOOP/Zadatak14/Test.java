package Pastebin.PastebinOOP.Zadatak14;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Osoba o = new Osoba ("Nemanja", "Tufegdzic");

        Ljubimac pas1 = new Ljubimac ("Adolf", "pas", 4, false, 20);
        Ljubimac pas2 = new Ljubimac ("Kjara", "pas",4, false, 3);
        Ljubimac papagaj = new Ljubimac ("Cira", "papagaj", 2, true, 0.1);
        Ljubimac ribica = new Ljubimac ("Anabela", "riba", 0, false, 0.02);
//        System.out.println (pas1);

        ArrayList<Ljubimac> ljubimci = new ArrayList<> ();


        Vlasnik vlasnik = new Vlasnik (o, ljubimci);
        vlasnik.dodajLjubimca (pas1);
        vlasnik.dodajLjubimca (pas2);
        vlasnik.dodajLjubimca (papagaj);
        vlasnik.dodajLjubimca (ribica);
        vlasnik.oduzmiLjubimca (ribica);

//       System.out.println (vlasnik);

       Odgajivac odgajivac = new Odgajivac (vlasnik, "pas");

        System.out.println (odgajivac.vratiSveLjubimceKojeOdgajas ());
//        odgajivac.ispisiSveLjubimceKojeOdgajas ();

    }
}
