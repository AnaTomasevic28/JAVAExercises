package nedelja2.Cetvrtak.Domaci;

public class DomaciStrahinjaFunkcije {

    //Za domaci ... napisati funkciju koja provera da li su dva niz ista -> povratna vrednost je: boolean

    static boolean poredjenjeNizova (int[] niz1, int[] niz2){
        boolean b = true;

        if (niz1.length != niz2.length){
            b = false;
            }
        else {
            for (int i = 0; i < niz1.length; i++) {
                if (niz1[i] != niz2[i]){
                    b = false;
                    break;
                }
            }
        }
        return b;
        }

    static boolean poredjenjeNizova2 (int[] niz1, int[] niz2){


        if (niz1.length != niz2.length){
         return false;
        }
        else {
            for (int i = 0; i < niz1.length; i++) {
                if (niz1[i] != niz2[i]){
                    return false; // cim je data naredba return program izlazi iz funkcije, zato se
                                 // ne zahteva break;
                }
            }
        }
      return true;
    }
// Moramo da zagarantujemo da ZA SVAKU GRANU sa povratnom vrednoscu u funkciji IMAMO RETURN naredbu!!!



    }


