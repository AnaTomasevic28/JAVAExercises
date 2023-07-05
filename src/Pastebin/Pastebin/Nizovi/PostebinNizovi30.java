package Pastebin.Pastebin.Nizovi;

// 30. Napisati funkciju koja vraca broj pokusaja
//     koji su bili potrebni da javin nasumicni generator brojeva
//     pogodi zadati celi broj iz intervala [1, 100].

public class PostebinNizovi30 {

    static int brojPokusaja (int x){

        int brojac = 0;

        while ( true ) {
            double random = Math.random () * 100 + 1;
            int y = (int) random;
            if (y != x) {
                brojac++;
            }
            else break;
        }

        return brojac;
        }


    public static void main(String[] args) {
        int x = 57;

        System.out.println (brojPokusaja (x));
    }
}
