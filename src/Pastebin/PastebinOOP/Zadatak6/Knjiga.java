package Pastebin.PastebinOOP.Zadatak6;

import Pastebin.PastebinOOP.Zadatak1.Osoba;

/*
 *6. Napisati klasu Knjiga koja ima sledeca polja/atribute:
nazivKnjige (string),
autor (Osoba),
vlasnik (Osoba)
brojStrana (int),
godinaIzdanja (int).
Broj strana i godina izadanje ne mogu biti negativni. Ispisati poruku o gresci ako korisnik pokusa da napravi knjigu sa negativnim brojem strana ili godinom izdanja (u konstruktoru, jer se tamo 'pravi' knjiga).
Takodje ispisati poruku o gresci ako korisnik pokusa da set-uje neku od ove dve vrednosti na negativno.
Napisati sledece metode
	2 konstruktora. Knjiga ne mora imati vlasnika -> dakle jedan konstruktor gde se salje i ko je vlasnik, drugi konstruktor gde se ne salje ko je vlasnik
	getter i setter metode za sva polja
	toString koristeci stringBuilder
	format
		Naziv knjige je: <naziv knjige>
		Autor knjige je: <ime i prezime autora ako postoji, 'nepoznato' ako autor nije postavljen (null)>
		Vlasnik knjige je: <ime i prezime vlasnika ako postoji, 'knjiga nema vlasnika' ako vlasnik nije postavljen (null)>
		Broj strana: <broj strana>
		Godina izdanja: <godina izdanja>
	napisati i metodu "velicinaKnjige" koja vraca string
		- "mala knjiga" - ako je broj strana od 0 do 100
		- "srednje velika knjiga" - ako je broj strana od 101 do 300
		- "velika knjiga" - ako je broj strana od 301-600
		- "bas velika knjiga" - ako je broj strana 601 i vise

 */
public class Knjiga {

    private String nazivKnjige;
    private Osoba autor;
    private Osoba vlasnik;
    private int brojStrana;
    private int godinaIzdanja;

    private void postaviBrojStrana(int brojStrana){
        if (brojStrana <= 0){
            brojStrana = 0;
            System.out.println ("Broj strana mora biti pozitivan broj.");
        }
        else this.brojStrana=brojStrana;
    }
    private void postaviGodinuIzdanja(int godinaIzdanja){
        if (godinaIzdanja <= 0){
            System.out.println ("Godina izdanja nije isravna!");
            this.godinaIzdanja = 0;
        }
        else this.godinaIzdanja = godinaIzdanja;
    }

    public Knjiga(String nazivKnjige, Osoba autor, Osoba vlasnik, int brojStrana, int godinaIzdanja) {
        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        this.vlasnik = vlasnik;
        postaviBrojStrana (brojStrana);
        postaviGodinuIzdanja (godinaIzdanja);
    }

    public Knjiga(String nazivKnjige, Osoba autor, int brojStrana, int godinaIzdanja) {
        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        postaviBrojStrana (brojStrana);
        postaviGodinuIzdanja (godinaIzdanja);
    }

    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public Osoba getAutor() {
        return autor;
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    public Osoba getVlasnik() {
        if (vlasnik == null){
            System.out.println ("Ova knjiga nema vlasnika.");
        }
        return vlasnik;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        if (brojStrana <= 0){
            System.out.println ("Uneti broj strana nije isravan! Broj strana ostaje nepromenjena " + this.brojStrana);
        }
        else this.brojStrana = brojStrana;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        if (godinaIzdanja <= 0){
            System.out.println ("Uneta godina izgdanja nije isravna! Godina izdanja ostaje nepromenjena " + this.godinaIzdanja);
        }
        else this.godinaIzdanja = godinaIzdanja;
    }

    /*
    napisati i metodu "velicinaKnjige" koja vraca string
		- "mala knjiga" - ako je broj strana od 0 do 100
		- "srednje velika knjiga" - ako je broj strana od 101 do 300
		- "velika knjiga" - ako je broj strana od 301-600
		- "bas velika knjiga" - ako je broj strana 601 i vise
     */
    public String velicinaKnjige(){
        String poruka = "";
        if (brojStrana <=100){
            poruka = ("Mala knjiga");
        } else if (brojStrana <300) {
            poruka = ("Srednje velika knjiga");
        } else if (brojStrana<600) {
            poruka = ("Velika knjiga");
        }
        else poruka = ("Bas velika knjiga");

        return poruka;
    }
/*
Naziv knjige je: <naziv knjige>
		Autor knjige je: <ime i prezime autora ako postoji, 'nepoznato' ako autor nije postavljen (null)>
		Vlasnik knjige je: <ime i prezime vlasnika ako postoji, 'knjiga nema vlasnika' ako vlasnik nije postavljen (null)>
		Broj strana: <broj strana>
		Godina izdanja: <godina izdanja>
 */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append ("Naziv knjige je: ").append (nazivKnjige).append ("\n");
        if (autor == null) {
            sb.append ("Nepoznato");
        }
        else sb.append ("Autor knjige je: ").append (autor.getIme () + " ").append (autor.getPrezime ()).append ("\n");
        if (vlasnik == null){
            sb.append ("Knjiga nema vlasnika." + "\n");
        }
        else sb.append ("Vlasnik knjige je: ").append (vlasnik.getIme () + " ").append (vlasnik.getPrezime ()).append ("\n");
        sb.append ("Broj strana knjige je: ").append (brojStrana).append ("\n");
        sb.append ("Godina izdanja knjige je: ").append (godinaIzdanja);

        return sb.toString ();
    }
}
