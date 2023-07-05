package nedelja3.PetakOOP.Domaci;

public class Fizikalac extends Radnik{

    public boolean odmor() {
        if (this.getOdradjeniSatiUNedelji () >= 40) {
            return true;
        }
        else return false;
    }
    public Fizikalac(String ime, double odradjeniSatiUNedelji, double satnica) {
        super (ime, odradjeniSatiUNedelji, satnica);
    }

    public Fizikalac(Radnik r) {
        super (r.getIme (), r.getOdradjeniSatiUNedelji (), r.getSatnica ());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append ("Fizikalac ").append (super.toString ());
        sb.append ("Zaradio je u prethodnoj nedelji ").append (this.nedeljnaZarada ()).append (" dinara i ");
        if (odmor () == true)
            sb.append ("radnik je na odmoru.");
        else sb.append ("radnik nije na odmoru.");

        return sb.toString ();
    }
}
