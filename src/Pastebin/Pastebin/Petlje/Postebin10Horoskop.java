package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

public class Postebin10Horoskop {
    /*
     * 10. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Molim unesite mesec svog rodjenja: ");
        String mesec = sc.nextLine (). toLowerCase ();


        System.out.println ("Molim unesite dan svog rodjenja: ");
        int dan = sc.nextInt ();


        switch (mesec){
            case "januar":{
                if (dan <= 19 )
                    System.out.println ("Vi ste jarac u horoskopu.");
                else
                    System.out.println ("Vi ste vodolija u horoskopu.");
                }
                break;
            case "februar":{
                if (dan <= 18)
                    System.out.println ("Vi ste vodolija u horoskopu.");
                else
                    System.out.println ("Vi ste riba u horoskopu.");
                }
                break;
            case "mart":{
                if (dan <= 20)
                    System.out.println ("Vi ste riba u horoskopu.");
                else
                    System.out.println ("Vi ste ovan u horoskopu." );
                }
                break;
            case "april":{
                if (dan<= 19)
                    System.out.println ("Vi ste ovan u horoskopu.");
                else
                    System.out.println ("Vi ste bik u horoskopu.");
                }
                break;
            case "maj" :{
                if(dan <= 20 )
                System.out.println ("Vi ste bik u horoskopu.");
                else
                    System.out.println ("Vi ste blizanac u horoskopu.");
                }
                break;
            case "jun":{
                if (dan <= 21)
                    System.out.println ("Vi ste blizanac u horoskopu.");
                else
                    System.out.println ("Vi ste rak u horoskopu.");
                }
                break;
            case "jul":{
                if (dan <= 22)
                    System.out.println ("Vi ste rak u horoskopu.");
                else
                    System.out.println ("Vi ste lav u horoskopu.");
                }
                break;
            case "avgust":{
                if (dan <= 22)
                    System.out.println ("Vi ste lav u horoskopu.");
                else
                    System.out.println ("Vi ste devica u horoskopu.");
                }
                break;
            case "septembar":{
                if (dan <= 22)
                    System.out.println ("Vi ste devica u horoskopu.");
                else
                    System.out.println ("Vi ste vaga u horoskopu.");
                }
                break;
            case "oktobar":{
                if (dan <= 22)
                    System.out.println ("Vi ste vaga u horoskopu.");
                else
                    System.out.println ("Vi ste skorpija u horoskopu.");
                }
                break;
            case "novembar":{
                if (dan <= 21)
                    System.out.println ("Vi ste skorpija u horoskopu.");
                else
                    System.out.println ("Vi ste strelac u horoskopu.");
                }
                break;
            case "decembar":{
                if (dan <= 21)
                    System.out.println ("Vi ste strelac u horoskopu.");
                else
                    System.out.println ("Vi ste jarac u horoskopu.");
                }
        }


    }
}
