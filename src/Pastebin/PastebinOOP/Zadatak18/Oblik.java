package Pastebin.PastebinOOP.Zadatak18;
/*
 * Napisati abstraktnu klasu Oblik koja nema atribute

Napisati jedan prazan konstruktor

Napisati abstraktne metode:
1. double obim() - koja racuna obim oblika
2. double povrsina() - koja racuna povrsinu oblika
3. double zapremina - koja racuna zapreminu oblika
4. String getIme() - koja vraca ime oblika
 */
public abstract class Oblik {
    public Oblik() {
    }
    abstract double obim();
    abstract double povrsina();
    abstract double zapremina();
    abstract  String getIme();
    /*
    Napisati metode:
1. String getOsobine() koja vraca nisku oblika:
"Obim: <obim>
 Povrsina: <povrsina>
 Zapremina: <zapremina>"
     */
    public String getOsobine(){
        StringBuilder sb = new StringBuilder ();
        sb.append ("Obim: ").append (obim ()).append ("\n");
        sb.append ("Povrsina: ").append (povrsina ()).append ("\n");
        sb.append ("Zapremina: ").append (zapremina ());
        return sb.toString ();
    }
    /*
    Overridovati toString() metod na sledeci nacin:
"<ime>
 getOsobine()"
     */

    @Override
    public String toString() {
        return getIme () + "\n" + getOsobine ();
    }
}
