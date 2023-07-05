package Pastebin.PastebinOOP.Zadatak12;
/*
 * Napisati klasu Krug koja nasledjuje klasu Elipsa
Ova klasa nema ni jedan atribut

Napisati 2 konstruktora:
- Jedan konstruktor koji prima double r i poziva odgovarajuci konstruktor natklase
- Jedan podrazumevani konstruktor

Napisati sve gettere i settere

Napisati metodu obim koja vraca obim kruga

 */
public class Krug extends Elipsa{
    public Krug(double r) {
        super (r, r);
    }

    public Krug() {
    }
    public double obimKruga(){
        return 2*getA ()*Math.PI;
    }
    /*
    Overridovati toString() metod tako da vraca nisku oblika:
            "Elipsa poluprecnika <r> ima
    Obim: <obim>
    Povrsinu: <povrsina>
    Ekscentritet: <eskcentritet>"
     */

    @Override
    public String toString() {
        StringBuilder sb  = new StringBuilder ();
        sb.append ("Elipsa poluprecnika ").append (getB ()).append (" ima: ").append ("\n");
        sb.append ("Obim: ").append (obimKruga ()).append ("\n");
        sb.append ("Povrsinu ").append (povrsina ()).append ("\n");
        sb.append ("Ekscentritet ").append (ekscentritet ());
        return sb.toString ();
    }
}
