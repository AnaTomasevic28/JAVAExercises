package nedelja4.Ponedeljak.Domaci;
/*
Domaci Zadatak 1:
1)Napraviti klasu Sportista koji ima atribute za ime, jmbg i platu.
2)Napraviti klasu SportskiKlub koja ima listu clanova kluba, naziv grada odakle je klub i
budzet kluba. Definisati metode:
   *isplati - koja vraca kolicinu novca koja ostaje kada se svim clanovima kluba isplate
plate.
   *prosecnoPlaceni - vraca prosecnu platu svih sportista iz liste.
   *removePreplaceni - izbacuje iz liste sportistu koji je placen vise od proseka.
3) Napraviti klase Manchester, Arsenal, Spartak koja nasledjuje klasu SportskiKlub.

Napraviti main metodu gde ce se testirati sve funkcionalnosti, takodje definisati za sve klase
potrebne konstruktore, get i set metode kao i toString().
 */
public class Sportista {

    private String ime;
    private int jmbg;
    private double plata;

    public Sportista(String ime, int jmbg, double plata) {
        this.ime = ime;
        this.jmbg = jmbg;
        this.plata = plata;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getJmbg() {
        return jmbg;
    }

    public void setJmbg(int jmbg) {
        this.jmbg = jmbg;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    @Override
    public String toString() {
        return "Sportista " + ime + " " + jmbg + " ima platu " + plata + " dinara.";
    }
}