package nedelja4.Ponedeljak.Domaci;

import java.util.ArrayList;

public class Spartak extends SportskiKlub{
    public Spartak(ArrayList<Sportista> clanoviKluba, String nazivGrada, double budzet) {
        super (clanoviKluba, nazivGrada, budzet);
        setNazivGrada ("Subotica");
    }
    @Override
    public String toString() {
        return "Spartak " + super.toString ();
    }
}
