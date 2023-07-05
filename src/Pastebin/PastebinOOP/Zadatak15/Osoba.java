package Pastebin.PastebinOOP.Zadatak15;

/*
 *15.
Napisati klasu Osoba standardno


Napisati klasu Profesor koja prosiruje klasu Osoba i ima atribute:
- ArrayList<String> predmetiKojePredaje;

Napisati 2 konstruktora:
- Jedan koji prima sve argumente
- Podrazuemvani koji postavlja listu predmeta na novu praznu listu

Napisati sve gettere i settere

Napisati metode:
1. add(String predmet) - koja dodaje predmet na listu predmete
2. add(String predmet, int i) - koja postavlja predmet na index i u listi predmeta
3. addAll(ArrayList<String> predmeti) - koja postavlja sve predmete iz prosledjene liste na listu predmeta koje profesor predaje
4. removePreplaceni(int i) - koja brise predmet sa indeksa i iz liste predmeta
5. removePreplaceni(String predmet) - koja brise predmet sa istim imenom iz liste predmeta kao prosledjeni predmet

Omoguciti da mozemo porediti dva objekta ove klase.

Overridovati toString() metod:
"<ime> <prezime> <brojGodina> je profesor i predaje:
 [<predmet1>, ..., <predmetN>]"
 */
public class Osoba {

    private static int ID;
    private int id;
    private String ime;
    private String prezime;
    private int brojGodina;

    static{
        ID = 1;
    }

    public Osoba(String ime, String prezime, int brojGodina) {
        this.id = ID;
        ID++;
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
    }

    public Osoba(String ime, String prezime) {
        this.id = ID;
        ID++;
        this.ime = ime;
        this.prezime = prezime;
    }

    public Osoba() {
    }

    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = ID;
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

    public int getBrojGodina() {
        return brojGodina;
    }


    public void setBrojGodina(int brojGodina) {
        this.brojGodina = brojGodina;
    }

    @Override
    public String toString() {
        return ( ime + " " + prezime + " ," + brojGodina + " godina");
    }
}
