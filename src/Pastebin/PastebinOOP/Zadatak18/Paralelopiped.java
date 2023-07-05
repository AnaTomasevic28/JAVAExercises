package Pastebin.PastebinOOP.Zadatak18;
/*
 *
Napisati abstraktnu klasu Paralelopiped koja prosiruje klasu Telo i ima atribute:
- double a
- double b
- double c

Napisati konstruktor koji prima sve argumente pazeci da duzine stranica ne mogu biti nepozitivni brojevi

Napisati sve gettere i settere

Overridovati metod:
1. obim()
 */
public abstract class Paralelopiped extends Telo{
    private double a;
    private double b;
    private double c;

    public Paralelopiped(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0){
            this.a = 1;
            this.b = 1;
            this.c = 1;
        }else {
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

    @Override
    double obim() {
        return 4*a + 4*b + 4*c;
    }
}
