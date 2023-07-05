package Pastebin.PastebinOOP.Zadatak15;

import java.util.ArrayList;
import java.util.Objects;

/*
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

 */
public class Profesor extends Osoba {

    ArrayList<String> predmetiKojePredaje;

    public Profesor(String ime, String prezime, ArrayList<String> predmetiKojePredaje) {
        super (ime, prezime);
        this.predmetiKojePredaje = predmetiKojePredaje;
    }

    public Profesor(String ime, String prezime) {
        super (ime, prezime);
        this.predmetiKojePredaje = new ArrayList<> ();
    }

    public ArrayList<String> getPredmetiKojePredaje() {
        return predmetiKojePredaje;
    }

    public void setPredmetiKojePredaje(ArrayList<String> predmetiKojePredaje) {
        this.predmetiKojePredaje = predmetiKojePredaje;
    }

    public void add(String predmet) {
        predmetiKojePredaje.add (predmet);
    }

    public void add(String predmet, int i) {
        predmetiKojePredaje.add (i, predmet);
    }

    public void addAll(ArrayList<String> predmeti) {
        for (int i = 0; i < predmeti.size (); i++) {
            predmetiKojePredaje.add (i, predmeti.get (i));
        }
    }

    public void remove(int i) {
        predmetiKojePredaje.remove (i);
    }

    public void remove(String predmet) {
//        for (int i = 0; i < predmetiKojePredaje.size (); i++) {
//            if (predmetiKojePredaje.get (i).equalsIgnoreCase (predmet)) {
//                predmetiKojePredaje.removePreplaceni (i);
//            }
//        }
        predmetiKojePredaje.remove (predmet);
    }
    //Omoguciti da mozemo porediti dva objekta ove klase.
    //
    //Overridovati toString() metod:
    //"<ime> <prezime> <brojGodina> je profesor i predaje:
    // [<predmet1>, ..., <predmetN>]"


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass () != o.getClass ()) return false;
        else {
            Profesor profesor = (Profesor) o;
            if (getID () == profesor.getID ())
                return true;
            else
                return false;
        }
    }

    @Override
    public String toString() {
        String s1 = (super.toString () + " je profesor i predaje: ");
//        String s2 = null;
//        for (int i = 0; i < predmetiKojePredaje.size (); i++) {
//            s2 = (predmetiKojePredaje.get (i) + " \n");
//        }

        return s1 + predmetiKojePredaje.toString ();
    }
}
