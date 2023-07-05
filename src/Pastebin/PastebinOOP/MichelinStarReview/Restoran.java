package Pastebin.PastebinOOP.MichelinStarReview;

import java.util.ArrayList;

public class Restoran extends UgostiteljskiObjekat{
    private int brSlobodnihStolova;

    public Restoran(String naziv, double prosecnaOcena, int brMichelinZvezda, ArrayList<String> recenzije, int brSlobodnihStolova) {
        super (naziv, prosecnaOcena, brMichelinZvezda, recenzije);
        postaviBrslobodnihStolova (brSlobodnihStolova);
    }

    public Restoran(String naziv, double prosecnaOcena, int brMichelinZvezda, int brSlobodnihStolova) {
        super (naziv, prosecnaOcena, brMichelinZvezda);
        super.setRecenzije (new ArrayList<String> ());
        postaviBrslobodnihStolova (brSlobodnihStolova);
    }

    public Restoran(String naziv, double prosecnaOcena, int brSlobodnihStolova) {
        super (naziv, prosecnaOcena);
        super.setBrMichelinZvezda (0);
        super.setRecenzije (new ArrayList<String> ());
        postaviBrslobodnihStolova (brSlobodnihStolova);
    }

    public Restoran(String naziv, int brSlobodnihStolova) {
        super (naziv);
        setProsecnaOcena (3);
        setBrMichelinZvezda (0);
        setRecenzije (new ArrayList<String> ());
        postaviBrslobodnihStolova (brSlobodnihStolova);
    }

    public Restoran(String naziv) {
        super (naziv);
        setProsecnaOcena (3);
        setBrMichelinZvezda (0);
        setRecenzije (new ArrayList<String> ());
        this.brSlobodnihStolova = 25;
    }

    public int getBrSlobodnihStolova() {
        return brSlobodnihStolova;
    }

    public void setBrSlobodnihStolova(int brSlobodnihStolova) {
        postaviBrslobodnihStolova (brSlobodnihStolova);
    }
    private void postaviBrslobodnihStolova(int x){
        if (x >= 0 && x <=25){
            this.brSlobodnihStolova = x;
        }
        else {
            System.out.println ("Broj slobodnih stolovane moze biti negativan broj niti broj veci od 25");
        }
    }
    public boolean imaLiSlobodnihStolova(){
        if (getBrSlobodnihStolova () == 0){
            return false;
        }
        else return true;
    }

    public void oslobodiSto(){
        setBrSlobodnihStolova (getBrSlobodnihStolova () + 1);
    }

    public void oslobodiSto(int x){
        setBrSlobodnihStolova (getBrSlobodnihStolova () + x);
    }

    public void zaokupiSto(){
        if (getBrSlobodnihStolova () > 0) {
            setBrSlobodnihStolova (getBrSlobodnihStolova () - 1);
        }else System.out.println ("Nema slobodnih stolova");
    }

    public void zaokupiSto(int x){
        if (getBrSlobodnihStolova () >= x){
            setBrSlobodnihStolova (getBrSlobodnihStolova () - x);
        }else setBrSlobodnihStolova (0);
    }
    @Override
    public void dodajOcenu(double ocena) {
       if (ocena< 1 || ocena > 5) {
            setProsecnaOcena (getProsecnaOcena ());
        } else {
           if (ocena >= getProsecnaOcena ()) {
               ocena -= 0.3;
               setProsecnaOcena ((getProsecnaOcena () + ocena) / 2);
           } else if (ocena < getProsecnaOcena ()) {
               setProsecnaOcena ((getProsecnaOcena () + ocena) / 2);
           }
       }
       if ((ocena >= 1 && ocena <= 2) || (ocena >=4.5 && ocena <=5)) {
            azurirajZvezdu ();
       }
    }
    @Override
    public void azurirajZvezdu() {
        if (getProsecnaOcena () > 4.5){
            setBrMichelinZvezda (getBrMichelinZvezda () + 2);
        }else if (getProsecnaOcena () > 3.5 && getProsecnaOcena () <= 4.5){
            setBrMichelinZvezda (getBrMichelinZvezda () + 1);
        } else if (getBrMichelinZvezda () > 3.0 && getBrMichelinZvezda () <= 3.5) {
            setBrMichelinZvezda (getBrMichelinZvezda () - 1);
        } else if (getProsecnaOcena () <= 3.0) {
            setBrMichelinZvezda (getBrMichelinZvezda () - 2);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append ("----------------\n");
        sb.append ("Restoran\n");
        sb.append ("-----").append (getNaziv ()).append ("-----\n");
        sb.append ("*****").append (getBrMichelinZvezda ()).append ("*****\n");
        sb.append ("\n");
        sb.append ("Prosecna ocena: ").append (getProsecnaOcena ()).append ("\n");
        sb.append ("Recenzije: ").append ("\n");
        for (int i = 0; i < getRecenzije ().size (); i++) {
            sb.append(i+1).append (")").append(getRecenzije ().get (i)).append ("\n");
        }
        return sb.toString ();
    }
}
