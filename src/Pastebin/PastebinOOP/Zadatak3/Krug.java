package Pastebin.PastebinOOP.Zadatak3;
/*
 * 3. Napisati klasu Krug koja ima atribute:
- double r
Obezbediti konstruktor koji prima vrednost za r.
Obezbediti getter i setter za atribut r.
Napisati metode:
- obim : vraca obim kruga 2rPI
- povrsina : vraca povrsinu kruga r2PI
Koristiti Math Java biblioteku (Math.PI za konstantu pi)
 */
public class Krug {

    private double r;

    public double obim(){
        return  2 * r * Math.PI;
    }
    public double povrsina(){
        return r*r*Math.PI;
    }
    public Krug(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return ("Krug poluprecnika " + r + " ima obim: " + obim () + " i povrsinu " + povrsina());
    }
}
