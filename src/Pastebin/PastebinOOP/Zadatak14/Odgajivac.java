package Pastebin.PastebinOOP.Zadatak14;

import java.util.ArrayList;

/*
 * Napisati Klasu Odgajivac koji nasledjuje klasu Vlasnik i ima atribute:
- String kategorija

Napisati sve potrebne konstruktore

Napisati sve gettre i settere

Napisati metode:


Overridovati toString() metod:
"<ime> <prezime> <brojGodina> ima ljubimce:
 <ljubimac1.toString()>
 ...
 <ljubimacN.toString()>
 A odgaja ljubimce:
 <ljubimacKojegOdgajas1.toString()>
 ...
 <ljubimacKojegOdgajasK.toString()>"
 */
public class Odgajivac extends Vlasnik{
    private String kategorija;

    public Odgajivac(String ime, String prezime, ArrayList<Ljubimac> ljubimci, String kategorija) {
        super (ime, prezime, ljubimci);
        this.kategorija = kategorija;
    }

    public Odgajivac(Vlasnik v, String kategorija) {
        super(v.getIme (), v.getPrezime (), v.getLjubimci ());
        this.kategorija = kategorija;
    }

    public Odgajivac() {
        this.kategorija = "";
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }
    /*
    1. ispisiSveLjubimceKojeOdgajas() - koja ispisuje sve ljubimce koje odgajivac odgaja.
    2. vratiSveLjubimceKojeOdgajas() - koja vraca ArrayListu ljubimaca koje odgajivac odgaja.
        Odgajivac odgaja one ljubimce ciji se tip poklapa sa Kategorijom odgajivaca
        (npr Odgajivac.kategorija = "Pas", Ljubimac.red = "Pas")
     */
    public void ispisiSveLjubimceKojeOdgajas(){
        for (int i = 0; i < getLjubimci().size(); i++) {
            if (this.kategorija.equalsIgnoreCase(getLjubimci ().get (i).getRed ())){
                System.out.println(getLjubimci().get(i));
                System.out.println();
            }
        }
    }
    public ArrayList<Ljubimac> vratiSveLjubimceKojeOdgajas(){
        ArrayList<Ljubimac> lista = new ArrayList<> ();
        for (int i = 0; i < getLjubimci ().size (); i++) {
            if (this.kategorija.equalsIgnoreCase(getLjubimci ().get (i).getRed ())){
                lista.add (getLjubimci ().get (i));
            }
        }
        return lista;
    }
}
