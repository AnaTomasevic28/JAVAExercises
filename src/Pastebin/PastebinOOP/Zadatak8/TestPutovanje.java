package Pastebin.PastebinOOP.Zadatak8;

//Napisati i test program koji pravi nekoliko gradova i nekoliko automobila i nekoliko osoba,
//	* i onda napravite neka putovanja u neke od tih gradova, sa nekim od tih automobila i vodja puta,
//	* i onda prijavite neke od osoba na neka od putovanja,
//	* i onda pozovite i metodu za racunanje koliko je vremena potrebno da se stigne pri odredjenoj brzini.

import Pastebin.PastebinOOP.Zadatak1.Osoba;
import Pastebin.PastebinOOP.Zadatak4.Automobil;

import java.util.ArrayList;

public class TestPutovanje {
    public static void main(String[] args) {

        Grad barselona = new Grad ("Barselona", 2_000_000, "Spanija");

        Grad rim = new Grad ("Rim", 1_000_000, "Italija");

        Automobil bmw = new Automobil ("BMW", "Nemacka", "2019", 50_000);

        Automobil renault = new Automobil ("Renault", "Francuska", 2020, 20_000);

        Osoba o1 = new Osoba ("Ana", "Tomasevic");
        Osoba o2 = new Osoba ("Dalibor", "Tomasevic");
        Osoba o3 = new Osoba ("Petar", "Lazic");
        Osoba o4 = new Osoba ("Mirjana", "Simic");

        Putovanje spanija = new Putovanje (barselona, bmw, -100, new ArrayList<> ());
       // System.out.println (spanija);
        spanija.setUdaljenostUKm (1000);
        spanija.setVodjaPuta (o4);
        spanija.prijava (o1);
        spanija.prijava (o2);
        spanija.prijava (o3);
        spanija.odjava (o1);
        System.out.println (spanija);

        Putovanje italija = new Putovanje (rim, o3, renault,900, new ArrayList<> ());
        italija.prijava (o1);
        italija.prijava (o2);
        System.out.println (italija);;


    }
}
