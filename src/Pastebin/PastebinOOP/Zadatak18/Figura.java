package Pastebin.PastebinOOP.Zadatak18;
/*
 * Napisati abstrakntu klasu Figura koja nasledjuje klasu Oblik i nema atribute

Figura je 2D geometrijsko telo

Napisati prazan konstruktor

Overridovati metod:
zapremina() - vratiti 0
 */
public abstract class Figura extends Oblik{
    public Figura() {
    }

    @Override
    double zapremina() {
        return 0;
    }
}
