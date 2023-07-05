package Pastebin.Pastebin.Petlje;

import java.util.Scanner;

public class Postebin26PrestupnaGodina {
/*
         26.* Za unete dve godine g1 i g2 ispisati koliko ima prestupnih godina u intervalu [g1, g2]. Godina je prestupna ako:
            - Deljiva je sa 4
            - Nije deljiva sa 100 ili je deljiva sa 400
 */

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println ("Molimo unesite dve razlicite godine, najpre stariju a zatim skoriju: ");

        int g1 = sc.nextInt ();
        int g2 = sc.nextInt ();

        if(g1 > g2){
            System.out.println ("Molimo unesite prvo stariju godinu, pa onda skoriju: ");
            g1 = sc.nextInt ();
            g2 = sc.nextInt ();
        }

        int duzinaNiza = g2 - g1 - 1;

        //2023-2016 = 7-1=6; 2017,2018,2019,2020,2021,2022

        int[] intervalniz = new int[duzinaNiza];


        for (int i = 0; intervalniz.length > i; i++) {
            intervalniz[i] = g1 + 1;
            g1++;

        }
        sc.nextLine ();

        for (int i = 0; i < intervalniz.length; i++) {
            System.out.print (intervalniz[i] + " ");
        }


        int brojac = 0;

        for (int i = 0; i < intervalniz.length; i++) {
            if ((intervalniz[i] % 4 == 0)&& (intervalniz[i] % 100 != 0 || intervalniz[i] % 400 == 0)){
                brojac++;
            }
        }

        sc.nextLine ();

        System.out.println ("U intervalu unetih godina ima " + brojac + " prestupnih godina.");
    }

}
