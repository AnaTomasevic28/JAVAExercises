package nedelja4.Ponedeljak.Domaci;

import java.util.ArrayList;

/*
2)Napraviti klasu SportskiKlub koja ima listu clanova kluba, naziv grada odakle je klub i
budzet kluba. Definisati metode:
   *isplati - koja vraca kolicinu novca koja ostaje kada se svim clanovima kluba isplate
plate.
   *prosecnoPlaceni - vraca prosecnu platu svih sportista iz liste.
   *removePreplaceni - izbacuje iz liste sportistu koji je placen vise od proseka.
3) Napraviti klase Manchester, Arsenal, Spartak koja nasledjuje klasu SportskiKlub.

 */
public class SportskiKlub {

    private ArrayList<Sportista> clanoviKluba;
    private String nazivGrada;
    private double budzet;

    public double isplati(){
        for (int i = 0; i < clanoviKluba.size(); i++) {
            budzet -= clanoviKluba.get(i).getPlata();
        }
        System.out.println ("Preostalo je novca u budzetu: ");
        return budzet;
    }

    public double prosecnaPLata(){
        double sum = 0;
        for (int i = 0; i < clanoviKluba.size(); i++) {
            sum += clanoviKluba.get(i).getPlata();
        }
        return sum / clanoviKluba.size ();
    }
    public void removePreplaceni(){
        for (int i = 0; i < clanoviKluba.size(); i++) {
            if (clanoviKluba.get (i).getPlata () > (prosecnaPLata ())){
                clanoviKluba.remove (i);
                i--;
            }
        }
    }

    public SportskiKlub(ArrayList<Sportista> clanoviKluba, String nazivGrada, double budzet) {
        this.clanoviKluba = clanoviKluba;
        this.nazivGrada = nazivGrada;
        this.budzet = budzet;
    }

    public ArrayList<Sportista> getClanoviKluba() {
        return clanoviKluba;
    }

    public void setClanoviKluba(ArrayList<Sportista> clanoviKluba) {
        this.clanoviKluba = clanoviKluba;
    }

    public String getNazivGrada() {
        return nazivGrada;
    }

    public void setNazivGrada(String nazivGrada) {
        this.nazivGrada = nazivGrada;
    }

    public double getBudzet() {
        return budzet;
    }

    public void setBudzet(double budzet) {
        this.budzet = budzet;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append ("Sportski klub iz grada ").append (nazivGrada).append (" ima budzet ").append (budzet);
        sb.append (" i igrace: ").append ("\n");
        for (int i = 0; i < clanoviKluba.size (); i++) {
            sb.append (clanoviKluba.get(i).getIme()).append (" ").append (clanoviKluba.get (i).getPlata ()).append ("\n");
        }
        return sb.toString ();
    }
}
