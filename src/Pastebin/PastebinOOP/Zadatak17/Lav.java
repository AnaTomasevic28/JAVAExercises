package Pastebin.PastebinOOP.Zadatak17;

public class Lav extends DivljaZivotinja{
    public Lav(String naziv, int brojNogu, String staniste) {
        super (naziv, brojNogu, staniste);
    }

    @Override
    public boolean daLiSamOpasna() {
        return true;
    }

    @Override
    public void leti() {
        System.out.println("Ja ne letim.");
    }

    @Override
    public void pliva() {
        System.out.println("Ja ne plivam.");
    }

    @Override
    public void oglasiSe() {
        System.out.println("roar");
    }
}
