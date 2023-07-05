package Pastebin.PastebinOOP.Zadatak1;
/*
1. Napisati klasu Osoba, koja ima sledece atribute:
    - ime
    - prezime
    - godinaRodjenja
    - visina

Obezbediti konstruktor koji prima sve argumente za atribute i za svaki atribut getter i setter.

Napisati toString() metod koji ispisuje Osobu na sledeci nacin:
Ime osobe je: {ime}
Prezime osobe je: {prezime}
Godina rodjenja osobe je: {godinaRodjenja}
Visina osobe je: {visina}

 */
public class Osoba {

    String ime;
    String prezime;
    int godinaRodjenja;
    double visina;

    public Osoba(String ime, String prezime, int godinaRodjenja, double visina) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
        this.visina = visina;
    }

    public Osoba(String ime, String prezime){
        this.ime = ime;
        this.prezime = prezime;
    }

    public Osoba() {
        this.ime = "";
        this.prezime = "";
        this.godinaRodjenja = 1;
        this.visina = 1;
    }

    public String getIme(){
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public double getVisina() {
        return visina;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    @Override
    public String toString() {
        String s1 = "Ime osobe je: " + ime + "\n";
        String s2 = "Prezime osobe je: " + prezime + "\n";
        String s3 = "Godina rodjenja osobe je: " + godinaRodjenja + "\n";
        String s4 = "Visina osobe je: " + visina;

        return s1 + s2 + s3 + s4;
    }
}
