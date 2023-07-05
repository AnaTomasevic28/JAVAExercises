package nedelja2.Cetvrtak.Funkcije;

import java.util.Scanner;

public class ZAdatak3 {

//      * 3. Napisati funkciju koja prima 2 stringa i ispisuje duzi od njih

    static  void duziString (String a, String b){
        if (a.length() > b.length()){
            System.out.println (a);
        }
        else System.out.println (b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        String prvi = sc.nextLine ();
        String drugi = sc.nextLine ();

        duziString(prvi,drugi);

    }

}
