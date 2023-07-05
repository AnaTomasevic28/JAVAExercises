package nedelja3.CetvrtakOOP;
/*      Napraviti klasu Automobil koja kao atribute ima marku, boju, godina proizvodnje i cenu.
    1.Napraviti metodu koja ce automobilu starijem od 20 godina smanjiti cenu za 20%.
    2.Kreirati metodu koja ce svakom automobilu marke BMW promeniti boju u belu.
    3.Prikazati rezultujuce objekte pomocu toString().
 */
public class Vezba {

    private String marka;
    private String boja;
    private  int godinaProizvodnje;
    private double cena;

    public Vezba(String marka, String boja, int godinaProizvodnje, double cena) {
        this.marka = marka;
        this.boja = boja;
        this.godinaProizvodnje = godinaProizvodnje;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBoja() {
        return boja;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public double getCena() {
        return cena;
    }

    public void popust(){
        if ((2023 - godinaProizvodnje) >= 20) {
            this.cena *= 0.8;
        }
    }

    public void promenaBoje (){
        if (marka.equalsIgnoreCase ("bmw")){
            this.boja = "bela";
        }
    }

    @Override
    public String toString() {
        return "Cena automobila marke " + marka + boja + " boje, cija je godina proizvodnje "
                + godinaProizvodnje + " iznosi " + cena;
    }
}
