package nedelja3.PetakOOP.Domaci;

/*
 * Domaci Zadatak 2:
Napraviti klasu Radnik koja ce imati atribute za ime, broj odradjenih sati u nedelji(double),
satnicu(double).
Naraviti klase Masinovodja, Fizikalac i SefSmene koji ce nasledjivati klasu Radnik.
SefSmene ce imati dodatni atribut za nedeljni bonus.
U klasi Radnik definisati dve metode:
1) Metoda koja vraca ukupno para zaradjeno za nedelju dana (Sefu Smene na ovu ukupnu
zaradu dodajemo nedeljni bonus).
2) Metoda koja govori da li je radnik na odmoru, Fizikalac je na odmoru ako ima vise od 40
odradjenih sati u nedelji, Masinovodja 30 a Sef smene 50 radnih sati.
Za sve klase je potrebno definisati konstruktor, odgovarajuce get i set metode kao i toString().
 */

public class Radnik {

    private String ime;
    private double odradjeniSatiUNedelji;
    private double satnica;

    public double nedeljnaZarada(){
        return odradjeniSatiUNedelji * satnica;
    }

    public boolean odmor(){
        if (getOdradjeniSatiUNedelji () >= 30)
            return true;
        else return false;
    }

    public Radnik(String ime, double odradjeniSatiUNedelji, double satnica) {
        this.ime = ime;
        this.odradjeniSatiUNedelji = odradjeniSatiUNedelji;
        this.satnica = satnica;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getOdradjeniSatiUNedelji() {
        return odradjeniSatiUNedelji;
    }

    public void setOdradjeniSatiUNedelji(double odradjeniSatiUNedelji) {
        this.odradjeniSatiUNedelji = odradjeniSatiUNedelji;
    }

    public double getSatnica() {
        return satnica;
    }

    public void setSatnica(double satnica) {
        this.satnica = satnica;
    }

    @Override
    public String toString() {

        return ime + " je u prethodnoj nedelji ostvario ukupno radnih sati " +
                odradjeniSatiUNedelji + " dok je cena sata " + satnica + " dinara." + "\n";
    }
}
