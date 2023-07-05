package nedelja4.Utorak.Domaci;

import java.util.ArrayList;

public class Automobil extends MotornoVozilo{
    public Automobil(ArrayList<Tocak> listaTockova, double cenaVozila, int godinaProizvodnjeVozila) {
        super (listaTockova, cenaVozila, godinaProizvodnjeVozila);
    }

//    @Override
//    public boolean daLiJeOstecen(Tocak tocak) {
//        if (tocak.getTrajanjeGume () > 365) {
//            tocak.setOstecenjeTocka (true);
//            return true;
//        }
//        else tocak.setOstecenjeTocka (false);
//        return  false;
//    }

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
        while (getListaTockova ().size () <= 6){
            getListaTockova ().add(new Tocak());
        }
    }

    @Override
    public String toString() {
        return ("Automobil ") + super.toString ();
    }
}
