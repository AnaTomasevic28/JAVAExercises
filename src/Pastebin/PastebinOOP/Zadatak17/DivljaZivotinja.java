package Pastebin.PastebinOOP.Zadatak17;

public abstract class DivljaZivotinja extends Zivotinja{
    private int brojNogu;
    private String staniste;

    public DivljaZivotinja(String naziv, int brojNogu, String staniste) {
        super (naziv);
        this.brojNogu = brojNogu;
        this.staniste = staniste;
    }

    public DivljaZivotinja() {
        this.staniste = "";
    }

    public int getBrojNogu() {
        return brojNogu;
    }

    public void setBrojNogu(int brojNogu) {
        this.brojNogu = brojNogu;
    }

    public String getStaniste() {
        return staniste;
    }

    public void setStaniste(String staniste) {
        this.staniste = staniste;
    }
    public abstract boolean daLiSamOpasna();

    @Override
    public int brojNogu() {
        return brojNogu;
    }

    @Override
    public boolean daLiJeDomaca() {
        return false;
    }
}
