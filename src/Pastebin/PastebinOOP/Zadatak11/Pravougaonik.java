package Pastebin.PastebinOOP.Zadatak11;

import java.util.Objects;

/*
 *Napisati klasu Pravougaonik koja sadrzi atribute:
- double a //Stranica a
- double b //Stranica b

Napisati 2 konstruktora
- Jedan koji prima sve argumenta
- Podrazumevani koji ne prima ni jedan argument

Napisati gettere i settere za sva polja

Napisati metodu obim() i povrsina() koje vracaju obim i povrsine pravougaonika, redom.

Omoguciti da se objekti ove klase porede pomocu hashCode() i equals() metoda.
Dva pravougaonika su ista ako imaju iste stranice.
Paziti da pravougaonik stranica 2,5 je isti kao pravougaonik stranica 5,2 jer je samo zarotiran za 90 stepeni!

Overridovati (nadjacati) toString() metod tako da vraca nisku oblika:
"Pravougaonik stranica <a> i <b>
 Obim: <obim>
 Povrsina: <povrsina>"
 */
public class Pravougaonik {

    private double a;
    private double b;

    public Pravougaonik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Pravougaonik() {
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

    public double obim() {
        return 2 * a + 2 * b;
    }

    public double povrsina(){
        return a * b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Pravougaonik that = (Pravougaonik) o;
        return (Double.compare (that.a, a) == 0 && Double.compare (that.b, b) == 0) ||
                (Double.compare (that.a, b) == 0 && Double.compare (that.b, a) == 0);
    }

    @Override
    public int hashCode() {
        return Objects.hash (a, b);
    }

    //"Pravougaonik stranica <a> i <b>
    // Obim: <obim>
    // Povrsina: <povrsina>"

    @Override
    public String toString() {
       String s1 = "Pravougaonik stranica " + a + " i " + b + "\n";
       String s2 = "Obim: " + obim () + "\n";
       String s3 = "Povrsina: " + povrsina ();
       return s1+s2+s3;
    }
}
