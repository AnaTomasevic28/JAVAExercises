package nedelja1.ponedeljak;

public class Domaci1 {
    /*
    Napraviti Java program koji ce ispisati podatke o korisniku. Podaci o korisniku ce se
cuvati u vidu promenljivih, potrebne su nam promenljive za:
-Ime
-Prezime
-Godina rodjenja
-Godina zaposlenja (opciono)
U ispisu treba istampati u jednom redu ime i prezime korisnika, zatim u novom redu godinu njegovog
rodjenja i u jos jednom redu ukupan broj godina radnog staza.
*/
    public static void main(String[] args) {
        String ime;
        ime = "Petar";
        String prezime = "Petrovic";
        int godinaRodjenja = 1961;
        int godinaZaposlenja = 1985;

        System.out.println( "Ime i prezime: " + ime + " " + prezime);
        System.out.println( "Godina rodjenja: " + godinaRodjenja);
        System.out.println( "Godine radnog staza: " + (2023 - godinaZaposlenja));

        }
}

