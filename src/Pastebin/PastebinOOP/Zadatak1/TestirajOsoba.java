package Pastebin.PastebinOOP.Zadatak1;

public class TestirajOsoba {
    public static void main(String[] args) {

        Osoba osoba1 = new Osoba ();

        osoba1.setIme ("Ana");
        osoba1.setPrezime ("Tomasevic");
        osoba1.setGodinaRodjenja (1987);
        osoba1.setVisina (173.5);

        System.out.println (osoba1.getGodinaRodjenja ());
        System.out.println (osoba1);

        System.out.println ();

        Osoba osoba2 = new Osoba ("Dalibor", "Tomasevic" , 1987, 191);
        System.out.println (osoba2.godinaRodjenja);
        System.out.println (osoba2);

        Osoba o = new Osoba ("Petar", "Milikic");



    }
}
