package nedelja3.UtorakOOP.Domaci.AutoSkola;

public class TestAutoskola {
    public static void main(String[] args) {

        AutoSkola prva = new AutoSkola ("Smer", 114, 75000, "automobil");

        AutoSkola druga = new AutoSkola ("Pravac", 35, 40000, "Motor");

        AutoSkola treca = new AutoSkola ("Kruzni tok", 79, 56000, "autobus");

        prva.odobrenje ();
        prva.popustMotor ();
        System.out.println (prva);
        System.out.println ("Broj postojecih grupa je " + prva.brojGrupa ());
        System.out.println ();

        druga.odobrenje ();
        druga.popustMotor ();
        System.out.println (druga);
        System.out.println ("Broj postojecih grupa je " + druga.brojGrupa ());
        System.out.println ();

        treca.odobrenje ();
        treca.popustMotor ();
        System.out.println (treca);
        System.out.println ("Broj postojecih grupa je " + treca.brojGrupa ());
        System.out.println ();
    }
}
