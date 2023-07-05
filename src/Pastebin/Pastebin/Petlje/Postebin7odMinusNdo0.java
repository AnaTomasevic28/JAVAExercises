package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

public class Postebin7odMinusNdo0 {
    public static void main(String[] args) {
        /*
         * 7. Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.
         */
        Scanner sc = new Scanner (System.in);

        System.out.println ("Unesite jedan negativan ceo broj: ");

        int n = sc.nextInt ();

        for (int i = n ; i<=0; i++){
            System.out.print (i + ", ");
        }


    }
}
