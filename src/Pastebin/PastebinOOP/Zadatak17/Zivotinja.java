package Pastebin.PastebinOOP.Zadatak17;
/*
 * 17.
Napisati abstraktnu klasu Zivotinja koja ima atribute:
- String naziv

Napisati sve odogvarajuce konstruktore

Napisati sve gettere i settere

Napisati abstraktne metode:
1. void leti() koja ispisuje poruku:
 "Ja letim"; ukoliko zivotinja moze da leti
 "Ja ne mogu da letim"; inace
2. void pliva() koja ispisuje poruku:
 "Ja plivam"; ukoliko zivtonja iskljucivo pliva
 "Ja ne plivam"; inace
3. int brojNogu() koja vraca broj nogu zivotinje
4. boolean daLiJeDomaca() koja vraca odgovor na pitanje da li je zivotinja domaca ili ne
5. void oglasiSe() - koja ispisuje onomatopeju koja ta zivotinja izgovara.
(pas -> "woof"
 macka -> "nyaa"
 konj -> "pfff"
 ovca -> "bmee"
 krava -> "muuu"
 lav -> "roar"
 kokoska -> "kukuriku"
 zmija -> "ssss"
 delfin -> "<3")

---------------------------------------------------------------------------------------------------------------------------------------

Napisati abstraktnu klasu DomacaZivotinja koja nasledjuje klasu Zivotinja i ima atribute:
- String ime
- double kilaza
- int brojNogu

Napisati sve odgovarajuce konstruktore

Napisati sve gettre i settere

Napisati abstraktne metode:
1. boolean daLiSeJedem() - koja vraca na odgovor na pitanje da li se meso te zivotinje jede, ili ne (poput "psa" i "macke")

Overridovati sve metode koje mozemo da overridujemo

---------------------------------------------------------------------------------------------------------------------------------------

Napisati klase Krava, Ovca, Pas, Macka, Konj, Kokoska koje nemaju atribute.

Napisati sve odgovarajuce konstruktore

Napisati sve gettre i settere

Overridovati sve metode.

---------------------------------------------------------------------------------------------------------------------------------------

Napisati abstraktnu klasu DivljaZivotinja koja nasledjuje klasu Zivotnja i ima atribute:
- int brojNogu
- String staniste

Napisati sve odgovarajuce konstruktore

Napisati sve gettre i settere

Napisati abstraktne metode:
1. boolean daLiSamOpasna() - koja vraca odgovor na pitanje da li je takva zivotnija opasna po coveka

Overridovati sve moguce metode

---------------------------------------------------------------------------------------------------------------------------------------

Napisati klase Lav, Zmija, Delfin koje nasledjuju klasu DivljeZivotinje i nemaju atribute

Napisati sve odgovarajuce konstruktore

Napisati sve gettre i settere

Overridovati sve metode.
 */
public abstract class Zivotinja {
    private String naziv;

    public Zivotinja(String naziv) {
        this.naziv = naziv;
    }

    public Zivotinja() {
        this.naziv = "";
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public abstract void leti();
    public abstract void pliva ();
    public abstract int brojNogu();
    public abstract boolean daLiJeDomaca();
    public abstract void oglasiSe();

    public void ispisiSve(){
        System.out.println (naziv  + "\n");
        leti ();
        pliva ();
        System.out.println (brojNogu ());
        if (daLiJeDomaca ()){
            System.out.println ("Domaca je");
        }
        else System.out.println ("Nije domaca");
        oglasiSe ();
    }

}
