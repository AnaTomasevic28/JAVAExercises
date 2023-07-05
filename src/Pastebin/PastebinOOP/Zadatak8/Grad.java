package Pastebin.PastebinOOP.Zadatak8;
/*
8. Napisati naredne klase:
Napisati klasu grad koja ima sledece polja/atribute
	- ime(String)
	- brojStanovnika(int)
	- drzava(String)
Napisati sledece metode
	konstruktor - samo jedan, ( sva polja su obavezna)
	getter i setter
	toString
		Ime grada: <ime>
		Broj stanovnika: <brojStanovnika>
		Drzava: <drzava>
 */
public class Grad {
    private String ime;
    private int brojStanovnika;
    private String drzava;


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public Grad(String ime, int brojStanovnika, String drzava) {
        this.ime = ime;
        this.brojStanovnika = brojStanovnika;
        this.drzava = drzava;
    }
    @Override
    public String toString() {
        String s1 = ("Ime grada: " + ime);
        String s2 = ("Broj stanovnika: " + brojStanovnika);
        String s3 = ("Drzava: " + drzava);
        return s1 + s2 + s3;
    }
}
