package Pastebin.PastebinOOP.Zadatak10;

import java.util.Objects;

/*
 *Napisati klasu Film koja sadrzi atribute:
	- String ime
	- int godinaPremijere (godina kada je film prvi put prikazan; 1888 - 2021) (default = 2021)
	- double ocena (ocena filma, [1.0, 10.0]) (default = 1.0)
	- String sadrzaj (kratak sadrzaj filma)
	- int sati, minuti, sekunde (koliko sati, minuti i sekundi traje film| [0, 10), [0, 59], [0, 59] ) (default = 1, 30, 0)

Napisati konstruktor(e) i proveriti da li su unosi validni. Ako uslovi nisu validni, postaviti ih na default vrednosti.

 */
public class Film {
    private String ime;
    private int godinaPremijere; //(godina kada je film prvi put prikazan; 1888 - 2021) (default = 2021)
    private double ocena; //(ocena filma, [1.0, 10.0]) (default = 1.0)
    private String sadrzaj;
    private int sati,minuti,sekunde; //(koliko sati, minuti i sekundi traje film| [0, 10), [0, 59], [0, 59] ) (default = 1, 30, 0)

    public Film(String ime, int godinaPremijere, double ocena, String sadrzaj, int sati, int minuti, int sekunde) {
        this.ime = ime;
        this.godinaPremijere = godinaPremijere;
        if (ocena < 1){
            this.ocena = 1;
        } else if (ocena > 10) {
            this.ocena = 10;
        }else
        this.ocena = ocena;
        this.sadrzaj = sadrzaj;
        this.sati = sati;
        this.minuti = minuti;
        this.sekunde = sekunde;
    }

    public Film() {
        this.ime = "";
        this.godinaPremijere = 2021;
        this.ocena = 1;
        this.sadrzaj = "";
        this.sati = 1;
        this.minuti = 30;
        this.sekunde = 0;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodinaPremijere() {
        return godinaPremijere;
    }

    public void setGodinaPremijere(int godinaPremijere) {
        this.godinaPremijere = godinaPremijere;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        if (ocena < 1){
            this.ocena = 1;
        } else if (ocena > 10) {
            this.ocena = 10;
        }else
            this.ocena = ocena;
    }

    public String getSadrzaj() {
        return sadrzaj;
    }

    public void setSadrzaj(String sadrzaj) {
        this.sadrzaj = sadrzaj;
    }

    public int getSati() {
        return sati;
    }

    public void setSati(int sati) {
        this.sati = sati;
    }

    public int getMinuti() {
        return minuti;
    }

    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    public int getSekunde() {
        return sekunde;
    }

    public void setSekunde(int sekunde) {
        this.sekunde = sekunde;
    }
    /*
    Napisati toString() metod:
	"{ime} {godinaPremijere} {ocena}
	 Duzina trajanja: {sati} : {minuti} : {sekunde}
	 {sadrzaj}"
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // uporedjuje referencu
        if (o == null || getClass () != o.getClass ()) return false;
        Film film = (Film) o;
        return godinaPremijere == film.godinaPremijere && Double.compare (film.ocena, ocena) == 0 && sati == film.sati && minuti == film.minuti && sekunde == film.sekunde && Objects.equals (ime, film.ime) && Objects.equals (sadrzaj, film.sadrzaj);
    }

    @Override
    public int hashCode() {
        return Objects.hash (ime, godinaPremijere, ocena, sadrzaj, sati, minuti, sekunde);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append (ime).append (" ").append (godinaPremijere).append (" ").append (ocena).append ("\n");
        sb.append ("Duzina trajanja: ").append (sati).append (":").append (minuti).append (":").append (sekunde).append ("\n");
        sb.append (sadrzaj);
        return sb.toString ();
    }
}
