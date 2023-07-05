package Pastebin.PastebinOOP.Zadatak16;
/*
 * Napisati klasu Autobus koja nasledjuje klasu Vozilo i ima atribute:
- int brojPutnika

Autobus ima 8 tockova

Napisati 2 konstruktora:
- Jedan koji prima broj putnika
- Podrazumevani koji ne prima argumente i postavlja broj putnika na 0

Napisati sve gettere i settere



Napisati metode:
1. dodajPutnika() - koja dodaje jednog putnika u Autobus, pazeci da Autobus moze najvise imati 90 putnika.
2. oduzmiPutnika() - koja oduzima jednog putnika iz Autobusa, pazeci da Autobus moze imati najmanje 0 putnika.
3. dodajPutnika(int n) - koja dodaje n putnika u Autobus. Ukoliko ne mogu da stanu svih n putnika, onda ih dodati do gornje granice
4. oduzmiPutnika(int n) - koja oduzima n putnika iz Autobusa. Ukoliko nema n putnika u Autobus, izbaciti sve putnike iz Autobusa.
5. isprazniAutobus() - izbacuje sve putnike iz Autobusa
6. napuniAutobus() - puni Autobus sa 2


Overridovati sve metode iz natklase.
 */
public class Autobus extends Vozilo{
    private int brojPutnika;

    public Autobus(String registarskiBroj, String marka, String tip, int brojPutnika) {
        super (registarskiBroj, marka, tip);
        if (brojPutnika > 90){
            System.out.println ("Broj putnika ne moze biti veci od 90");
            this.brojPutnika = 90;
        }else this.brojPutnika = brojPutnika;
    }

    public Autobus(String registarskiBroj, String marka, String tip) {
        super (registarskiBroj, marka, tip);
    }

    public int getBrojPutnika() {
        return brojPutnika;
    }

    public void setBrojPutnika(int brojPutnika) {
        if (brojPutnika > 90){
            System.out.println ("Autobus moze da poveze max 90 putnika! Izadjite svi napolje");
            this.brojPutnika = 0;
        }else this.brojPutnika = brojPutnika;
    }

    @Override
    public char vratiKategoriju() {
        return 'D';
    }

    @Override
    public int brojTockova() {
        return 8;
    }

    @Override
    public int brojPutnika() {
        return brojPutnika;
    }
//dodajPutnika() - koja dodaje jednog putnika u Autobus, pazeci da Autobus moze najvise imati 90 putnika.
    public void dodajPutnika(){
        if (brojPutnika < 90){
            brojPutnika++;
        }
        else System.out.println ("Nema slobodnih mesta u autobusu");
    }
    //oduzmiPutnika() - koja oduzima jednog putnika iz Autobusa, pazeci da Autobus moze imati najmanje 0 putnika.
    public void oduzmiPutnika(){
        if (brojPutnika >= 1){
            brojPutnika -=1;
        }
        else System.out.println ("Autobus je prazan");
    }
    //dodajPutnika(int n) - koja dodaje n putnika u Autobus. Ukoliko ne mogu da stanu svih n putnika, onda ih dodati do gornje granice
    public void dodajPutnika(int n){
        if (brojPutnika == 90){
            System.out.println ("Autobus je pun");
        }
        else if ((brojPutnika + n) > 90){        // 4+2=6>5
            while (brojPutnika < 90){           // 4<5, 5!<5
                brojPutnika++;                  // 4+1=5,
            }
        }
        else if ((brojPutnika + n) <= 90){                // 2+2=4<5
            for (int i = 0; i < n; i++) {               // 0<2, i+1 --> 1<2, i+1 --> 2!<2
                brojPutnika++;                          // 2+1=3, 3+1=4,
            }
        }
    }
    //oduzmiPutnika(int n) - koja oduzima n putnika iz Autobusa. Ukoliko nema n putnika u Autobus, izbaciti sve putnike iz Autobusa.
    public void oduzmiPutnika(int n){
        if (brojPutnika == 0){
            System.out.println ("Autobus je prazan");
        }
        else if (brojPutnika < n) {
            setBrojPutnika (0);
        }
        else if (brojPutnika > n) {       //5>3  5-3=2
            for (int i = 0; i < n; i++) {   // 0<3, i+1 --> 1 < 3, i+1 --> 2<3, i+1 --> 3!<3
                brojPutnika--;              // broj putnika = 5-1=4, = 4-1=3, = 3-1=2
            }
        }
    }
    //isprazniAutobus() - izbacuje sve putnike iz autobusa
    public void isprazniAuto(){
        setBrojPutnika (0);
    }
    //napuniAutobus() - puni autobus sa 90 putnika
    public void napuniAuto(){
        setBrojPutnika (90);
    }
    @Override
    public String toString() {
        return super.toString ();
    }
}
