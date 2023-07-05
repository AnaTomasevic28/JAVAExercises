package nedelja1.utorak;

import java.util.Scanner;

public class Domaci22 {
    /*
    Domaci zadatak 2:
Napraviti program preko kog cete uneti naziv nekog cveta u konzoli(mogu biti Zumbul, Orhideja,
Bonzai I Ruze), I program ce vama ispisati naziv I cenu tog cveta.
Znamo da nam Ruza kosta 50 din.
Imamo Zumbul koji kosta 20 dinara vise nego Ruze.
Orhideje kostaju 2.5 puta vise nego Zumbul.
Bonzai kosta 3 puta vise nego Orhideja.
Obratiti paznju ukoliko se ne unese ispravan naziv cveta ili nepostojeci cvet.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nazivCveta;

        double cenaRuze = 50;
        double cenaZumbula = cenaRuze + 20;
        double cenaOrhideje = cenaZumbula * 2.5;
        double cenaBonzaia = cenaOrhideje * 3;

        System.out.println("Unesite naziv cveta: ");
        nazivCveta = sc.nextLine().toLowerCase();

        if (nazivCveta.equals("ruza") ){
            System.out.println("Imamo na stanju cvet " + nazivCveta + " i cena je " + cenaRuze + " dinara.");
        }
        else if (nazivCveta.equals("zumbul")){
            System.out.println("Imamo na stanju cvet " + nazivCveta + " i cena je " + cenaZumbula + " dinara.");
        }
        else if (nazivCveta.equals("orhideja")) {
            System.out.println("Imamo na stanju cvet " + nazivCveta + " i cena je " + cenaOrhideje + " dinara.");
        }
        else if (nazivCveta.equals("bonzai")){
            System.out.println("Imamo na stanju cvet " + nazivCveta + " i cena je " + cenaBonzaia + " dinara.");
        }
        else{
            System.out.println("Proverite jeste li ispravno uneli naziv cveta. Ukoliko jeste, predmetni cvet nemamo na stanju.");
        }
    }
}
