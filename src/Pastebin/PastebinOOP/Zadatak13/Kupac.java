package Pastebin.PastebinOOP.Zadatak13;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Napisati klasu Kupac koji prosiruje klasu Osoba i ima atribute:
- Korpa korpa
- ArrayList<Namirnice> kupljeneNamirnice
- double novac

Napisati konstruktor koji prima double n i postavlja novac na n, i kreira novu praznu korpu, i novu praznu ArrayListu kupljenih namirnica.
Ukoliko je n nepozitivan broj, postaviti ga na 100.

Napisati sve gettere i settere

Napisati metode:
1. dodajUkorpu(Namirnica n) - koja dodaje u korpu neku namirnicu n i dodaje na cenuKorpe odgovarajucu cenu namirnice
2. dodajUkorpu(Namirnica n, int k) - koja dodaje u korpu neku namirnicu n k puta i dodaje na cenuKorpe odgovarajucu cenu svih tih namirnica.
3. ukloniIzKorpe(Namirnica n) - koja prima referencu na neku Namirnicu uklanja iz korpe jednu
                                kopiju takve namirnice. Oduzeti od ceneKorpe cenu tog artikla. Ukoliko nema tog
                                artikla u korpi, uraditi nista.
4. ukloniIzKorpe(Namirnica n, int k) - koja radi kao metoda 3, s time sto brise k kopija takve namirnice. Ukoliko u korpi ima manje od k broja
                                       takve namirnice, obrisati sve takve namirnice.
5. ukloniIzKorpeSveNamirniceN(Namirnica n) - radi kao 3. metoda, s time sto uklanja sve kopije takve namirnice.
6. isprazniKorpu - koja prazni korpu i postavlja cenuKorpe na odgovarajucu vrednos.
7. cenaKrope - koja vraca ukupnu cenu korpe
8. kupi - koja kupuje sve namirnice iz korpe. Tj. prvo proverava da li kupac ima dovoljno novca. Ukoliko nema ispisati poruku
          "Nemate dovoljno novca". Ukoliko ima dovoljno novca, isprazniti mu citavu korpu i dodati te namirnice u ArrayListu kupljenih namirnica i oduzeti od novca cenu korpe.

Overridovati toString() metod na sledeci nacin:
"Kupac <ime> <prezime> <brGodina> ima u korpi:
 <imeNamirnice1> | <brojKopijaNamirnice1> | <cenaSvihNamirnica1>
 ...
 <imeNamirniceN> | <brojKopijaNamirniceN> | <cenaSvihNamirnicaN>
 Cena korpe je: <cenaKopre>
 --------------------------
 Od kupljenih namirnica ima:
 <imeNamirnice1> | <brojKopijaNamirnice1>
 ...
 <imeNamirniceN> | <brojKopijaNamirniceN>
 Ukupna cena kupljenih namimirnica je je: <cenaKupljenih namirnica>
 */
public class Kupac extends Osoba {
    private Korpa korpaKupca;
    private ArrayList<Namirnica> kupljeneNamirnice;
    private double novac;

    public Kupac(String ime, String prezime, double n) {
        super (ime, prezime);
        this.korpaKupca = null;
        this.kupljeneNamirnice = new ArrayList<> ();
        if (n < 0){
            this.novac = 100;
        }else this.novac = n;
    }
    public Kupac(Osoba o, double n) {
        super (o.getIme (), o.getPrezime ());
        this.korpaKupca = new Korpa ();
        this.kupljeneNamirnice = new ArrayList<> ();
        if (n < 0){
            this.novac = 100;
        }else this.novac = n;
    }

    public Korpa getKorpaKupca() {
        return korpaKupca;
    }

    public void setKorpaKupca(Korpa korpaKupca) {
        this.korpaKupca = korpaKupca;
    }

    public ArrayList<Namirnica> getKupljeneNamirnice() {
        return kupljeneNamirnice;
    }

    public void setKupljeneNamirnice(ArrayList<Namirnica> kupljeneNamirnice) {
        this.kupljeneNamirnice = kupljeneNamirnice;
    }

    public double getNovac() {
        return novac;
    }

    public void setNovac(double novac) {
        this.novac = novac;
    }
    public void dodajUKorpuKupca(Namirnica n){
        korpaKupca.getKorpaNamirnica ().add (n);
        korpaKupca.setCenaKorpe (korpaKupca.getCenaKorpe () + n.getCena ());
    }
    public void dodajUKorpuKupca(Namirnica n, int k){
        int i = 1;
        while(i <= k){
            korpaKupca.getKorpaNamirnica().add(n);
            korpaKupca.setCenaKorpe (korpaKupca.getCenaKorpe () + n.getCena ());
            i++;
        }
    }
    public void ukloniIzKorpe(Namirnica n){

        for (int i = 0; i < korpaKupca.getKorpaNamirnica ().size (); i++) {
            if (korpaKupca.getKorpaNamirnica ().get (i).daLiSuIste (n)){
                korpaKupca.getKorpaNamirnica ().remove (korpaKupca.getKorpaNamirnica ().get (i));
                korpaKupca.setCenaKorpe (korpaKupca.getCenaKorpe () - n.getCena ());
                break;
            }
        }
    }
    public void ukloniIzKorpe(Namirnica n, int k){
        int kolikoIhIma = 0;
        for (int i = 0; i < korpaKupca.getKorpaNamirnica ().size (); i++) {
            if (n.daLiSuIste (korpaKupca.getKorpaNamirnica ().get (i))){
                kolikoIhIma++;
            }
        }
        if(kolikoIhIma < k) {
            for (int i = 0; i < korpaKupca.getKorpaNamirnica ().size (); i++) {
                if (n.daLiSuIste (korpaKupca.getKorpaNamirnica ().get (i))) {
                    korpaKupca.getKorpaNamirnica ().remove (korpaKupca.getKorpaNamirnica ().get (i));
                    i--;
                    korpaKupca.setCenaKorpe (korpaKupca.getCenaKorpe ()- n.getCena ());
                }
            }
        }else {
            int brojac = 1;
            for (int i = 0; i < korpaKupca.getKorpaNamirnica ().size (); i++) {
                if (n.daLiSuIste (korpaKupca.getKorpaNamirnica ().get (i)) && brojac <= k) {
                    korpaKupca.getKorpaNamirnica ().remove (korpaKupca.getKorpaNamirnica ().get (i));
                    i--;
                    korpaKupca.setCenaKorpe (korpaKupca.getCenaKorpe ()- n.getCena ());
                    brojac++;
                }
            }
        }
    }
    public void ukloniIzKorpeSveNamirniceN(Namirnica n){
        for (int i = 0; i < korpaKupca.getKorpaNamirnica ().size (); i++) {
            if (korpaKupca.getKorpaNamirnica ().get (i).daLiSuIste (n)){
                korpaKupca.getKorpaNamirnica ().remove (korpaKupca.getKorpaNamirnica ().get (i));
                i--;
                korpaKupca.setCenaKorpe (korpaKupca.getCenaKorpe () - n.getCena ());
            }
        }

    }
    public void isprazniKorpu(){
        korpaKupca.getKorpaNamirnica ().clear ();
        korpaKupca.setCenaKorpe (0);
    }

    public double cenaKorpe(){
        return korpaKupca.getCenaKorpe ();
    }

    public void kupi(){
        if (korpaKupca.getCenaKorpe () > novac){
            System.out.println ("Nemate dovoljno novca");
        }
        else {
            kupljeneNamirnice.addAll (korpaKupca.getKorpaNamirnica ());
            novac -= korpaKupca.getCenaKorpe ();
            korpaKupca.setCenaKorpe (0);
            korpaKupca.getKorpaNamirnica ().clear ();
        }
    }
    //Overridovati toString() metod na sledeci nacin:
    //"Kupac <ime> <prezime> <brGodina> ima u korpi:
    // <imeNamirnice1> | <brojKopijaNamirnice1> | <cenaSvihNamirnica1>
    // ...
    // <imeNamirniceN> | <brojKopijaNamirniceN> | <cenaSvihNamirnicaN>
    // Cena korpe je: <cenaKopre>
    // --------------------------
    // Od kupljenih namirnica ima:
    // <imeNamirnice1> | <brojKopijaNamirnice1>
    // ...
    // <imeNamirniceN> | <brojKopijaNamirniceN>
    // Ukupna cena kupljenih namimirnica je je: <cenaKupljenih namirnica>
    public int kolikoIhIma(Namirnica n){
        int kolikoIhIma = 0;
        for (int i = 0; i < kupljeneNamirnice.size (); i++) {
            if (n.daLiSuIste (kupljeneNamirnice.get (i))){
                kolikoIhIma++;
            }
        }
        return kolikoIhIma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append ("Kupac ").append (getIme ()).append (" ").append (getPrezime ()).append (" ima u korpi:").append ("\n");
        sb.append (korpaKupca.toString ()).append ("\n");
        sb.append ("Od kupljenih namirnica ima: ").append ("\n");

        ArrayList<Namirnica> listaBezDuplikata = new ArrayList<> ();
        for (int i = 0; i < kupljeneNamirnice.size (); i++) {
            listaBezDuplikata.add (kupljeneNamirnice.get (i));
        }
        for (int i = 0; i < listaBezDuplikata.size (); i++) {
            for (int j = i+1; j < listaBezDuplikata.size (); j++) {
                if (listaBezDuplikata.get (j).daLiSuIste (listaBezDuplikata.get (i))){
                    listaBezDuplikata.remove (j);
                    j--;
                }
            }
        }
        for (int i = 0; i < listaBezDuplikata.size (); i++) {
            sb.append (listaBezDuplikata.get (i).getIme ()).append ("|").append (kolikoIhIma (kupljeneNamirnice.get (i))).append ("\n");
        }
        sb.append ("Cena korpe je: ").append (korpaKupca.cenaKrope ()).append ("\n");
        sb.append ("Ukupna cena kupljenih namirnica je: ");
        double cenaKupljenihNamirnica = 0;
        for (int i = 0; i < kupljeneNamirnice.size (); i++) {
            cenaKupljenihNamirnica += kupljeneNamirnice.get (i).getCena ();
        }
        sb.append (cenaKupljenihNamirnica);
        return sb.toString ();
    }
}
