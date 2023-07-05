package Pastebin.PastebinOOP.Zadatak10;

import Pastebin.PastebinOOP.Zadatak13.Osoba;

import java.util.ArrayList;

/*
 *
Napisati klasu Kupac koja sadrzi polja:
	- Osoba kupac
	- double racun (novac sa kojim kupac raspolaze)
	- Korpa kopra (korpa nekog kupca)
	- ArrayList filmovi (filmovi koje je kupac kupio)

Napraviti konstruktor koji pravi novog kupca i postavlja da su korpa i filmovi koje vec poseduje prazni.
Omoguciti da kupac moze da ubacuje i izbacuje filmove iz korpe, kao i da pregleda njen sadrzaj.
Napisati metodu kupi() - kupuje sve filmove iz korpe i smesta ih u listu filmova, ako kupac ima dovoljno novca za to i ispisuje:
	"Uspesno kupljeno {brojStavki} filmova".
	U suprotnom ispisuje poruku:
	"Nemate dovoljno novca!
	 Potrebno: {ukupnaCenaKorpe}
	 Na raspolaganju: {racun}"
Napisati metodu pregledajFilmove() - ispisuje sve filmove koje kupac poseduje:
	"{nazivFilma1} {brojKopijaFilma1}"
	.
	.
	.
	"{nazivFilmaN} {brojKopijaFilmaN}"
	"Ukupno filmova: {brojFilmova}"
	"Ukupna duzina trajanja: {sati} : {minuti} : {sekunde}"
 */
public class Kupac extends Osoba {
    private Osoba kupac;
    private double racun;
    private Korpa korpa;
    private ArrayList<Film> filmovi;

    public Kupac(String ime, String prezime, double racun) {
        super (ime, prezime);
        this.racun = racun;
        this.korpa = new Korpa ();
        this.filmovi = new ArrayList<> ();
    }

    public Osoba getKupac() {
        return kupac;
    }

    public void setKupac(Osoba kupac) {
        this.kupac = kupac;
    }

    public double getRacun() {
        return racun;
    }

    public void setRacun(double racun) {
        this.racun = racun;
    }

    public Korpa getKorpa() {
        return korpa;
    }

    public void setKorpa(Korpa korpa) {
        this.korpa = korpa;
    }

    public ArrayList<Film> getFilmovi() {
        return filmovi;
    }

    public void setFilmovi(ArrayList<Film> filmovi) {
        this.filmovi = filmovi;
    }
    public void dodajFilmUKorpu(Film f){
        korpa.dodajFilmUKorpu (f);
    }
    public void dodajFilmUKorpu(Film f, int n){
        korpa.dodajFilmUKorpu (f, n);
    }
    public void izbaciIzKorpe(Film f){
        korpa.izbaciIzKorpe (f);
    }
    public void izbaciIzKorpe(Film f, int n){
        korpa.izbaciIzKorpe (f, n);
    }
    public void izbaciIzKorpeSveKopije(Film f){
        korpa.izbaciIzKorpeSveKopije (f);
    }
    public void izbaciSveIzKorpe(){
        korpa.izbaciSveIzKorpe ();
    }
    public void ispisiInventarKorpe(){
        korpa.ispisiInventarKorpe ();
    }
    /*
    Napisati metodu kupi() - kupuje sve filmove iz korpe i smesta ih u listu filmova, ako kupac ima dovoljno novca za to i ispisuje:
	"Uspesno kupljeno {brojStavki} filmova".
	U suprotnom ispisuje poruku:
	"Nemate dovoljno novca!
	 Potrebno: {ukupnaCenaKorpe}
	 Na raspolaganju: {racun}"
     */
    public void kupi(){
        if (racun >= korpa.getUkupnaCena ()){
            for (int i = 0; i < korpa.getKorpa ().size (); i++) {
                filmovi.add (korpa.getKorpa ().get (i));
                racun -= korpa.getUkupnaCena ();
            }
            System.out.println ("Uspesno pribavljeno " + filmovi.size () + " filmova.");
        }
        else {
            System.out.println ("Nemate dovoljno novca!");
            System.out.println ("Potrebno je " + korpa.getUkupnaCena ());
            System.out.println ("Na raspolaganju je: " + racun);
        }
    }
    /*
    Napisati metodu pregledajFilmove() - ispisuje sve filmove koje kupac poseduje:
	"{nazivFilma1} {brojKopijaFilma1}"
	.
	.
	.
	"{nazivFilmaN} {brojKopijaFilmaN}"
	"Ukupno filmova: {brojFilmova}"
	"Ukupna duzina trajanja: {sati} : {minuti} : {sekunde}"
     */
    private double ukupnoTrajanjeSati(){
        double sumSati = 0;

        double sumSekunde = 0;
        for (int i = 0; i < filmovi.size (); i++) {
            sumSati += filmovi.get (i).getSati ();
        }
        return sumSati;

    }
    private double ukupnoTrajanjeMinuti(){
        double sumMinuti = 0;
        for (int i = 0; i < filmovi.size (); i++) {
            sumMinuti += filmovi.get (i).getMinuti ();
        }
        return sumMinuti;
    }
    private double ukupnoTrajanjeSekunde(){
        double sumSekunde = 0;
        for (int i = 0; i < filmovi.size (); i++) {
            sumSekunde += filmovi.get (i).getSekunde ();
        }
        return sumSekunde;
    }
    private int kolikoIhIma(Film f){
        int kolikoIhIma = 0;
        for (int i = 0; i < korpa.getKorpa ().size (); i++) {
            if (korpa.getKorpa().get(i).equals (f)){
                kolikoIhIma++;
            }
        }
        return kolikoIhIma;
    }
    public String pregledajFilmove(){
        StringBuilder sb = new StringBuilder ();
        ArrayList<Film> kopijaFilmova = new ArrayList<> ();
        for (int i = 0; i < filmovi.size (); i++) {
            kopijaFilmova.add (filmovi.get (i));
        }
        for (int i = 0; i < kopijaFilmova.size (); i++) {
            for (int j = i+1; j < kopijaFilmova.size (); j++) {
                if (kopijaFilmova.get (j).equals (kopijaFilmova.get (i))){
                    kopijaFilmova.remove (j);
                    j--;
                }
            }
        }
        for (int i = 0; i < kopijaFilmova.size (); i++) {
            sb.append (kopijaFilmova.get (i).getIme ()).append (", ").append (kolikoIhIma (kopijaFilmova.get (i))).append ("\n");
        }
        sb.append ("Ukupno filmnova: ").append (filmovi.size ()).append ("\n");
        sb.append ("Ukupna duzina trajanja: ").append (ukupnoTrajanjeSati ()).append (":").append (ukupnoTrajanjeMinuti ()).append (":");
        sb.append (ukupnoTrajanjeSekunde ());
        return sb.toString ();
    }
}
