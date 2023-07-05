package nedelja4.Cetvrtak.Domaci;
/*
 * Domaci Zadatak 1:
Napraviti Klasu Planina koja ima atribute za visinu i naziv planine.
Napraviti klasu Planinar koja kao atribute ima listu planina na koje se planinar popeo,
maksimalan uspon, sto predstavlja maksimalnu visinu na koju planinar moze da se popne i
atribut za tezinu opreme.
Napraviti Interfejs Planinarenje koji ce imati metode za:
-popniSe(Planina p) - Za prosledjenu planinu proveriti da li je njena visina manja od
 maksimalnog uspona Planinara, ako jeste, dodati je u listu Planina.
-clanarina() - Vraca koliko kosta clanarina, znamo da je fiksno 1000 dinara, plus
 dobijamo 2% popusta za svaku planinu na koju se Planinar popeo.
-sviUsponi() - Vraca koliko se sve ukupno Planinar popeo kada se saberu sve visine
 planina na koje se on popeo.
** Opciona metoda= najvecaPlanina() - Vraca najvecu planinu iz liste.
Klasa Planinar implementira Interfejs Planinarenje. Definisati sve potrebne get i set metode,
konstruktore kao i toString().


 */
public class Planina {
    private int visina;
    private String naziv;

    public Planina(int visina, String naziv) {
        this.visina = visina;
        this.naziv = naziv;
    }

    public Planina() {
        this.naziv = "";
    }

    public int getVisina() {
        return visina;
    }

    public void setVisina(int visina) {
        this.visina = visina;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return "Planina " + naziv + " je visoka " + visina + " metara.";
    }
}
