package nedelja4.Ponedeljak.Domaci;

import java.util.ArrayList;

public class Arsenal extends SportskiKlub{
    public Arsenal(ArrayList<Sportista> clanoviKluba, String nazivGrada, double budzet) {
        super (clanoviKluba, nazivGrada, budzet);
        setNazivGrada ("London");
    }
    @Override
    public String toString() {
        return "Arsenal " + super.toString ();
    }
}
