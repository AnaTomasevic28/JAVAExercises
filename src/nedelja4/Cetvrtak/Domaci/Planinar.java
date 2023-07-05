package nedelja4.Cetvrtak.Domaci;

import java.util.ArrayList;
import java.util.List;

public class Planinar implements Planinarenje{
    private List<Planina> listaPLanina;
    private double maxUspon;
    private double tezinaOpreme;

    public Planinar(List<Planina> listaPLanina, int maxUspon, double tezinaOpreme) {
        ArrayList<Planina> lista = new ArrayList<> ();
        for (int i = 0; i < listaPLanina.size (); i++) {
            if (listaPLanina.get (i).getVisina () <= maxUspon){
                lista.add (listaPLanina.get (i));
            }
        }
        this.listaPLanina = lista;
        this.maxUspon = maxUspon;
        this.tezinaOpreme = tezinaOpreme;
    }

    public Planinar() {
        this.listaPLanina = new ArrayList<> ();
    }

    //Za prosledjenu planinu proveriti da li je njena visina manja od
    // maksimalnog uspona Planinara, ako jeste, dodati je u listu Planina.
    @Override
    public void popniSe(Planina P) {
        if (P.getVisina () <= maxUspon){
            listaPLanina.add (P);
        }
        else
            System.out.println ("Planina " + P.getNaziv () + " je previsoka za ovog planinara");
    }
//- Vraca koliko kosta clanarina, znamo da je fiksno 1000 dinara, plus
//dobijamo 2% popusta za svaku planinu na koju se Planinar popeo.
    @Override
    public double clanarina() {
        double popust = 1000 * 0.02;
       return 1000 - (listaPLanina.size () * popust);
    }

    //Vraca koliko se sve ukupno Planinar popeo kada se saberu sve visine
    //planina na koje se on popeo.
    @Override
    public double sviUsponi() {
       double sum = 0;
        for (int i = 0; i < listaPLanina.size (); i++) {
            sum += listaPLanina.get (i).getVisina ();
        }
        return sum;
    }
//Vraca najvecu planinu iz liste.
    @Override
    public Planina najvecaPlanina() {
        Planina najvecaPLanina = listaPLanina.get (0);
        for (int i = 1; i < listaPLanina.size (); i++) {
            if (listaPLanina.get (i).getVisina () > najvecaPLanina.getVisina ()){
                najvecaPLanina = listaPLanina.get (i);
            }
        }
        return  najvecaPLanina;
    }

    public List<Planina> getListaPLanina() {
        return listaPLanina;
    }

    public void setListaPLanina(List<Planina> listaPLanina) {
        this.listaPLanina = listaPLanina;
    }

    public double getMaxUspon() {
        return maxUspon;
    }

    public void setMaxUspon(int maxUspon) {
        this.maxUspon = maxUspon;
    }

    public double getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(double tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append ("Planinar ima opremu tesku ").append (tezinaOpreme).append (" kg, i popeo se na sledece planine: ").append ("\n");
        for (int i = 0; i < listaPLanina.size (); i++) {
            sb.append (listaPLanina.get (i).toString ()).append ("\n");
        }
        sb.append ("Najveca visina koju je osvojio je: ").append (maxUspon).append (" metara nadmorske visine.");

        return sb.toString ();
    }
}
