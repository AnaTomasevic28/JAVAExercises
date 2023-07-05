package Pastebin.Pastebin.Nizovi;


//19.* Napisati funkciju koja sabira dva niza proizvoljne duzine.
//     Npr: [1, 2, 3, 4, 5] + [1, 2, 3] -> [2, 4, 6, 4, 5]
//
//     b)** -//- bez kreiranja dodatnih nizova
public class PostebinNizovi19 {
// ****  a)
    public static int[] zbirNizova (int[] niz1, int[] niz2){
        int[] zbirNizova;

        if(niz1.length > niz2.length){
            zbirNizova = new int[niz1.length];
            for (int i = 0; i < niz2.length; i++) {
                zbirNizova[i] = niz1[i] + niz2[i];
            }
            for (int i = niz2.length; i < zbirNizova.length; i++) {
                zbirNizova[i] = niz1[i];
            }
        }
        else{
            zbirNizova = new int[niz2.length];
            for (int i = 0; i < niz1.length; i++) {
                zbirNizova[i] = niz1[i] + niz2[i];
            }
            for (int i = niz1.length; i < niz2.length   ; i++) {
                zbirNizova[i] = niz2[i];
            }
        }

        return zbirNizova;
    }

// *** b)

    public  static int[] zbirDvaNiza (int[] niz1, int[] niz2){

        if (niz1.length > niz2.length){
            for (int i = 0; i < niz2.length; i++) {
                niz1[i] += niz2[i];
            }
            return niz1;
        }
        else{
            for (int i = 0; i < niz1.length; i++) {
                niz2[i] += niz1[i];
            }
            return niz2;
        }

    }

    public static void main(String[] args) {

    int[] niz1 = {1,2,3,4,5};
    int[] niz2 = {6,7,8};

    int [] resenje = zbirNizova (niz1, niz2);

        for (int i = 0; i < resenje.length; i++) {
            System.out.print (resenje[i] + " ");
        }
        System.out.println ();

    int[] zbirDvaNIza = zbirNizova (niz1, niz2);

        for (int i = 0; i < zbirDvaNIza.length; i++) {
            System.out.print (zbirDvaNIza[i] + " ");
        }

    }
}
