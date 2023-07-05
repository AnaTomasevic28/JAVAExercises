package Pastebin.PastebinOOP.Zadatak8;

import Pastebin.PastebinOOP.Zadatak1.Osoba;
import Pastebin.PastebinOOP.Zadatak4.Automobil;

import java.util.ArrayList;

/*
 *Napisati klasu Putovanje koja ima sledeca polja/atribute:
	- destinacija(Grad)
	- vodjaPuta (Osoba)
	- vozilo (Automobil) - ovo polje se odnosi na automobil kojim se ide na putovanje
	- udaljenostUKm (double)
	- prijavljeneOsobe (arrayList)
udaljenostUKm ne sme biti negativna. Ispisati poruku o gresci ako korisnik pokusa da napravi Putovanje sa negativnom udaljenoscu.
Takodje ispisati poruku o gresci ako korisnik pokusa da set-uje udaljenostUKm na negativno.
Napisati sledece metode:
	2 konstruktora ->
	* vodja puta ne mora da postoji,
	* u oba konstruktora ne treba slati niz prijavljeneOsobe, vec u oba konstruktora ovaj niz napravite kao prazan
	gettere settere

	napisati i metodu koja racuna koliko je vremena potrebno da se stigne na destinaciju pri odredjenoj prosecnoj brzini.
	* Dakle metoda treba da primi argument koji kaze koliko kilometra na sat (double) ce biti prosecna brzina automobila,
	* a da vrati koliko ce sati biti potrebno da se dodje do destinacije ako se auto bude vozio tom prosecnom brzinom.
	*
	napisati metodu prijava, koja prima kao argument osobu koja se prijavljuje na putovanje
	*
	napisati metodu odjava, koja prima kao argument osobu koja se odjavljjuje sa putovanja (opciono)
	*
	Napisati i test program koji pravi nekoliko gradova i nekoliko automobila i nekoliko osoba,
	* i onda napravite neka putovanja u neke od tih gradova, sa nekim od tih automobila i vodja puta,
	* i onda prijavite neke od osoba na neka od putovanja,
	* i onda pozovite i metodu za racunanje koliko je vremena potrebno da se stigne pri odredjenoj brzini.
 */
public class Putovanje {
    private Grad destinacija;
    private Osoba vodjaPuta;
    private Automobil vozilo;
    private double udaljenostUKm;
    private ArrayList<Osoba> prijavljeneOsobe;

    private void postaviUdaljenostUKm(double udaljenostUKm){
        if (udaljenostUKm < 0){
            this.udaljenostUKm = 0;
            System.out.println ("Molimo unesite ispravnu kilometrazu!");
        }
        else this.udaljenostUKm = udaljenostUKm;
    }

    public double vremePutovanja(double brzina){
        return udaljenostUKm / brzina;
    }
    public void prijava(Osoba o){
        prijavljeneOsobe.add (o);
    }
    public void odjava(Osoba b){
        prijavljeneOsobe.remove (b);
    }

    public Putovanje(Grad destinacija, Automobil vozilo, double udaljenostUKm, ArrayList<Osoba> prijavljeneOsobe) {
        this.destinacija = destinacija;
        this.vozilo = vozilo;
        postaviUdaljenostUKm (udaljenostUKm);
        this.prijavljeneOsobe = new ArrayList<> ();
    }

    public Putovanje(Grad destinacija, Osoba vodjaPuta, Automobil vozilo, double udaljenostUKm, ArrayList<Osoba> prijavljeneOsobe) {
        this.destinacija = destinacija;
        this.vodjaPuta = vodjaPuta;
        this.vozilo = vozilo;
        postaviUdaljenostUKm (udaljenostUKm);
        this.prijavljeneOsobe = new ArrayList<> ();
    }

    public Grad getDestinacija() {
        return destinacija;
    }

    public void setDestinacija(Grad destinacija) {
        this.destinacija = destinacija;
    }

    public Osoba getVodjaPuta() {
        return vodjaPuta;
    }

    public void setVodjaPuta(Osoba vodjaPuta) {
        this.vodjaPuta = vodjaPuta;
    }

    public Automobil getVozilo() {
        return vozilo;
    }

    public void setVozilo(Automobil vozilo) {
        this.vozilo = vozilo;
    }

    public double getUdaljenostUKm() {
        return udaljenostUKm;
    }

    public void setUdaljenostUKm(double udaljenostUKm) {
        if (udaljenostUKm < 0){
            this.udaljenostUKm = 0;
            System.out.println ("Kilometraza ne moze biti negativna!");
        }
        else this.udaljenostUKm = udaljenostUKm;
    }

    public ArrayList<Osoba> getPrijavljeneOsobe() {
        return prijavljeneOsobe;
    }

    public void setPrijavljeneOsobe(ArrayList<Osoba> prijavljeneOsobe) {
        this.prijavljeneOsobe = prijavljeneOsobe;
    }

    /*
    toString metodu koristeci StringBuilder
	format
	Destincija: <ImeGrada, ImeDrzave>
	Vodja puta je: <ime i prezime vodje puta ako postoji, 'putovanje nema vodju puta' ako vodja puta nije postavljen (null)>
	Putuje se automobilom: <marka, godinaProizvodnje, kilometraza>
	Udaljenost do destinacije u kilometrima je: <udaljenostUKm>
	Prijavljene osobe:
		<ime> <prezime>
		<ime> <prezime>
		<ime> <prezime>
		<ime> <prezime>
		....
	primer
	Destincija: Pariz, Francuska
	Vodja puta je: Petar Petrovic
	Putuje se automobilom: BMW, 2016, 192000
	Udaljenost do destinacije je: 1300
	Prijavljene osobe:
		Zoran Milicevic
		Pera Peric
		Marko Markovic
     */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append ("Destinacija: ").append (destinacija.getIme ()).append (", ").append (destinacija.getDrzava ()).append ("\n");
        sb.append ("Vodja puta je: ");
        if (vodjaPuta == null){
            sb.append ("putovanje nema vodju puta." + "\n");
        }
        else sb.append (vodjaPuta.getIme ()).append (" ").append (vodjaPuta.getPrezime ()).append ("\n");
        sb.append ("Putuje se automobilom: ").append (vozilo.getMarka ()).append (", ").append (vozilo.getGodinaProizvodnje ());
        sb.append (", ").append (vozilo.getKilometraza ()).append ("\n");
        sb.append ("Udaljenost od destinacije u kilometrima je: ").append (udaljenostUKm).append ("\n");
        sb.append ("Prijavljene osobe su: ").append ("\n");
        for (int i = 0; i < prijavljeneOsobe.size (); i++) {
            sb.append (prijavljeneOsobe.get (i).getIme ()).append (" ").append (prijavljeneOsobe.get (i).getPrezime ()).append ("\n");
        }


        return sb.toString ();
    }
}
