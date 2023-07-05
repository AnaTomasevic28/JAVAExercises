package Pastebin.PastebinOOP.Zadatak18;
/*
 *
Napisati klasu Prizma koja nasledjuje Paralelopiped i nema atribute

OVerridovati metode:
1. povrsina()
2. zapremina()
3. getIme() - vraca nisku "Prizma"
 */
public class Prizma extends Paralelopiped{
    public Prizma(double a, double b, double c) {
        super (a, b, c);
    }

    @Override
    double povrsina() {
        return 2* (getA ()*getB () + getA ()*getC () + getB ()*getC ());
    }

    @Override
    double zapremina() {
        return getA () * getB () * getC ();
    }

    @Override
    String getIme() {
        return "Prizma";
    }
}
