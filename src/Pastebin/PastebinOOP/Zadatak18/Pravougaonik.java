package Pastebin.PastebinOOP.Zadatak18;
/*
 * Napisati klasu Pravougaonik koja nasledjuje klasu Paralelogram i nema atribute


Overridovati metod:
1. povrsina()
2. getIme() - vraca nisku "Pravougaonik"
 */
public class Pravougaonik extends Paralelogram{
    public Pravougaonik(double a, double b) {
        super (a, b);
    }

    @Override
    double povrsina() {
        return getA () * getB ();
    }

    @Override
    String getIme() {
        return "Pravougaonik";
    }
}
