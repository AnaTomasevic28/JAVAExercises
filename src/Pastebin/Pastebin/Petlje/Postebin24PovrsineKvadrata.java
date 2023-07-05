package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

//24.* Izracunati sumu povrsina svih kvadrata koji imaju celobrojne stranice cija je duzina manja od 200
public class Postebin24PovrsineKvadrata {

    // stranice kvadrata su duzine, 1, 2, 3, 4 ... 200;
    // izracunati povrsine za svaki od ovih 200 kvadrata
    // izracunati sumu tih povrsina
    // povrsina kvadrata je a * a, tj. a na kvadrat
    // pisacu kao funkciju

    //povrsina kvadrata

//    static int povrsinaKvadrata (int[] a) {
//
//        int[] povrsina = new int[200];
//
//        for (int i = 1; i <= povrsina.length; i++) {
//            povrsina[i] = a[i] * a[i];
//        }
//
//        return povrsina[200];
//    }

    //formiranje niza
//        static int[] formiranjeNiza( Scanner skener){
//        int duzinaNiza = skener.nextInt();
//
//        int[] niz200 = new int[duzinaNiza];
//
//        for (int i = 0; i < niz200.length; i++) {
//            niz200[i] = i+1;
//        }
//       return niz200;
//    }


    //ispisi niz da proveris
    static void ispisNiza (int[] niz){
        Scanner skener = new Scanner (System.in);

        for (int i = 0; i < niz.length; i++) {
            System.out.print (niz[i] + " ");
        }
        skener.nextLine ();
    }

    public static void main(String[] args) {

        int[] nizStranica = new int[200];


        for (int i = 0; i < nizStranica.length; i++) {
            nizStranica[i] = i + 1;
        }

        int[] povrsina = new int[nizStranica.length];

        for (int i = 0; i < povrsina.length; i++) {
            povrsina[i] = nizStranica[i] * nizStranica[i];
        }


       // ispisNiza(nizStranica);

        ispisNiza(povrsina);

    }

}
