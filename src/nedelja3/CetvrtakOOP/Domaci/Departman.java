package nedelja3.CetvrtakOOP.Domaci;
/*
 * Domaci Zadatak 1:
a) Napraviti klasu Departman koja ima atribute za nazivFakulteta departmana(Informatika,
matematika, biologija,..), broj studenta na tom departmanu i broj strucnih predmeta na tom
departmanu(Ispisati poruku ukoliko korisnik unese negativne brojeve).
b) Napraviti klasu Fakultet koja ima nazivFakulteta i listu departmana. Unutar ove klase definisati
metode za:
  1) ukupan broj ucenika - vraca ukupan broj ucenika sa svih departmana.
  2) dodavanje predmeta - za departman biologije i matematike dodati 5 strucnih  .
     predmeta.
Definisati odgovarajucu klasu gde ce se testirati ove funkcionalnosti, kao i da definisete
konstruktor, get-ere i set-ere i toString za klase a) i b).
 */
public class Departman {
    String nazivDepartmana;
    int brojStudenataDepartmana;
    int brojStrucnihPredmeta;

    private void postaviBrojStudenata(int brojStudenataDepartmana){
        if (brojStudenataDepartmana < 0){
            System.out.println ("Broj studenata ne moze biti negativan broj.");
            this.brojStudenataDepartmana = 0;
        }
        else this.brojStudenataDepartmana = brojStudenataDepartmana;
    }

    private void postaviBrojStrucnihPredmeta(int brojStrucnihPredmeta){
        if (brojStrucnihPredmeta < 0){
            System.out.println ("Broj strucnih predmeta ne moze biti negativan broj.");
            brojStrucnihPredmeta = 0;
        }
        else this.brojStrucnihPredmeta = brojStrucnihPredmeta;
    }

    public Departman(String nazivDepartmana, int brojStudenataDepartmana, int brojStrucnihPredmeta) {
        this.nazivDepartmana = nazivDepartmana;
        postaviBrojStudenata (brojStudenataDepartmana);
        postaviBrojStrucnihPredmeta (brojStrucnihPredmeta);
    }

    public String getNazivDepartmana() {
        return nazivDepartmana;
    }

    public void setNazivDepartmana(String nazivDepartmana) {
        this.nazivDepartmana = nazivDepartmana;
    }

    public int getBrojStudenataDepartmana() {
        return brojStudenataDepartmana;
    }

    public void setBrojStudenataDepartmana(int brojStudenataDepartmana) {
        if (brojStudenataDepartmana >= 0){
            this.brojStudenataDepartmana = brojStudenataDepartmana;
        }
        else System.out.println ("Broj studenata ne moze biti negativan broj. " +
                                 "Broj studenata ostaje nepromenjen: " + this.brojStudenataDepartmana);
    }

    public int getBrojStrucnihPredmeta() {
        return brojStrucnihPredmeta;
    }

    public void setBrojStrucnihPredmeta(int brojStrucnihPredmeta) {
        if (brojStrucnihPredmeta >=0){
            this.brojStrucnihPredmeta = brojStrucnihPredmeta;
        }
        else System.out.println ("Broj strucnih predmeta ne moze biti negativan broj. " +
                                 "Broj strucnih premdeta ostaje nepromenjen: " + this.brojStrucnihPredmeta);
    }

    @Override
    public String toString() {
       return ("Na departmanu " + nazivDepartmana + " ima " + brojStrucnihPredmeta + " strucnih predmeta "
               + " i " + brojStudenataDepartmana + " studenata.");
    }
}
