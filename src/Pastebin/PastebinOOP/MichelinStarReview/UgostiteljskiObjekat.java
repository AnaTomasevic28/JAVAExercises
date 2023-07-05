package Pastebin.PastebinOOP.MichelinStarReview;

import java.util.ArrayList;

/*


6.
Napisati abstraktne metode:
public abstract void dodajOcenu(doubleocena);

koja prima double ocenu i
na odredjeni nacin azurira ocenu ugostiteljskog objekta.


public abstract void azurirajZvezdu ();

koja na odredjeni nacin procenjuje da li treba nekom ugostiteljskom objektu
da se doda ili oduzme zvezda.
Paziti na cinjenicu da nijedan takav objekat ne moze da ima strogo manje od 0 niti strogo vise od 3 zvezde!

 */
public abstract class UgostiteljskiObjekat {
    private String naziv;
    private double prosecnaOcena;
    private int brMichelinZvezda;
    private ArrayList<String> recenzije;

    public UgostiteljskiObjekat(String naziv, double prosecnaOcena, int brMichelinZvezda, ArrayList<String> recenzije) {
        this.naziv = naziv;
        this.prosecnaOcena = prosecnaOcena;
        this.brMichelinZvezda = brMichelinZvezda;
        this.recenzije = recenzije;
    }

    public UgostiteljskiObjekat(String naziv, double prosecnaOcena, int brMichelinZvezda) {
        this.naziv = naziv;
        this.prosecnaOcena = prosecnaOcena;
        this.brMichelinZvezda = brMichelinZvezda;
        this.recenzije = new ArrayList<> ();
    }

    public UgostiteljskiObjekat(String naziv, double prosecnaOcena) {
        this.naziv = naziv;
        this.prosecnaOcena = prosecnaOcena;
        this.brMichelinZvezda = 0;
        this.recenzije = new ArrayList<> ();
    }

    public UgostiteljskiObjekat(String naziv) {
        this.naziv = naziv;
        this.prosecnaOcena = 3.0;
        this.brMichelinZvezda = 0;
        this.recenzije = new ArrayList<> ();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getProsecnaOcena() {
        return prosecnaOcena;
    }

    public void setProsecnaOcena(double prosecnaOcena) {
        this.prosecnaOcena = prosecnaOcena;
    }

    public int getBrMichelinZvezda() {
        return brMichelinZvezda;
    }

    public void setBrMichelinZvezda(int brMichelinZvezda) {
        this.brMichelinZvezda = brMichelinZvezda;
    }

    public ArrayList<String> getRecenzije() {
        return recenzije;
    }

    public void setRecenzije(ArrayList<String> recenzije) {
        this.recenzije = recenzije;
    }
    public void dodajRecenziju(String s) {
        recenzije.add(s);
    }

    public void obrisiRecenziju(String s) {
        recenzije.remove(s);
    }

    public void dodajViseOcena(ArrayList<Double> ocene){
        double sum = 0;
        for (int i = 0; i < ocene.size (); i++) {
            sum += ocene.get (i);
        }
        double prosek = (sum / ocene.size () + prosecnaOcena) / 2;

        azurirajZvezdu ();
    }
    public abstract void dodajOcenu(double ocena);
    public abstract void azurirajZvezdu ();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append ("------").append (getNaziv ()).append ("-----").append ("\n");
        sb.append ("*****").append (getBrMichelinZvezda ()).append ("*****").append ("\n");
        sb.append ("\n");
        sb.append ("Prosecna ocena: ").append (getProsecnaOcena ()).append ("\n");
        sb.append ("Recenzije: ").append ("\n");
        for (int i = 0; i < recenzije.size (); i++) {
            sb.append (i+1).append (")").append (recenzije.get (i)).append ("\n");
        }
        return sb.toString ();
    }
}
