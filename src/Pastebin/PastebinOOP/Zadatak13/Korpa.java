package Pastebin.PastebinOOP.Zadatak13;

import java.util.ArrayList;

/*
 * Napisati klasu Korpa koja ima atribute:
- ArrayList<Namirnice>
- double cenaKorpe

Napisati podrazumevani konstruktor koji postavlja ArrayListu na novu ArrayListu i cenaKorpe na 0.

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

Overridovati toString() metod kao:
"<imeNamirnice1> | <brojKopijaNamirnice1> | <cenaSvihNamirnica1>
 ...
 <imeNamirniceN> | <brojKopijaNamirniceN> | <cenaSvihNamirnicaN>
 Cena korpe je: <cenaKopre>"
--------------------------------------------------------------------------
 */
public class Korpa {
    private ArrayList<Namirnica> korpaNamirnica;
    private double cenaKorpe;

    public Korpa() {
        this.korpaNamirnica = new ArrayList<> ();
        this.cenaKorpe = 0;
    }

    public ArrayList<Namirnica> getKorpaNamirnica() {
        return korpaNamirnica;
    }

    public void setKorpaNamirnica(ArrayList<Namirnica> korpaNamirnica) {
        this.korpaNamirnica = korpaNamirnica;
    }

    public double getCenaKorpe() {
        return cenaKorpe;
    }

    public void setCenaKorpe(double cenaKorpe) {
        this.cenaKorpe = cenaKorpe;
    }

    public void dodajUKorpu(Namirnica n){
        korpaNamirnica.add (n);
        cenaKorpe += n.getCena ();
    }
    public void dodajUkorpu(Namirnica n, int k){
        int i = 1;
        while( i <= k) {
            korpaNamirnica.add (n);
            cenaKorpe += n.getCena ();
            i++;
        }
    }

    //ukloniIzKorpe(Namirnica n) - koja prima referencu na neku Namirnicu uklanja iz korpe jednu
    //                                kopiju takve namirnice. Oduzeti od ceneKorpe cenu tog artikla. Ukoliko nema tog
    //                                artikla u korpi, uraditi nista.
    public void ukloniIzKorpe(Namirnica n){
        for (int i = 0; i < korpaNamirnica.size (); i++) {
            if (n.daLiSuIste (korpaNamirnica.get (i))){
                korpaNamirnica.remove (korpaNamirnica.get (i));
                cenaKorpe -= n.getCena ();
                break;
            }
        }
    }
    //ukloniIzKorpe(Namirnica n, int k) - koja radi kao metoda 3, s time sto brise k kopija takve namirnice. Ukoliko u korpi ima manje od k broja
    //                                       takve namirnice, obrisati sve takve namirnice.
    public void ukloniIzKorpe(Namirnica n, int k){
        int kolikoIhIma = 0;
        for (int i = 0; i < korpaNamirnica.size (); i++) {
            if (n.daLiSuIste (korpaNamirnica.get (i))){
                kolikoIhIma++;
            }
        }
        if(kolikoIhIma < k) {
            for (int i = 0; i < korpaNamirnica.size (); i++) {
                if (n.daLiSuIste (korpaNamirnica.get (i))) {
                    korpaNamirnica.remove (korpaNamirnica.get (i));
                    i--;
                    cenaKorpe -= n.getCena ();
                }
            }
        }else {
            int brojac = 1;
            for (int i = 0; i < korpaNamirnica.size (); i++) {
                if (n.daLiSuIste (korpaNamirnica.get (i)) && brojac <= k) {
                    korpaNamirnica.remove (korpaNamirnica.get (i));
                    i--;
                    cenaKorpe -= n.getCena ();
                    brojac++;
                }
            }
        }

    }
    //ukloniIzKorpeSveNamirniceN(Namirnica n) - radi kao 3. metoda, s time sto uklanja sve kopije takve namirnice.

    public void ukloniIzKorpeSveNamirniceN(Namirnica n){
        for (int i = 0; i < korpaNamirnica.size (); i++) {
            if (n.daLiSuIste (korpaNamirnica.get (i))) {
                korpaNamirnica.remove (korpaNamirnica.get (i));
                i--;
                cenaKorpe -= n.getCena ();
            }
        }
    }
    //isprazniKorpu - koja prazni korpu i postavlja cenuKorpe na odgovarajucu vrednos.
    public void isprazniKorpu(){
        korpaNamirnica.clear ();
        setCenaKorpe (0);
    }
    public double cenaKrope(){
        return getCenaKorpe ();
    } //- koja vraca ukupnu cenu korpe

    public int kolikoIhIma(Namirnica n){
        int kolikoIhIma = 0;
        for (int i = 0; i < korpaNamirnica.size (); i++) {
            if (n.daLiSuIste (korpaNamirnica.get (i))){
                kolikoIhIma++;
            }
        }
        return kolikoIhIma;
    }

    //Overridovati toString() metod kao:
    //"<imeNamirnice1> | <brojKopijaNamirnice1> | <cenaSvihNamirnica1>
    // ...
    // <imeNamirniceN> | <brojKopijaNamirniceN> | <cenaSvihNamirnicaN>
    // Cena korpe je: <cenaKopre>"

    @Override
    public String toString() {
        ArrayList<Namirnica> listaUnikat = new ArrayList<> ();
        for (int i = 0; i < korpaNamirnica.size (); i++) {
            listaUnikat.add (korpaNamirnica.get (i));
        }

        for (int i = 0; i < listaUnikat.size (); i++) {
            for (int j = i+1; j < listaUnikat.size (); j++) {
                if (listaUnikat.get (j).daLiSuIste (listaUnikat.get (i))) {
                    listaUnikat.remove (j);
                    j--;
                }
            }
        }

        StringBuilder sb = new StringBuilder ();

        for (int i = 0; i < listaUnikat.size (); i++) {
            sb.append (listaUnikat.get (i).getIme ()).append ("|").
                    append (kolikoIhIma (listaUnikat.get (i))).append ("|").
                    append (kolikoIhIma (listaUnikat.get (i))*listaUnikat.get (i).getCena ()).append ("\n");
        }
        sb.append ("\n").append ("Cena korpe je: ").append (cenaKorpe);
        return sb.toString ();
    }
}
