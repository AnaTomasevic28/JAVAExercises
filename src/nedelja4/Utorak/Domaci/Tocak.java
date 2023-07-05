package nedelja4.Utorak.Domaci;
/*
Domaci Zadatak 2 (Modifikacija Zadatka sa casa):
        Napraviti klasu Tocak koja ce imati atribute za trajanje gume u danima(koliko je dana proslo
        od kako smo postavili gumu), ostecenje(boolean) i cena.

        Napraviti apstraktnu klasu MotornoVozilo koja ima atribute za listu Tockova, cenu i godinu
        proizvodnje. Ova klasa ce imati apstraktne metode:

        -daLiJeOStecen -> Koji proverava koliko je Tocak koriscen, ako Kamion koristi Tocak vise
        od 120 dana, oznaciti da je ostecen, ako Automobil koristi tocak 365 dana, oznaciti da je
        ostecen i ako Motor koristi tocak vise od 200 dana, takodje oznaciti da je ostecen.

        -removeOstecenu -> Uklanja iz postojece liste sve ostecene tockove ili vraca novu listu
        tockova bez ostecenih.

        -ubaciRezervnu -> Ako nema dovoljno tockova (Znamo da ce Automobil imati npr 6
        tockova(4 obavezna i 2 rezervna)) ubaciti onoliko tockova u listu koliko fali.

        Napraviti Klase Kamion,Motor i Automobil koje nasledjuju klasu MotornoVozilo.

        Klase Kamion, Automobil i Motor nasledjuju apstraktnu klasu MotornoVozilo.

        Treba definisati takodje konstruktore, get i set kao i toString() metode za sve klase.

 */

import javax.swing.*;

public class Tocak {

    private int trajanjeGume;  // koliko je dana proslo od kada smo postavili gumu
    private boolean ostecenjeTocka;
    private double cenaTocka;

    public Tocak(int trajanjeGume, boolean ostecenjeTocka, double cenaTocka) {
        this.trajanjeGume = trajanjeGume;
        this.ostecenjeTocka = ostecenjeTocka;
        this.cenaTocka = cenaTocka;
    }

    public Tocak() {
    }

    public Tocak(int trajanjeGume) {
        this.trajanjeGume = trajanjeGume;
    }

    public int getTrajanjeGume() {
        return trajanjeGume;
    }

    public void setTrajanjeGume(int trajanjeGume) {
        this.trajanjeGume = trajanjeGume;
    }

    public boolean isOstecenjeTocka() {
        return ostecenjeTocka;
    }

    public void setOstecenjeTocka(boolean ostecenjeTocka) {
        this.ostecenjeTocka = ostecenjeTocka;
    }

    public double getCenaTocka() {
        return cenaTocka;
    }

    public void setCenaTocka(double cenaTocka) {
        this.cenaTocka = cenaTocka;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append ("Tocak starosti ").append (trajanjeGume);
        if (ostecenjeTocka) {
            sb.append (" je ostecen ");
        }
            else sb.append (" nije ostecen ");
        sb.append (" i kosta ").append (cenaTocka);
        return sb.toString ();
        }
    }

