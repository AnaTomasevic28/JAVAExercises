package Pastebin.PastebinOOP.MichelinStarReview;

public class Inspektor {
    private UgostiteljskiObjekat objekat;

    public Inspektor(UgostiteljskiObjekat objekat) {
        this.objekat = objekat;
    }

    public UgostiteljskiObjekat getObjekat() {
        return objekat;
    }

    public void setObjekat(UgostiteljskiObjekat objekat) {
        this.objekat = objekat;
    }

    public void dodajOpis(String opis) {
        getObjekat ().dodajRecenziju (opis);
    }

    public void dodajOcenu(double ocena) {
        getObjekat ().dodajOcenu (ocena);
    }

    public void dodeliZvezdu(){
        getObjekat ().azurirajZvezdu ();
    }
    public String procitajRecenzije(){
        StringBuilder sb = new StringBuilder ();
        for (int i = 0; i < getObjekat ().getRecenzije ().size (); i++) {
            sb.append (i+1).append (") ").append (objekat.getRecenzije ().get (i)).append ("\n");
        }
        return sb.toString ();
    }

    public String procitajRecenzije(int i){
            if (i >= 0 && i <= objekat.getRecenzije ().size ()){
                return objekat.getRecenzije ().get (i);
            }
            else return ("Nema recenzije pod tim rednim brojem na listi");
    }

    public void zatvoriObjekat(){
        objekat.setProsecnaOcena (1);
        objekat.setBrMichelinZvezda (0);
    }

    public static int uporediUgostiteljskeObjekte(UgostiteljskiObjekat o1, UgostiteljskiObjekat o2){
        int x = 1;
        if (o1.getBrMichelinZvezda () > o2.getBrMichelinZvezda ()){
            x = -1;
        } else if (o1.getBrMichelinZvezda () == o2.getBrMichelinZvezda ()){
            if (o1.getProsecnaOcena () > o2.getProsecnaOcena ()){
                x = -1;
            } else if (o1.getProsecnaOcena () == o2.getProsecnaOcena ()) {
                x = 0;
            }
        }
        return  x;
    }
}
