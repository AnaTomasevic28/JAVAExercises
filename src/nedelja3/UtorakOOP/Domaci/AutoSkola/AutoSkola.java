package nedelja3.UtorakOOP.Domaci.AutoSkola;
/*
        Napraviti klasu AutoSkola koja ima atribute za naziv, broj ljudi u autoskoli, cenu polaganja i
tip vozila za koje se polaze.
1) Napraviti metodu koja ce dati svima koji polazu za motor 50% popusta od cene polaganja.
2) Napraviti metodu koja ce nam vratiti koliko grupa ce imati Auto-skola ako znamo da
   grupa mora imati bar petoro ljudi.
3) Ukoliko korisnik zeli da polaze za Autobus, ispisati poruku da to nije moguce u ovom
   trenutku, u suprotnom ispisati da je polaganje moguce.
4) Sve rezultujuce objekte ispisati pomocu toString().
 */
public class AutoSkola {

    String naziv;
    int brojLjudi;
    double cenaPolaganja;
    String tipVozila;

    public AutoSkola(String naziv, int brojLjudi, double cenaPolaganja, String tipVozila) {
        this.naziv = naziv;
        this.brojLjudi = brojLjudi;
        this.cenaPolaganja = cenaPolaganja;
        this.tipVozila = tipVozila;
    }

    //1) Napraviti metodu koja ce dati svima koji polazu za motor 50% popusta od cene polaganja.
    public void popustMotor(){

        if (tipVozila.equalsIgnoreCase ("motor")){
           cenaPolaganja  *= 0.5;
        }
    }

    //2) Napraviti metodu koja ce nam vratiti koliko grupa ce imati Auto-skola ako znamo da
    //   grupa mora imati bar petoro ljudi.
    public int brojGrupa(){
        return brojLjudi / 5;
    }
    //3) Ukoliko korisnik zeli da polaze za Autobus, ispisati poruku da to nije moguce u ovom
    //   trenutku, u suprotnom ispisati da je polaganje moguce.
    public void odobrenje(){
      if (tipVozila.equalsIgnoreCase ("Autobus")){
          System.out.println ("U ovom trenutku nije moguce polagati za autobus.");
      }
      else System.out.println ("Polaganje je moguce za " + tipVozila);
    }
    //4) Sve rezultujuce objekte ispisati pomocu toString().

    @Override
    public String toString() {

        String s1 = "Autoskola " + naziv + " ima ukupno " + brojLjudi + " polaznika." + "\n";
        String s2 = "Cena polaganja za izabrano vozilo je " + cenaPolaganja;
        return s1 + s2;
    }
}
