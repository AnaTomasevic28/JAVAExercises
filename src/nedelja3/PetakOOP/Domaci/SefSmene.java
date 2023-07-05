package nedelja3.PetakOOP.Domaci;

public class SefSmene extends Radnik{

    private double nedeljniBonus;

    public double nedeljnaZarada(){
        return super.nedeljnaZarada () + nedeljniBonus;
    }

    @Override
    public boolean odmor() {
        if (this.getOdradjeniSatiUNedelji () >= 50) {
            return true;
        }
        else return false;
    }

    public SefSmene(String ime, double odradjeniSatiUNedelji, double satnica, double nedeljniBonus) {
        super (ime, odradjeniSatiUNedelji, satnica);
        this.nedeljniBonus = nedeljniBonus;
    }

    public SefSmene(Radnik r, double nedeljniBonus) {
        super (r.getIme (), r.getOdradjeniSatiUNedelji (), r.getSatnica ());
        this.nedeljniBonus = nedeljniBonus;
    }

    public double getNedeljniBonus() {
        return nedeljniBonus;
    }

    public void setNedeljniBonus(double nedeljniBonus) {
        this.nedeljniBonus = nedeljniBonus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append ("Sef smene ").append (super.toString ());
        sb.append ("Zaradio je u prethodnoj nedelji ").append (this.nedeljnaZarada ()).append (" dinara i ");
        if (odmor () == true)
            sb.append ("radnik je na odmoru.");
        else sb.append ("radnik nije na odmoru.");

        return sb.toString ();
    }
}
