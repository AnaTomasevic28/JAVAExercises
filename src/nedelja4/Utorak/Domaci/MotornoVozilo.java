package nedelja4.Utorak.Domaci;

import java.util.ArrayList;
//Ne nasledjuje Klasu Tocak ali je KORISTI

public abstract class MotornoVozilo {

    private ArrayList<Tocak> listaTockova;
    private double cenaVozila;
    private int godinaProizvodnjeVozila;

    public MotornoVozilo(ArrayList<Tocak> listaTockova, double cenaVozila, int godinaProizvodnjeVozila) {
        this.listaTockova = listaTockova;
        this.cenaVozila = cenaVozila;
        this.godinaProizvodnjeVozila = godinaProizvodnjeVozila;
    }

    public ArrayList<Tocak> getListaTockova() {
        return listaTockova;
    }

    public void setListaTockova(ArrayList<Tocak> listaTockova) {
        this.listaTockova = listaTockova;
    }

    public double getCenaVozila() {
        return cenaVozila;
    }

    public void setCenaVozila(double cenaVozila) {
        this.cenaVozila = cenaVozila;
    }

    public int getGodinaProizvodnjeVozila() {
        return godinaProizvodnjeVozila;
    }

    public void setGodinaProizvodnjeVozila(int godinaProizvodnjeVozila) {
        this.godinaProizvodnjeVozila = godinaProizvodnjeVozila;
    }

    public abstract void daLiJeOstecen();
    public abstract void removeOstecenu();

    // S obzirom da je implementacija metode "removeOstecenu()" identicna za sve tri podklase moze se implementirati i na nivou natklase

    public abstract void ubaciRezervnu();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append (" motorno vozilo ima tockove: ").append ("\n");
        for (int i = 0; i < listaTockova.size (); i++) {
            sb.append (listaTockova.get (i)).append ("\n");
        }
        sb.append ("njegova godina proizvodnje je ").append (godinaProizvodnjeVozila).append (" i kosta ");
        sb.append (cenaVozila).append (" eura.");
        return sb.toString ();
    }
}
