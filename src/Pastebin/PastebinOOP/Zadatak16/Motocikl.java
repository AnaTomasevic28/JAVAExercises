package Pastebin.PastebinOOP.Zadatak16;
/*
 * Napisati klasu Motocikl koja nasledjuje klasu Vozilo i ima atribute:
- int brojPutnika

Motocikl ima 2 tocka (Ko mi napise da moze da ima i 3 leti sa kursa!)

Napisati 2 konstruktora:
- Jedan koji prima broj putnika
- Podrazumevani koji ne prima argumente

Napisati sve gettere i settere

Napisati metode:
1. dodajPutnika() - koja dodaje jednog putnika na Motor, pazeci da motocikl moze najvise imati 2 putnika.
2. oduzmiPutnika() - koja oduzima jednog putnika sa Motora, pazeci da motor moze imati najmanje 0 putnika.
3. dodajPutnika(int n) - koja dodaje n putnika u Motor. Ukoliko ne mogu da stanu svih n putnika, onda ih dodati do gornje granice
4. oduzmiPutnika(int n) - koja oduzima n putnika iz Motora. Ukoliko nema n putnika u autu, izbaciti sve putnike sa motocikla.
5. isprazniMotor() - izbacuje sve putnike sa motora
6. napuniMotor() - puni motor sa 2 putnika


Overridovati sve metode iz natklase.
 */
public class Motocikl extends Vozilo{
    private int brojPutnika;

    public Motocikl(String registarskiBroj, String marka, String tip, int brojPutnika) {
        super (registarskiBroj, marka, tip);
        if (brojPutnika > 2){
            System.out.println ("Broj putnika ne moze biti veci od 5, nije ovo auto");
            this.brojPutnika = 2;
        }else this.brojPutnika = brojPutnika;
    }

    public Motocikl(String registarskiBroj, String marka, String tip) {
        super (registarskiBroj, marka, tip);
    }

    public int getBrojPutnika() {
        return brojPutnika;
    }

    public void setBrojPutnika(int brojPutnika) {
        if (brojPutnika > 2){
            System.out.println ("Motocikl moze da poveze max 2 putnika!");
            this.brojPutnika = 0;
        }else this.brojPutnika = brojPutnika;
    }

    @Override
    public char vratiKategoriju() {
        return 'A';
    }

    @Override
    public int brojTockova() {
        return 2;
    }

    @Override
    public int brojPutnika() {
        return brojPutnika;
    }
    //dodajPutnika() - koja dodaje jednog putnika na Motor, pazeci da motocikl moze najvise imati 2 putnika.
    public void dodajPutnika(){
        if (brojPutnika < 2) {
            brojPutnika++;
        }
        else System.out.println ("Nema vise mesta na motociklu.");
    }
    //oduzmiPutnika() - koja oduzima jednog putnika sa Motora, pazeci da motor moze imati najmanje 0 putnika.
    public void oduzmiPutnika(){
        if (brojPutnika >=1){
            brojPutnika -= 1;
        }
        else System.out.println ("Motocikl je prazan");
    }
    //dodajPutnika(int n) - koja dodaje n putnika u Motor. Ukoliko ne mogu da stanu svih n putnika, onda ih dodati do gornje granice
    public void dodajPutnika(int n){
        if (brojPutnika == 2){
            System.out.println ("Motocikl je pun");
        } else if ((brojPutnika + n) > 2){
            while (brojPutnika < 2){
                brojPutnika++;
            }
        } else if ((brojPutnika + n) <= 2){
            for (int i = 0; i < n; i++) {
                brojPutnika++;
            }
        }
    }
    //oduzmiPutnika(int n) - koja oduzima n putnika iz Motora. Ukoliko nema n putnika u autu, izbaciti sve putnike sa motocikla.
    public void oduzmiPutnika(int n){
        if (brojPutnika == 0){
            System.out.println ("Motocikl je prazan");
        } else if (brojPutnika < n){
            setBrojPutnika (0);
        }
        else if (brojPutnika > n) {         // 2>1
            for (int i = 0; i < n; i++) {   // 0<1, i+1 --> 1 !< 1
                brojPutnika--;              // broj putnika = 2-1=1
            }
        }
    }
    // isprazniMotor() - izbacuje sve putnike sa motora
    public void isprazniMotor(){
        setBrojPutnika (0);
    }
    //napuniMotor() - puni motor sa 2 putnika
    public void napuniMotor(){
        setBrojPutnika (2);
    }

    @Override
    public String toString() {
        return super.toString ();
    }
}
