package Pastebin.PastebinOOP.Zadatak15;

import java.util.ArrayList;

/*
 * Napisati klasu Osnovac koja prosiruje klasu Ucenik i ima atribute:
- ArrayList<String> bojice

Napraviti 2 konstruktora:
- Jedan koji prima sve atribute
- Podrazumevani koji postavlja bojice na novu praznu ArrayListu

Paziti da prilikom kreiranja Osnovca broj godina mora biti u intervalu [7, 14]
Ukoliko se nevalidan broj godina proseldi, postaviti ih na 7

Napisati sve gettere i settere

Napisati metode:
1. dodajBojicu(String b) - koja dodaje bojicu na listu bojica
2. dodajBojicu(String b, int i) - koja postavlja bojicu u listu bojica na indeks i
3. ukloniBojicu(String b) - koja ukljanja bojicu b sa liste bojica
4. ukloniBojicu(int i) - koja ukljanja bojicu sa indexa i.

Overridovati metod prosek() tako da na svaku ocenu dodati 0.3 prilikom racunanja proseka, pazeci da se ne predje gornja granica od 5.0 po oceni

Overridovati toString() metod:
"<ime> <prezime> <brojGodima> pohadja osnovnu skolu.
 Ocene: [<ocena1>, <ocena2>, ..., <ocenaN>]
 Prosek: <prosek>"
 */
public class Osnovac extends Ucenik{

    private ArrayList<String> bojice;

    public Osnovac(String ime, String prezime, int brojGodina, ArrayList<Double> ocene, ArrayList<String> bojice) {
        super (ime, prezime, brojGodina, ocene);
        if (super.getBrojGodina () < 7 || super.getBrojGodina () > 14)
            super.setBrojGodina (7);
        this.bojice = bojice;
    }

    public Osnovac() {
        this.bojice = new ArrayList<> ();
    }

    public ArrayList<String> getBojice() {
        return bojice;
    }

    public void setBojice(ArrayList<String> bojice) {
        this.bojice = bojice;
    }
    public void dodajBojicu(String b){
        bojice.add (b);
    }
    public void dodajBojicu(String b, int i){
        bojice.add (i, b);
    }
    public void ukloniBojicu(String b){
        bojice.remove (b);
    }
    public void ukloniBojicu(int i){
        bojice.remove(i);
    }
    public double prosek(){
        double sum = 0;
        for (int i = 0; i < getOcene ().size (); i++) {
            if (getOcene ().get (i) < 1.7)
                return 1;
            sum += getOcene ().get (i);
            if (getOcene ().get (i) < 4.7)
                sum += 0.3;
        }
        return sum / getOcene ().size ();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append(super.toString ()).append (" pohadja osnovnu skolu.");
        sb.append("Ocene: ").append(getOcene ().toString ()).append ("\n");
        sb.append("Prosek: ").append (prosek ());
        return sb.toString ();
    }
}
