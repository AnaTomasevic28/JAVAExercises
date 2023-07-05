package Pastebin.PastebinOOP.Zadatak10;

import java.util.ArrayList;

/*
 * Napisati klasu VideoKlub koja sadrzi polja:
	- String naziv (naziv video kluba)
	- ArrayList katalog (katalog svig filmova na stanju)

Napisati konstruktor(e).
Napisati metod iznajmiFilm(Film f) - iznajmljuje jednu kopiju filma f ako je to moguce. Ako nije, ispisati na konzolu poruku:
	"Film {nazivFilma} trenutno nema na stanju".
Napisati metod iznajmiFilm(Film f, int n) - iznajmljuje n kopija filma f ako je to moguce. Ako nije moguce iznajmiti sve,
	iznajmiti sto vise kopija datog filma i ispisati poruku:
	"Jos {brojKupacaKojiJosCekaNaIznjamljivanje} kupaca zeli da iznajmi film {nazivFilma}"
	Ako nije moguce iznajmiti ni jedan film ipisati poruku:
	"Film {nazivFilma} trenutno nema na stanju".
Napisati metod dodajFilm(Film f, double c) - dodaje jednu kopiju filma f u katalog i postavlja mu cenu na c.
Napisati metod dodajFilm(Film f, double c, int n) - dodaje n kopija filma f u katalog i postavlja im cenu na c.
Napisati metod pregledajFilm(Film f) - ispisuje na konozulu:
	"{imeFilma} - {cena} | Na stanju: {kolicina}"
	"{sadrzajFilma}"
	(ili "{imeFilma} | Nema na stanju")
Napisati metod pregledajKatalog() - ispisuje ceo katalog na konzolu:
	"{imeFilma1} - {cena1} | Na stanju: {kolicina1}"
	.
	.
	.
	"{imeFilmaN} - {cenaN} | Na stanju: {kolicinaN}"
 */
public class VideoKlub {
    private String naziv; // naziv video kluba
    private ArrayList<FilmNaStanju> katalog;

    public VideoKlub(String naziv, ArrayList<FilmNaStanju> katalog) {
        this.naziv = naziv;
        this.katalog = katalog;
    }

    public VideoKlub() {
        this.naziv = "";
        this.katalog = new ArrayList<> ();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<FilmNaStanju> getKatalog() {
        return katalog;
    }

    public void setKatalog(ArrayList<FilmNaStanju> katalog) {
        this.katalog = katalog;
    }
    //Napisati metod iznajmiFilm(Film f) - iznajmljuje jednu kopiju filma f ako je to moguce. Ako nije, ispisati na konzolu poruku:
    //	"Film {nazivFilma} trenutno nema na stanju".
    public void iznajmiFilm(Film f){
        for (int i = 0; i < katalog.size (); i++) {
            if (katalog.get(i).getFilm ().equals (f)){
                katalog.remove (f);
                katalog.get(i).setKolicina(katalog.get (i).getKolicina () - 1);
                break;
            }
            else System.out.println ("Film " + katalog.get (i).getFilm ().getIme () + " trenutno nema na stanju");
        }
    }
    //Napisati metod iznajmiFilm(Film f, int n) - iznajmljuje n kopija filma f ako je to moguce. Ako nije moguce iznajmiti sve,
    //	iznajmiti sto vise kopija datog filma i ispisati poruku:
    //	"Jos {brojKupacaKojiJosCekaNaIznjamljivanje} kupaca zeli da iznajmi film {nazivFilma}"
    //	Ako nije moguce iznajmiti ni jedan film ipisati poruku:
    //	"Film {nazivFilma} trenutno nema na stanju".
    public void iznajmiFilm(Film f, int i){
        for (int j = 0; j < katalog.size(); j++) {
            if (katalog.get (j).getFilm ().equals (f)){
                if (katalog.get (j).getKolicina () == 0){
                    System.out.println ("Film " + katalog.get (j).getFilm ().getIme () + " trenutno nema na stanju");
                }
                else if (katalog.get (j).getKolicina () >= i){
                    katalog.get (j).setKolicina (katalog.get (j).getKolicina () - i);
                } else if (katalog.get (j).getKolicina () < i) {
                    System.out.println ("Jos " + (i - katalog.get(j).getKolicina()) + " kupaca zeli da iznajmi film "
                            + katalog.get(j).getFilm().getIme());
                    katalog.get (j).setKolicina (0);
                }
            }
        }
    }
    //Napisati metod dodajFilm(Film f, double c) - dodaje jednu kopiju filma f u katalog i postavlja mu cenu na c.
    public void dodajFilm(Film f, double c){
       FilmNaStanju filmNaStanju = new FilmNaStanju (f, 1, c);
       katalog.add (filmNaStanju);
//            if (katalog.get(i).getFilm ().equals (f)){
//                katalog.get (i).setKolicina(katalog.get (i).getKolicina () + 1);
//                katalog.get (i).setCena (c);
//            }
//        }
    }
    //Napisati metod dodajFilm(Film f, double c, int n) - dodaje n kopija filma f u katalog i postavlja im cenu na c.
    public void dodajFilm(Film f, double c, int n){
        FilmNaStanju filmNaStanju = new FilmNaStanju (f, n, c);
        katalog.add (filmNaStanju);
//        for (int i = 0; i < katalog.size (); i++) {
//            if (katalog.get (i).getFilm ().equals (f)){
//                katalog.get (i).setKolicina (katalog.get (i).getKolicina () + n);
//                katalog.get (i).setCena (c);
//            }
//        }
    }
    //Napisati metod pregledajFilm(Film f) - ispisuje na konozulu:
    //	"{imeFilma} - {cena} | Na stanju: {kolicina}"
    //	"{sadrzajFilma}"
    //	(ili "{imeFilma} | Nema na stanju")
    public String pregledajFilm(Film f){
        StringBuilder sb = new StringBuilder ();
        for (int i = 0; i < katalog.size (); i++) {
            if (katalog.get (i).getFilm ().equals (f)){
                if (katalog.get (i).getKolicina () == 0){
                    sb.append(katalog.get (i).getFilm ().getIme ()).append (" | ").append (" Nema na stanju.");
                }else {
                    sb.append (katalog.get (i).getFilm ().getIme ()).append (" - ").append (katalog.get (i).getCena ());
                    sb.append (" | ").append (" Na stanju:").append (katalog.get (i).getKolicina ()).append ("\n");
                    sb.append (katalog.get (i).getFilm ().getSadrzaj ());
                }
            }
        }
        return sb.toString ();
    }
    //Napisati metod pregledajKatalog() - ispisuje ceo katalog na konzolu:
    //	"{imeFilma1} - {cena1} | Na stanju: {kolicina1}"
    //	.
    //	.
    //	.
    //	"{imeFilmaN} - {cenaN} | Na stanju: {kolicinaN}"
    public void pregledajKatalog(){
        for (int i = 0; i < katalog.size (); i++) {
            System.out.println (katalog.get (i).toString ());
        }
    }
}

