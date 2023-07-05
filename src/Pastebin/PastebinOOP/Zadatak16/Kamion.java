package Pastebin.PastebinOOP.Zadatak16;

import java.util.ArrayList;

/*
 * Napisati klasu Kamion koja nasledjuje klasu Vozilo i ima atribute:
- int brojPutnika
- ArrayList<String> proizvodi

Kamion ima 10 tockova

Napisati 2 konstruktora:
- Jedan koji prima broj putnika i listu proizvoda koje prenosi
- Podrazumevani koji ne prima argumente i postavlja listu proizvoda na novu praznu listu

Napisati sve gettere i settere

Napisati metode:
1. dodajPutnika() - koja dodaje jednog putnika u Kamion, pazeci da kamion moze najvise imati 1 putnika.
2. oduzmiPutnika() - koja oduzima jednog putnika iz Kamiona, pazeci da kamion moze imati najmanje 0 putnika.
3. dodajPutnika(int n) - koja dodaje n putnika u Kamiona. Ukoliko ne mogu da stanu svih n putnika, onda ih dodati do gornje granice
4. oduzmiPutnika(int n) - koja oduzima n putnika iz Kamiona. Ukoliko nema n putnika u autu, izbaciti sve putnike iz kamiona.
5. isprazniKamion() - izbacuje sve putnike im kamiona
6. napuniKamion() - puni kamion sa 2 putnika
7. dodajProizvod(String s) - koji dodaje proizvod u kamion
8. oduzmiProizvod(String s) - koji oduzima proizvod iz kamiona


Overridovati sve metode iz natklase.
 */
public class Kamion extends Vozilo{
    private int brojPutnika;
    private ArrayList<String> proizvodi;

    public Kamion(String registarskiBroj, String marka, String tip, int brojPutnika, ArrayList<String> proizvodi) {
        super (registarskiBroj, marka, tip);
        if (brojPutnika > 1){
            System.out.println ("Broj putnika ne moze biti veci od 1");
            this.brojPutnika = 1;
        }else this.brojPutnika = brojPutnika;
        this.proizvodi = proizvodi;
    }

    public Kamion(String registarskiBroj, String marka, String tip) {
        super (registarskiBroj, marka, tip);
        this.proizvodi = new ArrayList<> ();
    }

    public int getBrojPutnika() {
        return brojPutnika;
    }

    public void setBrojPutnika(int brojPutnika) {
        if (brojPutnika > 1){
            System.out.println ("Kamion moze da poveze max 1 putnika! Izadjite svi napolje");
            this.brojPutnika = 0;
        }else this.brojPutnika = brojPutnika;
    }

    public ArrayList<String> getProizvodi() {
        return proizvodi;
    }

    public void setProizvodi(ArrayList<String> proizvodi) {
        this.proizvodi = proizvodi;
    }

    @Override
    public char vratiKategoriju() {
        return 'C';
    }

    @Override
    public int brojTockova() {
        return 10;
    }

    @Override
    public int brojPutnika() {
        return brojPutnika;
    }
//    dodajPutnika() - koja dodaje jednog putnika u Kamion, pazeci da kamion moze najvise imati 1 putnika.
    public void dodajPutnika(){
        if (brojPutnika == 0){
            brojPutnika++;
        }
    }
    //oduzmiPutnika() - koja oduzima jednog putnika iz Kamiona, pazeci da kamion moze imati najmanje 0 putnika.
    public void oduzmiPutnika(){
        if (brojPutnika == 1) {
            brojPutnika -=1;
        }
    }
//    3. dodajPutnika(int n) - koja dodaje n putnika u Kamiona. Ukoliko ne mogu da stanu svih n putnika, onda ih dodati do gornje granice
    public void dodajPutnika(int n){
        if (brojPutnika == 1){
            System.out.println ("Kamion je pun");
        }
        else if ((brojPutnika == 0) && n >= 1){
            brojPutnika++;
        }
    }
//oduzmiPutnika(int n) - koja oduzima n putnika iz Kamiona. Ukoliko nema n putnika u autu, izbaciti sve putnike iz kamiona.
    public void oduzmiPutnika(int n){
        if (brojPutnika == 0){
            System.out.println ("Kamion je prazan");
        } else if ((brojPutnika == 1) && n >= 1) {
            brojPutnika--;
        }
    }
    //5. isprazniKamion() - izbacuje sve putnike im kamiona
    public void isprazniKamion(){
        setBrojPutnika (0);
    }
    //napuniKamion() - puni kamion sa 2 putnika
    public void napuniKamion(){
        setBrojPutnika (1);
    }
    //dodajProizvod(String s) - koji dodaje proizvod u kamion
    public void dodajProizvod(String s){
        proizvodi.add (s);
    }
    //oduzmiProizvod(String s) - koji oduzima proizvod iz kamiona
    public void oduzmiPorizvod(String s){
        for (int i = 0; i < proizvodi.size (); i++) {
            if (proizvodi.get (i).equalsIgnoreCase (s)){
                proizvodi.remove (i);
                break;
            }
        }
    }
    @Override
    public String toString() {
        return super.toString ();
    }
}
