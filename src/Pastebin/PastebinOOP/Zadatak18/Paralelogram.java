package Pastebin.PastebinOOP.Zadatak18;
/*
 * Napisati abstraktnu klasu Paralelogram koja nasledjuje klasu Figura i ima atribute:
- double a
- double b

Napisati konstruktor koji prima sve argumente pazeci da stranice moraju biti pozitivni brojevi

Napisati sve gettere i settere

Overridovati metod:
1. obim()
 */
public abstract class Paralelogram extends Figura {
    private double a;
    private double b;

    public Paralelogram(double a, double b) {
        if (a <=0 || b <= 0){
            System.out.println ("Duzina stranice mora biti pozitivan broj veci od 0");
            this.a = 1;
            this.b = 1;
        }else {
            this.a = a;
            this.b = b;
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

    @Override
    double obim() {
        return 2*a + 2*b;
    }
}
