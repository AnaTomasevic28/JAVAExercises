package Pastebin.PastebinOOP.Zadatak16;
/*
 * Napisati klasu Automobil koja nasledjuje klasu Vozilo i ima atribute:
- int brojPutnika

Auto ima 4 tocka

Napisati 2 konstruktora:
- Jedan koji prima broj putnika
- Podrazumevani koji ne prima argumente

Napisati sve gettere i settere

Napisati metode:
1. dodajPutnika() - koja dodaje jednog putnika u Auto, pazeci da auto moze najvise imati 5 putnika.
2. oduzmiPutnika() - koja oduzima jednog putnika iz Auta, pazeci da auto mzoe imati najmanje 0 putnika.
3. dodajPutnika(int n) - koja dodaje n putnika u Auto. Ukoliko ne mogu da stanu svih n putnika, onda ih dodati do gornje granice
4. oduzmiPutnika(int n) - koja oduzima n putnika iz Auta. Ukoliko nema n putnika u autu, izbaciti sve putnike iz auta.
5. isprazniAuto() - izbacuje sve putnike iz auta
6. napuniAuto() - puni auto sa 5 putnika


Overridovati sve metode iz natklase.
 */
public class Automobil extends Vozilo{
    private int brojPutnika;

    public Automobil(String registarskiBroj, String marka, String tip, int brojPutnika) {
        super (registarskiBroj, marka, tip);
        if (brojPutnika > 5){
            System.out.println ("Broj putnika ne moze biti veci od 5, nije ovo autobus");
            this.brojPutnika = 5;
        }else this.brojPutnika = brojPutnika;
    }

    public Automobil(String registarskiBroj, String marka, String tip) {
        super (registarskiBroj, marka, tip);
    }

    public int getBrojPutnika() {
        return brojPutnika;
    }

    public void setBrojPutnika(int brojPutnika) {
        if (brojPutnika > 5){
            System.out.println ("Auto moze da poveze max 5 putnika! Izadjite svi napolje");
            this.brojPutnika = 0;
        }else this.brojPutnika = brojPutnika;
    }

    @Override
    public char vratiKategoriju() {
        return 'B';
    }

    @Override
    public int brojTockova() {
        return 4;
    }

    @Override
    public int brojPutnika() {
        return brojPutnika;
    }
    //dodajPutnika() - koja dodaje jednog putnika u Auto, pazeci da auto moze najvise imati 5 putnika.
    public void dodajPutnika(){
        if (brojPutnika < 5){
            brojPutnika += 1;
        }
        else {
            System.out.println ("Nema vise mesta u autu");
        }
    }
    //oduzmiPutnika() - koja oduzima jednog putnika iz Auta, pazeci da auto moze imati najmanje 0 putnika.
    public void oduzmiPutnika(){
        if (brojPutnika >=1){
            brojPutnika -= 1;
        }
        else System.out.println ("Auto je prazan");
    }
    //dodajPutnika(int n) - koja dodaje n putnika u Auto. Ukoliko ne mogu da stanu svih n putnika, onda ih dodati do gornje granice
    public void dodajPutnika(int n){
        if (brojPutnika == 5){
            System.out.println ("Auto je pun");
        }
        else if ((brojPutnika + n) > 5){        // 4+2=6>5
            while (brojPutnika < 5){           // 4<5, 5!<5
                brojPutnika++;                  // 4+1=5,
            }
        }
        else if ((brojPutnika + n) <= 5){                // 2+2=4<5
            for (int i = 0; i < n; i++) {               // 0<2, i+1 --> 1<2, i+1 --> 2!<2
                brojPutnika++;                          // 2+1=3, 3+1=4,
            }
        }
    }
    //oduzmiPutnika(int n) - koja oduzima n putnika iz Auta. Ukoliko nema n putnika u autu, izbaciti sve putnike iz auta.
    public void oduzmiPutnika(int n){
        if (brojPutnika == 0){
            System.out.println ("Auto je prazan");
        }
        else if (brojPutnika < n){
            setBrojPutnika (0);
        } else if (brojPutnika > n) {       //5>3  5-3=2
            for (int i = 0; i < n; i++) {   // 0<3, i+1 --> 1 < 3, i+1 --> 2<3, i+1 --> 3!<3
                brojPutnika--;              // broj putnika = 5-1=4, = 4-1=3, = 3-1=2
            }
        }
    }
    //isprazniAuto() - izbacuje sve putnike iz auta
    public void isprazniAuto(){
        setBrojPutnika (0);
    }
    //napuniAuto() - puni auto sa 5 putnika
    public void napuniAuto(){
        setBrojPutnika (5);
    }

    @Override
    public String toString() {
        return super.toString ();
    }
}
