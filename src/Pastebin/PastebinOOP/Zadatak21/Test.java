package Pastebin.PastebinOOP.Zadatak21;

/*

Napisati interfejs Menjanje koja definise metode:
1. double promeniNovac(double val, String fromCurr,
 String toCurr);

        2. void ispisiDevize();

        ---------------------------------------------------------------------------------------------------------------------------------------

        Napisati enumerisani tip TipBanke koji ima polja:
        PrivatnaBanka(0),
        JavnaBanka(1);

        ---------------------------------------------------------------------------------------------------------------------------------------

        Napisati abstraktnu klasu AbstraktnaBanka koja
        implementuje interfejs Menjanje koja ima polja:
        - TipBanke tipBanke
        - String naziv
        - ArrayList<String> valuteKojePrima

        Napisati sve odgovarajuce konstruktore i gettere i settere.

        Napisati abstraktne metode:
        1. String pozdrav() - koja vraca slogan banke

        Napisati metode:
        1. dodajValutu(String curr) - dodaje valutu curr u listu valuta
        2. izbrisiValutu(String curr) - brise valutu curr iz liste valuta
        3. promeniValutu(int i, String newCurr) - koja menja valutu na indexu i u listi valutu na novu valutu newCurr
        4. izbrisiValutu(int i) - brise valutu na indexu i iz liste valuta

        Implementovati metodu:
        1. ispisiDevize() - koja ispisuje celu listu valutaKojePrima


        ---------------------------------------------------------------------------------------------------------------------------------------

        Napisati kalsu Banka koja prosiruje klasu AbstraktnaBanaka i ima atribute:
        - String slogan

        Napisati sve konstruktore.

        Napisati sve gettere i settere

        Implementovati metode:
        1. String pozdrav() - vraca nisku "<ime> <slogan>"
        2. double promeniNovac(double val, String fromCurr, String toCurr) - na neki nacin po vasem izboru, s time da privatne banke uzimaju duplo vise provizije

        ---------------------------------------------------------------------------------------------------------------------------------------

        Napisati klasu Menjacnica koja implementuje interfejs Menjanje i ima atribute:
        - String valuta; menjacnice samo mogu jednu valutu da primaju
        - String ime

        Napisati sve konstruktore.

        Napisati sve gettere i settere

        Implementovati metode:
        1. String ispisiDevize() - vraca valutu koju prima
        2. double promeniNovac(double val, String fromCurr, String toCurr) - na neki nacin po vasem izboru


* */


public class Test {
}
