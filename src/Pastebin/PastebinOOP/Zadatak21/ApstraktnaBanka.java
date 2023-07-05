package Pastebin.PastebinOOP.Zadatak21;

import java.util.ArrayList;

/*
 *Napisati abstraktnu klasu AbstraktnaBanka koja implementuje interfejs Menjanje koja ima polja:
- TipBanke tipBanke
- String naziv
- ArrayList<String> valuteKojePrima

Napisati sve odgovarajuce konstruktore i gettere i settere.

Napisati abstraktne metode:
1. String pozdrav() - koja vraca slogan banke

Napisati metode:


Implementovati metodu:
1. ispisiDevize() - koja ispisuje celu listu valutaKojePrima
 */
public abstract class ApstraktnaBanka implements Menjanje{
    private TipBanke tipBanke;
    private String naziv;
    private ArrayList<String> valuteKojePrima;

    public ApstraktnaBanka(TipBanke tipBanke, String naziv, ArrayList<String> valuteKojePrima) {
        this.tipBanke = tipBanke;
        this.naziv = naziv;
        this.valuteKojePrima = valuteKojePrima;
    }

    public ApstraktnaBanka() {
        this.tipBanke = TipBanke.PRIVATNA_BANKA;
        this.naziv = "";
        this.valuteKojePrima = new ArrayList<> ();
    }

    public TipBanke getTipBanke() {
        return tipBanke;
    }

    public void setTipBanke(TipBanke tipBanke) {
        this.tipBanke = tipBanke;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<String> getValuteKojePrima() {
        return valuteKojePrima;
    }

    public void setValuteKojePrima(ArrayList<String> valuteKojePrima) {
        this.valuteKojePrima = valuteKojePrima;
    }

    public abstract String pozdrav();
    /*
    1. dodajValutu(String curr) - dodaje valutu curr u listu valuta
2. izbrisiValutu(String curr) - brise valutu curr iz liste valuta
3. promeniValutu(int i, String newCurr) - koja menja valutu na indexu i u listi valutu na novu valutu newCurr
4. izbrisiValutu(int i) - brise valutu na indexu i iz liste valuta
     */
    public void dodajValutu(String curr){

    }

}
