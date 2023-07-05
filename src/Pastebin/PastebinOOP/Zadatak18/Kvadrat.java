package Pastebin.PastebinOOP.Zadatak18;
/*
 * Napisati klasu Kvadrat koja prosiruje klasu Pravougaonik i nema atribute

Overridovati metod:
1. getIme() - vraca nisku "Kvadrat"
 */
public class Kvadrat extends Pravougaonik{
    public Kvadrat(double a, double b) {
        super (a, b);
    }

    @Override
    String getIme() {
        return "Kvadrat";
    }
}
