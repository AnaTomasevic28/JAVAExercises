package Pastebin.PastebinOOP.Zadatak17;

public class Svinja extends  DomacaZivotinja{
    public Svinja(String naziv, String ime, double kilaza, int brojNogu) {
        super (naziv, ime, kilaza, brojNogu);
    }

    public Svinja() {
    }

    @Override
    public boolean daLiSeJedem() {
        return true;
    }

    @Override
    public void leti() {
        System.out.println ("Ja ne letim");
    }

    @Override
    public void pliva() {
        System.out.println ("Ja ne plivam");
    }

    @Override
    public void oglasiSe() {
        System.out.println ("grok oink");
    }
}
