package nedelja3.PetakOOP.Domaci;

public class TestRadnik {
    public static void main(String[] args) {

        Radnik radnik1 = new Radnik ("Petar", 25, 100);
        Radnik radnik2 = new Radnik ("Milica", 40, 200);
        Radnik radnik3 = new Radnik ("Miljan", 30, 150);

        System.out.println (radnik1);

        Fizikalac f = new Fizikalac (radnik1);
        System.out.println (f);

        SefSmene sef1 = new SefSmene (radnik2, 500);
        System.out.println (sef1);

        Masinovodja m = new Masinovodja (radnik3);
        System.out.println (m);

        System.out.println ("Ukupna zarada svih radnika je: " + (f.nedeljnaZarada () + sef1.nedeljnaZarada () + m.nedeljnaZarada ()));

    }
}
