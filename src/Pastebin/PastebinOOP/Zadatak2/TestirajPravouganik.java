package Pastebin.PastebinOOP.Zadatak2;

public class TestirajPravouganik {
    public static void main(String[] args) {

        Pravougaonik prvi = new Pravougaonik (10, 15);

        System.out.println (prvi.getSirina ());

        System.out.println (prvi);
        System.out.println ();

        prvi.setSirina (5);
        prvi.setVisina (10);
        System.out.println (prvi);

        System.out.println (prvi.getSirina ());

    }
}
