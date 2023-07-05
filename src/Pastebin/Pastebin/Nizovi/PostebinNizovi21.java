package Pastebin.Pastebin.Nizovi;


//  21.** Napisati funkciju koja vraca maximum od dva broja bez koriscenja if-ova, switch-ova ili ? operatora.

public class PostebinNizovi21 {

    static int maximum (int x, int y){

//        return Math.max (x,y);

       while (x>y){
        return x;
       }
        return y;
    }

    public static void main(String[] args) {
        int x = -25;
        int y = 20;

        System.out.println (maximum (x, y));
    }
}
