package nedelja3.CetvrtakOOP.Domaci;

import java.util.ArrayList;

/*
 * b) Napraviti klasu Fakultet koja ima nazivFakulteta i listu departmana. Unutar ove klase definisati
metode za:
  1) ukupan broj ucenika - vraca ukupan broj ucenika sa svih departmana.
  2) dodavanje predmeta - za departman biologije i matematike dodati 5 strucnih  .
     predmeta.
Definisati odgovarajucu klasu gde ce se testirati ove funkcionalnosti, kao i da definisete
konstruktor, get-ere i set-ere i toString za klase a) i b).
 */
public class Fakultet {
    String nazivFakulteta;
    ArrayList<Departman> departmani;

    private int ukupanBrojStudenata(){
        int sum = 0;
        for (int i = 0; i < departmani.size (); i++) {
            sum += departmani.get (i).getBrojStudenataDepartmana ();
        }
        return sum;
    }

    public void dodajPredmete(){
        for (int i = 0; i < departmani.size (); i++) {
            if (departmani.get(i).getNazivDepartmana ().equalsIgnoreCase ("matematika") ||
                departmani.get(i).getNazivDepartmana ().equalsIgnoreCase ("biologija")){
                departmani.get(i).setBrojStrucnihPredmeta(departmani.get(i).getBrojStrucnihPredmeta () + 5 );
            }
        }
    }

    public Fakultet(String nazivFakulteta, ArrayList<Departman> departmani) {
        this.nazivFakulteta = nazivFakulteta;
        this.departmani = departmani;
    }

    public String getNazivFakulteta() {
        return nazivFakulteta;
    }

    public void setNazivFakulteta(String nazivFakulteta) {
        this.nazivFakulteta = nazivFakulteta;
    }

    public ArrayList<Departman> getDepartmani() {
        return departmani;
    }

    public void setDepartmani(ArrayList<Departman> departmani) {
        this.departmani = departmani;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
         sb.append ("Na fakultetu ").append (nazivFakulteta).append (" posotoji ").append (departmani.size ());
         sb.append (" departmana.").append (" i ukupno ").append (ukupanBrojStudenata ()).append (" studenata.");

         return sb.toString ();

    }
}
