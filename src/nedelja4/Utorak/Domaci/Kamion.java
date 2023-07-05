package nedelja4.Utorak.Domaci;

import java.util.ArrayList;

public class Kamion extends MotornoVozilo{
    public Kamion(ArrayList<Tocak> listaTockova, double cenaVozila, int godinaProizvodnjeVozila) {
        super (listaTockova, cenaVozila, godinaProizvodnjeVozila);
    }

    public void daLiJeOstecen(){
        for (int i = 0; i < getListaTockova ().size (); i++) {
            if (getListaTockova ().get (i).getTrajanjeGume () > 365){
                getListaTockova ().get (i).setOstecenjeTocka (true);
            }
            else getListaTockova ().get (i).setOstecenjeTocka (false);
        }
    }

    @Override
    public void removeOstecenu() {
        for (int i = 0; i < getListaTockova ().size (); i++) {
            if (getListaTockova ().get (i).isOstecenjeTocka ()) {
                getListaTockova ().remove (i);
                i--;
            }
        }
    }

    @Override
    public void ubaciRezervnu() {
        while (getListaTockova ().size () < 15){
            getListaTockova ().add(new Tocak());
        }
    }

    @Override
    public String toString() {
        return ("Kamion ") + super.toString ();
    }
}
