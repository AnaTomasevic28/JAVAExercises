package nedelja4.Utorak.Domaci;

import java.util.ArrayList;

public class Motor extends MotornoVozilo{
    public Motor(ArrayList<Tocak> listaTockova, double cenaVozila, int godinaProizvodnjeVozila) {
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
    // S obzirom da postoji mogucnost izbacivanja ostecene gume i da se time menja duzina prosledjene liste,
    // i da se njena duzina ne moze koristiti za odredjiavnje potrebnog broja guma,
    // uzela sam da je broj potrebnih tockova hardkodovan za svako vozilo
    @Override
    public void ubaciRezervnu() {
        while (getListaTockova ().size () < 3){
            getListaTockova ().add(new Tocak());
        }
    }

    @Override
    public String toString() {
        return ("Motor ") + super.toString ();
    }
}
