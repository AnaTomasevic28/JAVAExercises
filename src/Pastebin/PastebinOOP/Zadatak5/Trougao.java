package Pastebin.PastebinOOP.Zadatak5;
/*
* 5. Napisati klasu Trougao koja ima 3 double atributa za polja.
Napraviti metodu 'daLiJeTrougaoValidan', koji proverava da li 3 prosledjene stranice mogu da budu stranice nekog trougla.
Trougao nije validan ako je zbir bilo kojih dveju stranica strogo manji od duzine trece ili ako je neka stranica nepozitivne duzine.
Napraviti konstruktor koji prima 3 argumenta za atribute i proverava njihovu validnost. Ako nisu validni, ispisati neku odgovarajucu poruku i postaviti sve stranice na -1.
Napraviti gettere i settere za svako polje, kao i metode 'obim' i 'povrsina'
(Pogledati heronov obrazac: https://en.wikipedia.org/wiki/Heron%27s_formula)
* s = 1/2 * (a+b+c)
* A = koren (s*(s-a)*(s-b)*(s-c))
Napraviti toString() metod:
Duzina stranice A je: {stranicaA}
Duzina stranice B je: {stranicaB}
Duzina stranice C je: {stranicaC}
 */
public class Trougao {

    private double a;
    private double b;
    private double c;

    public double obim(){
        return (a+b+c);
    }
    /* s = 1/2 * (a+b+c)
    * A = koren (s*(s-a)*(s-b)*(s-c))
     */
    public double povrsina(){
        double s = (a+b+c) * 0.5;
        return (Math.sqrt (s*(s-a)*(s-b)*(s-c)));
    }
    static boolean daLiJeTrougaoValidan(double a, double b, double c){
        if (a < 0 || b < 0 || c < 0){
            return false;
        }
        else if ((a+b) <= c || (a+c) <= b || (b+c) <= a){
            return false;
        }
        else return true;
    }
    public Trougao(double a, double b, double c) {
        if (!daLiJeTrougaoValidan (a, b, c)) {
            System.out.println ("Niste uneli adekvatne duzine stranica.");
            this.a = 1;
            this.b = 1;
            this.c = 1;
        }
        else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    /*Napraviti toString() metod:
Duzina stranice A je: {stranicaA}
Duzina stranice B je: {stranicaB}
Duzina stranice C je: {stranicaC}
 */

    @Override
    public String toString() {
        String s1 = ("Duzina stranice A je: " + a + "\n");
        String s2 = ("Duzina stranice B je: " + b + "\n");
        String s3 = ("Duzina stranice C je: " + c + "\n");

        return s1+s2+s3;
    }
}
