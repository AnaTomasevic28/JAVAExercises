package Pastebin.PastebinOOP.Zadatak9;

import java.util.ArrayList;

/*
 * Napisati klasu Odeljenje koja ima sledeca polja:
	- String oznaka
	- ArrayList dnevnik

Napisati 2 konstruktora, opet na isti nacin.
Napisati gettere i settere za sva polja.
Napisati metod upisiUcenika(Ucenik u) koja dodaje ucenika {u} u dnevnik.
Napisati metod upisiUcenika(Ucenik u, int redniBroj) koji dodaje ucenika {u} u dnevnik na redni broj {redniBroj}
Napisati metod ispisiUcenika(Ucenik u) koja brise ucenika {u} iz dnevnika.
Napisati metod ispisiUcenika(int i) koja brise ucenika na poziciji {i} u dnevniku.
Napisati metod pogledajOcene(Ucenik u) koja ispisuje sve ocene ucenika {u}.
Napisati metod pogledajOcene(int i) koja ispisuje sve ocene ucenika na poziciji {i} u dnevniku.
Napisati metod prosecnaOcena(Ucenik u) koja ispisuje prosecnu ocenu ucenika {u}.
Napisati metod prosecnaOcena(int i) koja ispisuje prosecnu ocenu ucenika na poziciji {i} u dnevniku.
Napisati metod prosecnaOcenaOdeljenja() koja vraca prosecnu ocenu celog odeljenja (0, ako nema ucenika u odeljenju).
Napisati metod opisnaOcena(Ucenik u) koja ispisuje:
	- "Odlican"; ako je prosek ucenika {u} 4.5 ili vise
	- "Vrlo dobar"; ako je prosek ucenika {u} [3.5, 4.5)
	- "Dobar"; ako je prosek ucenika {u} [2.5, 3.5)
	- "Dovoljan"; ako je prosek ucenika {u} [1.5, 2.5)
	- "Nedovoljan"; ako ucenik {u} ima barem jednu jedinicu
Napisati metod izlistajDnevnik() koja vraca String oblika:
	{ime} i {prezime} ima ocene:
	{ocene}
za sve ucenike.
Napisati metod String velicinaOdeljenja() koja vraca odgovarajucu poruku:
	- "Veliko odeljenje"; ako ima vise od 25 ucenika
	- "Srednje odeljenje"; ako ima ucenika izmedju 15 i 25
	- "Malo odeljenje"; ako ima ucenika manje od 15
Napisati toString() metod:
	{Oznaka} odeljenja ima djake:
	{Ime1} {Prezime1}
	{Ime2} {Prezime2}
	.
	.
	.
	{ImeN} {PrezimeN}

 */
public class Odeljenje {

    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public void upisiUcenika(Ucenik u){
        dnevnik.add (u);
    }
    public void upisiUcenika(Ucenik u, int i){
        dnevnik.add (i, u);
    }
    public void ispisiUcenika(Ucenik u){
        dnevnik.remove (u);
    }
    public void ispisiUcenika(int i){
        dnevnik.remove(i);
    }
    //pogledajOcene(Ucenik u) koja ispisuje sve ocene ucenika {u}
    public void pogledajOcene(Ucenik u){
        for (int i = 0; i < dnevnik.size (); i++) {
            if (getDnevnik ().get (i).equals (u)){
                System.out.println (getDnevnik ().get (i).getOcene ());
            }
        }
    }
    public void pogledajOcene(int i){
        System.out.println (getDnevnik().get(i).getOcene ());
    }
    public void prosecnaOcena(Ucenik u){
        System.out.println (u.prosek ());
    }
    public void prosecnaOcena(int i){
        System.out.println ((getDnevnik ().get (i)).prosek ());
    }
//Napisati metod prosecnaOcenaOdeljenja() koja vraca prosecnu ocenu celog odeljenja (0, ako nema ucenika u odeljenju).

    public double prosecnaOcenaOdeljenja(){
        double sum = 0;
        if (dnevnik.size () == 0){
            return  0;
        }
        else {
            for (int i = 0; i < dnevnik.size (); i++) {
                sum += dnevnik.get (i).prosek ();
            }
        }
        return sum / dnevnik.size ();
    }
    //Napisati metod opisnaOcena(Ucenik u) koja ispisuje:
    //	- "Odlican"; ako je prosek ucenika {u} 4.5 ili vise
    //	- "Vrlo dobar"; ako je prosek ucenika {u} [3.5, 4.5)
    //	- "Dobar"; ako je prosek ucenika {u} [2.5, 3.5)
    //	- "Dovoljan"; ako je prosek ucenika {u} [1.5, 2.5)
    //	- "Nedovoljan"; ako ucenik {u} ima barem jednu jedinicu

    public String opisnaOcena(Ucenik u){
        if (u.prosek () == 1){
            return "Nedovoljan";
        }
        else if (u.prosek () >= 2 && u.prosek () < 2.5 ){
            return "Dovoljan";
        } else if (u.prosek () >= 2.5 && u.prosek () < 3.5) {
            return "Dobar";
        } else if (u.prosek () >= 3.5 && u.prosek () < 4.5) {
            return "Vrlo dobar";
        }
        else return "Odlican";
    }
    //Napisati metod izlistajDnevnik() koja vraca String oblika:
    //	{ime} i {prezime} ima ocene:
    //	{ocene}
    //za sve ucenike.

    public String izlistajDnevnik(){
        StringBuilder sb = new StringBuilder ();
        for (int i = 0; i < dnevnik.size (); i++) {
            sb.append (dnevnik.get(i).toString ()).append ("\n");
        }
        return sb.toString ();
    }
    //Napisati metod String velicinaOdeljenja() koja vraca odgovarajucu poruku:
    //	- "Veliko odeljenje"; ako ima vise od 25 ucenika
    //	- "Srednje odeljenje"; ako ima ucenika izmedju 15 i 25
    //	- "Malo odeljenje"; ako ima ucenika manje od 15

    public String velicinaOdeljenja(){
        if (dnevnik.size () > 25) {
            return "Veliko odeljenje";
        } else if (dnevnik.size () > 14) {
            return "Srednje odeljenje";
        }
        else return "Malo odeljenje";
    }
    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList<> ();
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }
//Napisati toString() metod:
//	{Oznaka} odeljenja ima djake:
//	{Ime1} {Prezime1}
//	{Ime2} {Prezime2}
//	.
//	.
//	.
//	{ImeN} {PrezimeN}
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append("Odeljenje ").append(oznaka).append (" ima djake: ").append ("\n");
        for (int i = 0; i < dnevnik.size (); i++) {
            sb.append (dnevnik.get (i).getIme ()).append(" ").append (dnevnik.get (i).getPrezime ()).append ("\n");
        }
        return sb.toString ();
    }
}
