package nedelja4.Ponedeljak.Domaci;

import java.util.ArrayList;

public class Manchester extends SportskiKlub{

    public Manchester(ArrayList<Sportista> clanoviKluba, String nazivGrada, double budzet) {
        super (clanoviKluba, nazivGrada, budzet);
        super.setNazivGrada ("Manchester");
    }

    @Override
    public String toString() {
        return "Mancester " + super.toString ();
    }
}
