package Pastebin.PastebinOOP.Zadatak15;

import java.util.ArrayList;

/*
 * Napisati klasu Ucenik koja nasledjuje klasu Osoba i ima atribute:
- ArrayList<Double> ocene;

Uvek paziti da ocena mora biti u intervalu [1.0, 5.0]

Napisati 2 konstruktora:
- Jedan koji prima sve argumente
- Podrazumevani koja postavlja listu na novu praznu listu

Napisati sve gettere i settere

Napisati metode:
1. dodajOcenu(double x) - koja dodaje ocenu x u listu ocena.
2. promeniOcenu(double x, int i) - koja menja ocenu na indexu i u ocenu x.
3. izbrisiOcenu(int i) - koja brise ocenu na indeksu i
4. izbrisiOcenu(double x) - koja brise ocenu x
5. prosek() - koja vraca ucenikov prosek. Ukoliko ucenik ima barem jednu jedinicu (bilo koji broj x, 1.0 <= x < 2.0)
6. kakavJeDjak() - koja vraca string na sledeci nacin:
 "Nedovoljan" - ako ima barem jednu jedinicu
 "Dovoljan" - ako je prosek u intervalu [2.0, 2.5)
 "Dobar" - ako je prosek u intervalu [2.5. 3.5)
 "Vrlo dobar" - ako je prosek u intervalu [3.5, 4.5)
 "Odlican" - inace

Overridovati toString() metod:
"<ime> <prezime> <brGodina> ima ocene:
 [<ocena1>, <ocena2>, ..., <ocenaN>]
 Prosek: <prosek>"
 */
public class Ucenik extends Osoba {

    private ArrayList<Double> ocene;

    private void postaviOcene(ArrayList<Double> ocene){
        for (int i = 0; i < ocene.size (); i++) {
            if (ocene.get (i) < 1 ){
                System.out.println ("Ocene moraju biti u intervali od 1 do 5");
                this.ocene.set (i, 1.0);
            } else if (ocene.get (i) > 5) {
                System.out.println ("Ocene moraju biti u intervali od 1 do 5");
                this.ocene.set (i, 5.0);
            } else this.ocene.set (i, ocene.get (i));
        }
    }
    private boolean validnaOcena(double x) {
        return x >= 1.0 && x <= 5.0;
    }

    public Ucenik(String ime, String prezime, int brojGodina, ArrayList<Double> ocene) {
        super (ime, prezime, brojGodina);
        postaviOcene (ocene);
    }

    public Ucenik() {
        this.ocene = new ArrayList<> ();
    }

    public ArrayList<Double> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Double> ocene) {
        postaviOcene (ocene);
    }

    public void dodajOcenu(double x ){
        if (validnaOcena (x))
            ocene.add (x);
    }
    public void promeniOcenu(double x, int i){
        if (validnaOcena (x))
            ocene.set (i, x);
    }
    public void izbrisiOcenu(int i){
        ocene.remove (i);
    }
    public void izbrisiOcenu(double x){
        ocene.remove (x);
    }

    public double prosek(){
        double sum = 0;
        for (int i = 0; i < ocene.size (); i++) {
            if (ocene.get (i) < 2)
                return 1;
            else sum += ocene.get (i);
        }
        return sum / ocene.size ();
    }
    public String kakavJeDjak(){
        String s = "";
        for (int i = 0; i < ocene.size (); i++) {
            if (ocene.get (i) == 1)
                s = "Nedovoljan";
            else if (prosek () >= 2.0 && prosek () < 2.5) {
                s= "Dovoljan";
            } else if (prosek ()>= 2.5 && prosek () < 3.5) {
                s = "Dobar";
            } else if (prosek () >= 3.5 && prosek () < 4.5) {
                s = "Vrlo dobar";
            }
            else s = "Odlican";
        }
        return s;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append (super.toString ()).append (" ima ocene: ");
        for (int i = 0; i < ocene.size (); i++) {
            sb.append (ocene.get (i)).append ("\n");
        }
        sb.append (" i prosek: ").append (prosek ());
        return sb.toString ();
    }
}
