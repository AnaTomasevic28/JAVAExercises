package Pastebin.PastebinOOP.Zadatak7;

public class TestSportista {
    public static void main(String[] args) {

        Sportista kosarkas = new Sportista ("Dalibor", "kosarka", "Beopetrol", 15);

        Sportista odbojkasica = new Sportista ("Ana", "odbojka", "Toplicanin", 15);

        Sportista fudbaler = new Sportista ("Tomislav", "Fudbal", "Toplicanin", 10);

        System.out.println (kosarkas);
        System.out.println (odbojkasica);
        System.out.println (fudbaler);

        kosarkas.setKlub ("Crvena zvezda");
        System.out.println (kosarkas);

        odbojkasica.setBrojDresa (7);
        System.out.println (odbojkasica);


    }
}
