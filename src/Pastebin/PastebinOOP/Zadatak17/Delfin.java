package Pastebin.PastebinOOP.Zadatak17;

public class Delfin extends DivljaZivotinja{

    public Delfin(String naziv, int brojNogu, String staniste) {
        super (naziv, brojNogu, staniste);
    }
    @Override
    public boolean daLiSamOpasna() {
        return false;
    }

    @Override
    public void leti() {
        System.out.println("Ja ne letim.");
    }

    @Override
    public void pliva() {
        System.out.println("Ja plivam.");
    }

    @Override
    public void oglasiSe() {
        System.out.println("<3");
    }

}
