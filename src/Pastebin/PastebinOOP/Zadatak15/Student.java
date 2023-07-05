package Pastebin.PastebinOOP.Zadatak15;

import java.util.ArrayList;

/*
 *
Napisati klasu Student koja nasledjuje klasu Ucenik i ima atribute:
- ArrayList<String> predmeti
- ArrayList<Profesor> profesori

Napraviti 2 konstrutkora:
- Jedan oji prima sve argumente
- Podrazumevani koji ne prima ni jedan argument i postavlja ove 2 liste na nove prazne ArrayListe.

Napisati sve gettere i settere

Napisati metode:
1. addPredmet(String s)
2. addPredmet(String s, int i)
3. addProfesor(Profesor p)
4. addProfesor(Profesor p, int i)
5. removePredmet(String s)
6. removeProfesor(Profesor p) - Paziti da ovakav profesor postoji u listi! Ako ne postoji, ne raditi nista

Overridovati toString() metod:
"<ime> <prezime> <brGodina> je student i pohadja predmete:
 <predmet1.toString()>
 ...
 <predmetN.toString()>
 Ovom studentu predaju profesori:
 <profesor1.toString()>
 ...
 <profesorK.toString()>"
 */
public class Student extends Ucenik{
    private ArrayList<String> predmeti;
    private ArrayList<Profesor> profesori;

    public Student() {
        this.predmeti = new ArrayList<> ();
        this.profesori = new ArrayList<> ();
    }

    public Student(String ime, String prezime, int brojGodina, ArrayList<Double> ocene, ArrayList<String> predmeti, ArrayList<Profesor> profesori) {
        super (ime, prezime, brojGodina, ocene);
        this.predmeti = predmeti;
        this.profesori = profesori;
    }

    public ArrayList<String> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(ArrayList<String> predmeti) {
        this.predmeti = predmeti;
    }

    public ArrayList<Profesor> getProfesori() {
        return profesori;
    }

    public void setProfesori(ArrayList<Profesor> profesori) {
        this.profesori = profesori;
    }
    public void addPredmet(String s){
        predmeti.add (s);
    }
    public void addPredmet(String s, int i){
        predmeti.add (i, s);
    }
    public void addProfesor(Profesor p){
        profesori.add (p);
    }
    public void addProfesor(Profesor p, int i){
        profesori.add (i,p);
    }
    public void removePredmet(String s){
        predmeti.remove (s);
    }
    public void removeProfesor(Profesor p){
        profesori.remove (p);
//        for (int i = 0; i < profesori.size (); i++) {
//            if (profesori.get (i).equals (p)){
//                profesori.remove (p);
//                break;
//            }
//        }
    }
    /*
    Overridovati toString() metod:
"<ime> <prezime> <brGodina> je student i pohadja predmete:
 <predmet1.toString()>
 ...
 <predmetN.toString()>
 Ovom studentu predaju profesori:
 <profesor1.toString()>
 ...
 <profesorK.toString()>"
     */

    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append(super.toString ()).append (" je student i pohadja predmete: ").append ("\n");
        sb.append(predmeti.toString ()).append ("\n");
        sb.append("Ovom studentu predaju profesori: ").append ("\n");
        sb.append (profesori.toString ());
        return sb.toString ();
    }
}
