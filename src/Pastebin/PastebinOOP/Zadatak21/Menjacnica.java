package Pastebin.PastebinOOP.Zadatak21;

public class Menjacnica implements Menjanje{
    private String valuta;
    private String ime;

    public Menjacnica(String valuta, String ime) {
        this.valuta = valuta;
        this.ime = ime;
    }

    private Menjacnica(){
        valuta = ime = "";
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public double promeniNovac(double val, String fromCurr, String toCurr) {
        return 0; //analogno
    }

    @Override
    public void ispisiDevize() {
        System.out.println(valuta);
    }

}
