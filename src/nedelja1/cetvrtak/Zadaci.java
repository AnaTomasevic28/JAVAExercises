package nedelja1.cetvrtak;

import java.util.Scanner;

public class Zadaci {
  /*
     * 1. Napisati poruku "Jeste" ako je
        * zadati ceo broj deljiv sa 3
            * a poruku "Nije" ako nije.

  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int broj;
    System.out.println ("Molimo unesite jedan ceo broj: ");
    broj = sc.nextInt ();

    if (broj%3 == 0){
      System.out.println ("Jeste");
    }
    else{
      System.out.println ("Nije");
    }
  }


    /*
            * 2. Korisnik unosi ocenu koju je djak
        * dobio na testu i treba ispisati poruku:
            * "Nedovoljan" ; 1
            * "Dovoljan" ; 2
            * ...
            * "Odlican" ; 5
            *

  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int ocena;

    System.out.println ("Unesite ocenu koju je ucenik dobio na testu: ");
    ocena = sc.nextInt ();

    switch (ocena){
      case (1):
        System.out.println ("Nedovoljan");
        break;
      case (2):
        System.out.println ("Dovoljan");
        break;
      case (3):
        System.out.println ("Dobar");
        break;
      case (4):
        System.out.println ("Vrlo dobar");
        break;
      case (5):
        System.out.println ("Odlican");
        break;
      default:
        System.out.println ("Molimo pravilno unesite ocenu ucenika");
    }
  }
*/

  /*     3. Korisnik unosi jednocifren ceo broj
        * ispisati poruku "Paran" odnosno "Neparan" ako je unet
        * broj paran, odnosno neparan.
        *
                * */

  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int jednocifrenBroj;

    System.out.println ("Unesite jednocifren broj");
    jednocifrenBroj = sc.nextInt ();

    if ((2 % jednocifrenBroj) == 0){
      System.out.println ("Paran");
    }
    else
      System.out.println ("Neparan");
  }
}
