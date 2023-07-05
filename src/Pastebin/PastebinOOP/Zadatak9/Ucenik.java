package Pastebin.PastebinOOP.Zadatak9;

/*
 * 9.
Napisati klasu Ucenik koja ima sledeca polja:
	- String ime
	- String prezime
	- ArrayList ocene

Napisati 2 konstruktora, jedan koji prima argumente za sva polja, a drugi koji prima ime i prezime, a ocene postavlja na praznu listu.
Napisati gettere i settere za sva polja.
Napisati toString() metod:
	{ime} i {prezime} ima ocene:
	{ocene}
Napisati metod proske koji racuna prosek Ucenika.
 */

import java.util.ArrayList;
import java.util.Objects;

public class Ucenik {

    private String ime;
    private String prezime;
    private ArrayList<Integer> ocene;

    public double prosek(){
        double sum = 0;
        for(int x : ocene){
            if (x < 2){
                return 1;
            }
            else {
                sum += x;
            }
        }
        return sum / ocene.size ();
    }

    public Ucenik(String ime, String prezime, ArrayList<Integer> ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = ocene;
    }

    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = new ArrayList<> ();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public ArrayList<Integer> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        this.ocene = ocene;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Ucenik ucenik = (Ucenik) o;
        return Objects.equals (ime, ucenik.ime) && Objects.equals (prezime, ucenik.prezime) && Objects.equals (ocene, ucenik.ocene);
    }

    @Override
    public int hashCode() {
        return Objects.hash (ime, prezime, ocene);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append (ime).append (" ").append (prezime).append (" ima ocene:").append ("\n").append (ocene.toString ());
        return sb.toString ();
    }
}
