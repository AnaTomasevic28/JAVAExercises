package Pastebin.PastebinOOP.Zadatak18;
/*
 *
Napisati klasu Kocak koja nasledjuje Prizmu i nema atribute

Overridovati metod:
1. getIme() - vraca nisku "Kocka"
 */
public class Kocka extends Prizma{
    public Kocka(double a, double b, double c) {
        super (a, b, c);
    }

    @Override
    String getIme() {
        return "Kocka";
    }
}
