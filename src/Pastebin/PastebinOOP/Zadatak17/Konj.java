package Pastebin.PastebinOOP.Zadatak17;

public class Konj extends DomacaZivotinja{
    public Konj(String naziv, String ime, double kilaza, int brojNogu) {
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
        System.out.println("pfff");
    }
}
