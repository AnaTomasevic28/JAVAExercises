package Pastebin.PastebinOOP.Zadatak14;

import java.util.ArrayList;

/*
 * Napisati klasu Vlasnik koja ima atribute:
- ArrayListLjubimac> ljubimci

Napraviti jedan pun konstruktor i jedan konstruktor koji ne prima
ArrayListu, vec kreira sam novu, praznu ArrayListu

Napisati sve gettere i ssettere

Napisati metode:
1. dodajLjubimca - koja dodaje ljubimca u listu ljubimaca
2. oduzmiLjubimca - koja oduzima ljubimca iz liste ljubimaca

 */
public class Vlasnik extends Osoba{
    private ArrayList<Ljubimac> ljubimci;

    public Vlasnik(String ime, String prezime, ArrayList<Ljubimac> ljubimci) {
        super (ime, prezime);
        this.ljubimci = ljubimci;
    }

    public Vlasnik(Osoba o , ArrayList<Ljubimac> ljubimci) {
        super(o.getIme (), o.getPrezime ());
        this.ljubimci = ljubimci;
    }

    public Vlasnik() {
        this.ljubimci = new ArrayList<> ();
    }

    public ArrayList<Ljubimac> getLjubimci() {
        return ljubimci;
    }

    public void setLjubimci(ArrayList<Ljubimac> ljubimci) {
        this.ljubimci = ljubimci;
    }
    public void dodajLjubimca(Ljubimac x){
        ljubimci.add (x);
    }
    public void oduzmiLjubimca(Ljubimac x){
        ljubimci.remove (x);
    }
    /*
    Overridovati toString() metod:
"<ime> <prezime> <brojGodina> ima ljubimce:
 <ljubimac1.toString()>
 ...
 <ljubimacN.toString()>"
     */

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder ();
       sb.append (getIme ()).append (" ").append (getPrezime ()).append (" ima ljubimce: ").append ("\n");
        for (int i = 0; i < ljubimci.size (); i++) {
            sb.append (ljubimci.get (i).toString ()).append ("\n");
        }
        return sb.toString ();
    }
}
