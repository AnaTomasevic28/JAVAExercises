package Pastebin.PastebinOOP.Zadatak11;
/*
 * Napisati klasu Kvadrat koja nasledjuje klasu Pravougaonik.
Ova klasa nema ni jedan atribut.

Napisati 2 konstruktora
- Jedan konstruktor koji prima double a i poziva prvi konstruktor iz natklase
- Podrazumevani konstruktor koji poziva podrazumevani konstruktor natklase.

Overridovati toString() metod natklase tako da vraca nisku oblika:
"Kvadrat strainca <a> i <b>
 Obim: <obim>
 Povrsina: <povrsina>"
 */
public class Kvadrat extends Pravougaonik {
    public Kvadrat(double a, double b) {
        super (a, b);
    }

    public Kvadrat(double a) {
        super (a, a);
    }
@Override
public String toString() {
    String s1 = "Kvadrat stranica " + getA () + " i " + getA () + "\n";
    String s2 = "Obim: " + obim () + "\n";
    String s3 = "Povrsina: " + povrsina ();
    return s1+s2+s3;
}
}
