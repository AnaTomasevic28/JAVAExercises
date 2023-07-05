package Pastebin.PastebinOOP.Zadatak15;

import java.util.ArrayList;

/*
 *
Napisati Klasu Gimnazijalac koja nasledjuje klasu Ucenik i ima atribute:
- String maturski

Napraviti 2 konstruktora:
- Jedan koji prima sve argumente
- Podrazumevani koji postavlja maturski na ""

Paziti da prilikom kreiranja Gimnazijalca broj godina mora biti u intervalu [15, 19].
Ukoliko se prosledi nevalidan broj godina, postaviti ih na 15

Napisati sve gettere i settere

Overridovati metod prosek() tako da na svaku ocenu oduzima 0.1 prilikom racunajna proseka, pazeci da se ne predje donja granica od 1.0 po oceni.

Overridovati toString() metod:
"<ime> <prezime> <brojGodima> pohadja gimnaziju.
 Ocene: [<ocena1>, <ocena2>, ..., <ocenaN>]
 Prosek: <prosek>"
 */
public class Gimnazijalac extends Ucenik{

    private String maturski;

    public Gimnazijalac(String ime, String prezime, int brojGodina, ArrayList<Double> ocene, String maturski) {
        super (ime, prezime, brojGodina, ocene);
        if (super.getBrojGodina () < 15 || super.getBrojGodina () > 19)
            super.setBrojGodina (15);
        this.maturski = maturski;
    }

    public Gimnazijalac() {
    this.maturski = "";
    }

    public String getMaturski() {
        return maturski;
    }

    public void setMaturski(String maturski) {
        this.maturski = maturski;
    }
    public double prosek() {
        double sum = 0;
        for (double o : getOcene()){
            if (o <= 2.0)
                return 1.0;
            sum += Math.max(o - 0.1, 1.0);
        }
        return sum / getOcene ().size ();
    }
    /*
    Overridovati toString() metod:
"<ime> <prezime> <brojGodima> pohadja gimnaziju.
 Ocene: [<ocena1>, <ocena2>, ..., <ocenaN>]
 Prosek: <prosek>"
     */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append(super.toString ()).append (" pohadja gimnaziju.");
        sb.append("Ocene: ").append(getOcene ().toString ()).append ("\n");
        sb.append("Prosek: ").append (prosek ());
        return sb.toString ();
    }
}
