package Pastebin.PastebinOOP.Zadatak7;

import Pastebin.PastebinOOP.Zadatak1.Osoba;

/*
 *7. Napisati naredne klase:
vozilo  - Napisati klasu Automobil. Automobil ima
1) marku (polje tipa String) koje moze da se dohvati, ali ne i postavi;
2) model (polje tipa String) koje moze da se dohvati ali ne i postavi;
3) serijski broj (neka u ovom zadatku bude polje tipa int) koje moze da se dohvati ali ne i postavi;
Automobil moze da ima 4) vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku
* Napisati klasu Voznja iz koje ce program moci da se pokrene.
* U njoj ce se kreirati najmanje dva automobila.
* Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.
*/
public class Automobil {
    private String marka;
    private String model;
    private int serijskiBroj;
    private Osoba vlasnik;

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getSerijskiBroj() {
        return serijskiBroj;
    }

    public Osoba getVlasnik() {
        if (vlasnik != null)
            return vlasnik;
        else
            System.out.println ("Automobil nema vlasnika.");
            return vlasnik;
    }

    public Automobil(String marka, String model, int serijskiBroj, Osoba vlasnik) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
        this.vlasnik = vlasnik;
    }

    public Automobil(String marka, String model, int serijskiBroj) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append ("Automobil marke " ).append (marka).append (" model ").append (model);
        sb.append (" ima serijski broj ").append (serijskiBroj);
        if (vlasnik == null) {
            sb.append (" i nema vlasnika ");
        }
        else sb.append (" i u vlasnistvu je ").append (vlasnik.getIme () + " ").append (vlasnik.getPrezime ());
        return sb.toString ();
    }
}
