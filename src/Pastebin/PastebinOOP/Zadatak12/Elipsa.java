package Pastebin.PastebinOOP.Zadatak12;

import java.util.Objects;

/*
 * Napisati klasu Elipsa koja sadrzi atribute:
- double a (prva poluosa)
- double b (druga poluosa)

Napisati 2 konstruktora:
- Jedan konstruktor koji prima sve argumente
- Podrazumevani konstruktor

Napisati sve gettere i settere

Omoguciti da se objekti ove klase porede pomocu hashCode() i equals() metoda.

Napisati metode:
1. povrsina - koja vraca povrsinu elipse
2. ekscentritet - koja vraca eskcentritet elipse
3. vecaPoluosa - koja vraca duzinu vece poluose
4. manjaPoluosa - koja vraca duzinu manje poluose

Overridovati toString() metod tako da vraca nisku oblika:
"Elipsa vece poluose: <vecaPoluosa> i manje poluose: <manjaPoluosa> ima
 Povrsinu: <povrsina>
 Ekscentritet: <eskcentritet>"
 */
public class Elipsa {
    private double a; // prva poluosa
    private  double b;  // druga poluosa

    public Elipsa(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Elipsa() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Elipsa elipsa = (Elipsa) o;
        return Double.compare (elipsa.a, a) == 0 && Double.compare (elipsa.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash (a, b);
    }

    public double povrsina(){
        // P = a*b*pi
        return a * b * Math.PI;
    }
    public double ekscentritet(){
        // e = sqrt(1 - (b2/a2))
        double x = 1 - (Math.pow (manjaPoluosa (), 2.0)/ Math.pow (vecaPoluosa (), 2.0));

        return Math.sqrt (x);
    }

    public double vecaPoluosa(){
        if (a > b){
            return a;
        } else if (a == b) {
            System.out.println ("Jednake su");
            return a;
        }
        else return b;
    }

    public double manjaPoluosa(){
        if (a > b){
            return b;
        } else if (a == b) {
            System.out.println ("Jednake su");
            return a;
        }
        else return a;
    }
//Overridovati toString() metod tako da vraca nisku oblika:
//"Elipsa vece poluose: <vecaPoluosa> i manje poluose: <manjaPoluosa> ima
// Povrsinu: <povrsina>
// Ekscentritet: <eskcentritet>"
    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder ();
      sb.append ("Elipsa vece poluose: ").append (vecaPoluosa ()).append (" i manje poluose ").append (manjaPoluosa ());
      sb.append (" ima: " ).append ("\n");
      sb.append ("Povrsinu: ").append (povrsina ()).append ("\n");
      sb.append ("Ekscentritet: ").append (ekscentritet ());
      return  sb.toString ();
    }
}
