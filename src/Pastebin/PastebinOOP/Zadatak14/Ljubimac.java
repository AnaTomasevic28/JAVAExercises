package Pastebin.PastebinOOP.Zadatak14;
/*
 * Napisati klasu Ljubimac koja ima atribute:
- String ime
- String red
- int brojNogu
- boolean leti
- double tezina

Napraviti jedan konstruktor koji prima sve argumente
Napraviti jedan prazan konstruktor koji postavlja sve niske na "" a ostale vrednosti na podrazumevane

Napisati sve gettere i settere
 */
public class Ljubimac {
    private String ime;
    private String red;
    private int brojNogu;
    private boolean leti;
    private double tezina;

    public Ljubimac(String ime, String red, int brojNogu, boolean leti, double tezina) {
        this.ime = ime;
        this.red = red;
        this.brojNogu = brojNogu;
        this.leti = leti;
        this.tezina = tezina;
    }

    public Ljubimac() {
        this.ime = "";
        this.red = "";
        this.leti = false;
        this.brojNogu = 0;
        this.tezina = 0;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public int getBrojNogu() {
        return brojNogu;
    }

    public void setBrojNogu(int brojNogu) {
        this.brojNogu = brojNogu;
    }

    public boolean isLeti() {
        return leti;
    }

    public void setLeti(boolean leti) {
        this.leti = leti;
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }
    //Overridovati toString() metod:
    //"Ime ljubimca je: <ime>
    // Tip ljubimca je: <red>
    // Ovaj ljubimac ima: <brojNogu> nogu
    // Ovaj ljubimac leti/ne leti
    // Ovaj ljubimca je tezak: <tezina>kg."`

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append ("Ime ljubimca je: ").append (ime).append ("\n");
        sb.append ("Tip ljubimca je: ").append (red).append ("\n");
        sb.append ("Ovaj ljubimac ima ").append (brojNogu).append (" nogu").append ("\n");
        if (leti){
            sb.append ("Ovaj ljubimac leti.").append ("\n");
        }
        else{
            sb.append ("Ovaj ljubimac ne leti.").append ("\n");
        }
        sb.append ("Ovaj ljubimac je tezak ").append (tezina).append (" kilograma.");
        return sb.toString ();
    }
}
