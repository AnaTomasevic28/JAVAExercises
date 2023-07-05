package Pastebin.PastebinOOP.Zadatak2;
/*
2. Napisati klasu Pravougaonik koja ima atribute:
- double sirina
- double visina
Obezbediti konstruktor koji prima argumente za oba atributa i gettere i settere za svaki.
Napisati metode:
- obim : vraca obim pravougaonika
- povrsina : vraca povrsinu pravougaonika
Napisati toString() metod koji ispisuje Pravougaonik na sledeci nacin:
Pravougaonik sirine {sirina} i visine {visina} ima:
Obim: {obim},
Povrsinu: {povrsinu}
 */
public class Pravougaonik {

    private double sirina;
    private double visina;

    public Pravougaonik(double sirina, double visina) {
        this.sirina = sirina;
        this.visina = visina;
    }

    public double getSirina() {
        return sirina;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public double Povrsina(){
        return sirina * visina;
    }

    public double Obim(){
        return 2*sirina + 2*visina;
    }

    @Override
    public String toString() {
        //Pravougaonik sirine {sirina} i visine {visina} ima:
        //Obim: {obim},
        //Povrsinu: {povrsinu}
        String s1 = "Pravougaonik sirine " + sirina + " i visine " + visina + " ima: " + "\n";
        String s2 = "Obim: " + Obim () + "\n";
        String s3 = "Povrsinu: " + Povrsina ();

        return s1 + s2 + s3;
    }
}
