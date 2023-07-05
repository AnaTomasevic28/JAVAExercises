package Pastebin.Pastebin.Nizovi;

//22.*
//     a) Napisati funkciju koja ispituje da li je niz monoton ili nije.
//        Niz je MONOTON ako je ili rastuci ili opadajuci ili konstantan, ali NE i rastuci i opadajuci.
//     b) Napisati funkciju koja ispituje da li je niz strogo monoton ili nije.
//        Niz je STROGO MONOTON ako je iskljucivo rastuci ili iskljucivo  opadajuci
//        i u nikojem delu nije konstantan (nema ponavljajucih elemenata)

public class PostebinNizovi22 {
// a)
    static void daLiJeMonoton(int[] niz) {
        boolean b = true;

        String trend = "jednak";

                for (int i = 1; i <niz.length ; i++) {
                    if(niz[i] < niz[i-1]){                  // opadajuci niz
                        trend = "opadajuci";
                        break;
                    } else if (niz[i] > niz[i-1]){
                        trend = "rastuci";
                        break;
                    }
                }

        if (trend.equalsIgnoreCase ("jednak")) {
            b = true;
        }
        else if (trend.equalsIgnoreCase ("opadajuci")){
            for (int i = 1; i < niz.length; i++) {
                if (niz[i] > niz[i-1]){
                    b = false;
                    break;
                }
            }
        } else if (trend.equalsIgnoreCase ("rastuci")) {
            for (int i = 1; i < niz.length; i++) {
                if (niz[i] < niz[i - 1]){
                    b = false;
                    break;
                }
            }
        }

        if (b){
            System.out.println ("Niz je monoton");
        }
        else System.out.println ("Niz nije monoton");
    }

    public static void main(String[] args) {
        int[]niz = {5,5,5,5,5};

        daLiJeMonoton (niz);
    }
}
