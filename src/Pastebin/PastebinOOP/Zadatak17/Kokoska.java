package Pastebin.PastebinOOP.Zadatak17;

public class Kokoska extends DomacaZivotinja{
    public Kokoska(String naziv, String ime, double kilaza, int brojNogu) {
        super (naziv, ime, kilaza, brojNogu);
    }

    @Override
    public boolean daLiSeJedem() {
        return true;
    }

    @Override
    public void leti() {
    System.out.println ("Ja ne mogu da letim.");
    }

    @Override
    public void pliva() {
        System.out.println("Ja ne plivam.");
    }

    @Override
    public void oglasiSe() {
        System.out.println("kukuriku");
    }
}