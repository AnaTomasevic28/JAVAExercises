package Pastebin.PastebinOOP.Zadatak4;

public class TestAutomobil {
    public static void main(String[] args) {
        Automobil a = new Automobil ("Toyota", "Japan", "2014", 113000);

        System.out.println (a.getGodinaProizvodnje ());
        System.out.println (a);
    }
}
