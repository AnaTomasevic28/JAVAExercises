package Pastebin.PastebinOOP.Zadatak10;

import java.util.ArrayList;

/*
 * Napisati klasu Korpa koja sadrzi polja:
	- VideoKlub vk (neki video klub)
	- ArrayList korpa (korpa u koju mogu da se stavljaju filmovi koje neki kupac hoce da kupi)
	- double ukupnaCena (ukupna cena filmova u korpi)

Napisati odogarajuc(e) konstruktor(e) i metode za ovu klasu.
Napisati metodu dodajFilmUKorpu(Film f) - dodaje jednu kopiju film f u korpu ako ga ima na stanju u zadatom video klubu.
	AKo zadatog filma nema na stanju ispisati poruku:
	"Film {f} nema na stanju."
Napisati metodu dodajFilmaUKorpu(Film f, int n) - dodaje n kopija filma f u kopru ako ga ima na stanju u zadatom video klubu.
	Ako u video klubu ima manje od n kopija filma f, onda dodati sve preostale kopije u korpu i ispisati poroku:
	"Nije moguce kupiti {n} filmova {nazivFilma}.
	 U korpu je dodato {brojKopija} kopija filma {nazivFilma}."
Napisati metod izbaciIzKorpe(Film f) - izbacuje jednu kopiju filma f iz korpe (pretpostaviti da takav film uvek postoji u korpi).
	Ispisati poruku:
	"Izbacili ste kopiju filma {nazivFilma} iz korpe".
Napisati metod izbaciIzKorpe(Film f, int n) - izbacuje n kopija filma f iz korpe i ispisati poruku:
	"Izbacili ste {n} kopija filma {nazivFilma} iz korpe.".
	Ako je prosledjen broj n veci ili jednak broju kopija filma f u korpi ispisati poruku:
	"Izbacili ste sve kopije filma {nazivFilma} iz korpe."
Napisati metod izbaciIzKopreSveKopije(Film f) - izbacuje sve kopije filma f iz korpe i ispisuje poruku:
	"Izbacili ste sve kopije filma {nazivFilma} iz korpe."
Napisati metod izbaciSveIzKorpe() - potpuno prazni korpu i ispisuje poruku:
	"Korpa je sada prazna."
Napisati metod ispisiInventarKorpe() koja ispisuje inventar korpe:
	"{nazivFilma1} {brojKopijaFilma1UKorpi} {ukupnaCenaSvihKopijaFilma1UKopri}
	 .
	 .
	 .
	 {nazivFilmaN} {brojKopijaFilmaNUKorpi} {ukupnaCenaSvihKopijaFilmaNUKopri}"
	 Ukupna cena: {ukupnaCena} svih filmova u korpi"
 */
public class Korpa {
    private VideoKlub vk;
    private ArrayList<Film> korpa;
    private double ukupnaCena;

    public Korpa(VideoKlub vk, ArrayList<Film> korpa, double ukupnaCena) {
        this.vk = vk;
        this.korpa = korpa;
        this.ukupnaCena = ukupnaCena;
    }

    public Korpa() {
        this.vk = new VideoKlub ();
        this.korpa = new ArrayList<> ();
        this.ukupnaCena = 0;
    }

    public VideoKlub getVk() {
        return vk;
    }

    public void setVk(VideoKlub vk) {
        this.vk = vk;
    }

    public ArrayList<Film> getKorpa() {
        return korpa;
    }

    public void setKorpa(ArrayList<Film> korpa) {
        this.korpa = korpa;
    }

    public double getUkupnaCena() {
        return ukupnaCena;
    }

    public void setUkupnaCena(double ukupnaCena) {
        this.ukupnaCena = ukupnaCena;
    }
    //Napisati metodu dodajFilmUKorpu(Film f) - dodaje jednu kopiju film f u korpu ako ga ima na stanju u zadatom video klubu.
    //	AKo zadatog filma nema na stanju ispisati poruku:
    //	"Film {f} nema na stanju."
    public void dodajFilmUKorpu(Film f){
        for (int i = 0; i < vk.getKatalog ().size (); i++) {
            if (vk.getKatalog ().get (i).getFilm ().equals (f)) {
                if (vk.getKatalog ().get (i).getKolicina () == 0) {
                    System.out.println ("Film " + f + " nema na stanju.");
                } else if (vk.getKatalog ().get (i).getKolicina () > 0){
                    korpa.add (vk.getKatalog ().get (i).getFilm ());
                    vk.getKatalog ().get (i).setKolicina (vk.getKatalog ().get (i).getKolicina () - 1);
                    setUkupnaCena (getUkupnaCena () + vk.getKatalog ().get (i).getCena ());
                }
            }
        }
    }
    //Napisati metodu dodajFilmaUKorpu(Film f, int n) - dodaje n kopija filma f u kopru ako ga ima na stanju u zadatom video klubu.
    //	Ako u video klubu ima manje od n kopija filma f, onda dodati sve preostale kopije u korpu i ispisati poroku:
    //	"Nije moguce kupiti {n} filmova {nazivFilma}.
    //	 U korpu je dodato {brojKopija} kopija filma {nazivFilma}."
    public void dodajFilmUKorpu(Film f, int n){
        for (int i = 0; i < vk.getKatalog ().size (); i++) {
            if (vk.getKatalog ().get (i).getFilm ().equals (f)) {
                if (vk.getKatalog ().get (i).getKolicina () == 0) {
                    System.out.println ("Film " + f + " nemamo trenutno na stanju");
                } else {
                    if (vk.getKatalog ().get (i).getKolicina () > n) {
                        vk.getKatalog ().get (i).setKolicina (vk.getKatalog ().get (i).getKolicina () - n);
                        setUkupnaCena (getUkupnaCena () + (n * vk.getKatalog ().get (i).getCena ()));
                        for (int j = 0; j < n; j++) {
                            korpa.add (f);
                        }
                    } else if (vk.getKatalog ().get (i).getKolicina () < n) {
                        for (int j = 0; j < (vk.getKatalog ().get (i).getKolicina ()); j++) {
                            korpa.add (f);
                        }
                        System.out.println ("Nije moguce kupiti " + n + " filmova " + f.getIme ());
                        System.out.println ("U korpu je dodato " + vk.getKatalog ().get (i).getKolicina () + " kopija filma " + f.getIme ());
                        setUkupnaCena (getUkupnaCena () + (vk.getKatalog ().get (i).getKolicina () * vk.getKatalog ().get (i).getCena ()));
                        vk.getKatalog ().get (i).setKolicina (0);
                    }
                }
            }
        }
    }
    //Napisati metod izbaciIzKorpe(Film f) - izbacuje jednu kopiju filma f iz korpe (pretpostaviti da takav film uvek postoji u korpi).
    //	Ispisati poruku:
    //	"Izbacili ste kopiju filma {nazivFilma} iz korpe".
    public void izbaciIzKorpe(Film f){
        korpa.remove (f);
        setUkupnaCena (getUkupnaCena () - cenaIznajmljivanja (f));
        for (int i = 0; i < vk.getKatalog ().size (); i++) {
            if (vk.getKatalog ().get (i).getFilm ().equals (f)) {
                vk.getKatalog ().get (i).setKolicina (vk.getKatalog ().get (i).getKolicina () + 1);
            }
        }
        System.out.println ("Izbacili ste kopiju filma " + f.getIme () + " iz korpe.");
    }
/*    Napisati metod izbaciIzKorpe(Film f, int n) - izbacuje n kopija filma f iz korpe i ispisati poruku:
            "Izbacili ste {n} kopija filma {nazivFilma} iz korpe.".
    Ako je prosledjen broj n veci ili jednak broju kopija filma f u korpi ispisati poruku:
            "Izbacili ste sve kopije filma {nazivFilma} iz korpe."
 */
    public void izbaciIzKorpe(Film f, int n){
      int brojKopija = 0;
        for (int i = 0; i < korpa.size (); i++) {
            if (korpa.get (i).equals (f)){
                brojKopija++;
            };
        }
        if (brojKopija > n){
            for (int i = 0; i < n; i++) {
                korpa.remove (f);
            }
            System.out.println ("Izbacili ste " + n + " kopija filma " + f.getIme () + " iz korpe.");
        } else {
            for (int i = 0; i < brojKopija; i++) {
                korpa.remove (f);
            }
            System.out.println ("Izbacili ste sve kopija filma " + f.getIme () + " iz korpe.");
        }
    }
    //Napisati metod izbaciIzKopreSveKopije(Film f) - izbacuje sve kopije filma f iz korpe i ispisuje poruku:
    //	"Izbacili ste sve kopije filma {nazivFilma} iz korpe."
    public void izbaciIzKorpeSveKopije(Film f){
        for (int i = 0; i < korpa.size (); i++) {
            if (korpa.get(i).equals (f)){
                korpa.remove (f);
                i--;
            }
        }
        System.out.println ("Izbacili ste sve kopija filma " + f.getIme () + " iz korpe.");
    }
    //Napisati metod izbaciSveIzKorpe() - potpuno prazni korpu i ispisuje poruku:
    //	"Korpa je sada prazna."
    public void izbaciSveIzKorpe(){
        korpa.clear ();
        System.out.println ("Korpa je prazna");
    }
/*    Napisati metod ispisiInventarKorpe() koja ispisuje inventar korpe:
            "{nazivFilma1} {brojKopijaFilma1UKorpi} {ukupnaCenaSvihKopijaFilma1UKopri}
            .
            .
            .
    {nazivFilmaN} {brojKopijaFilmaNUKorpi} {ukupnaCenaSvihKopijaFilmaNUKopri}"
    Ukupna cena: {ukupnaCena} svih filmova u korpi"
 */
private int kolikoIhIma(Film f){
    int kolikoIhIma = 0;
    for (int i = 0; i < korpa.size (); i++) {
        if (korpa.get (i).equals (f)){
            kolikoIhIma++;
        }
    }
    return kolikoIhIma;
}
private double cenaIznajmljivanja(Film f){
    double cena = 0;
    for (int i = 0; i < vk.getKatalog ().size (); i++) {
        if (vk.getKatalog ().get (i).getFilm ().equals (f)){
            cena = vk.getKatalog ().get (i).getCena ();
        }
    }
    return cena;
}
public String ispisiInventarKorpe(){
    StringBuilder sb = new StringBuilder ();
    ArrayList<Film> korpaBezDuplikata = new ArrayList<> ();
    for (int i = 0; i < korpa.size (); i++) {
        korpaBezDuplikata.add (korpa.get (i));
    }
    for (int i = 0; i < korpaBezDuplikata.size (); i++) {
        for (int j = i+1; j < korpaBezDuplikata.size (); j++) {
            if (korpaBezDuplikata.get (j).equals (korpaBezDuplikata.get (i))){
                korpaBezDuplikata.remove (j);
                j--;
            }
        }
    }
    for (int i = 0; i < korpaBezDuplikata.size (); i++) {
        sb.append (korpaBezDuplikata.get (i).getIme ()).append (", ").append (kolikoIhIma (korpaBezDuplikata.get (i))).append (", ");
        sb.append (kolikoIhIma (korpaBezDuplikata.get (i)) * cenaIznajmljivanja (korpaBezDuplikata.get (i))).append ("\n");
    }
    sb.append ("Ukupna cena svih filmova u korpi je: ").append (ukupnaCena);
    return sb.toString ();
}
}
