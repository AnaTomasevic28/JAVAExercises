package Pastebin.PastebinOOP.Zadatak21;
/*
 * Napisati interfejs Menjanje koja definise metode:
/**
* Prima neku kolicinu novca iz neke valute i vraca kolicinu novca konvertovane u novu valutu
* @param val - kolicina novca valute @fromCurr koju zelite da promenite
* @param fromCurr  - valuta iz koje menjate novac
* @param toCurr - valuta u koju menajte novac
1. double promeniNovac(double val, String fromCurr, String toCurr);
 * Ispisuje sve moguce devize koje prihvata
2. void ispisiDevize();
 */
public interface Menjanje {
    double promeniNovac(double val, String fromCurr, String toCurr);
    void ispisiDevize();
}
