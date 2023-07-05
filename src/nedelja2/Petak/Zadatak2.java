package nedelja2.Petak;
//1. (15. - drugi deo)
//   Napisati funkciju koja ispituje da li je suma niza veca od njegovog proizvoda.

//2. Napisati funkciju koja prima dva imena i niz imena i
//   proverava da li se bilo koje od ta dva prosledjena imena
//   nalaze u prosledjenom nizu imena.

//3. (13.* prvi deo - da ne zaboravim)
//   Za unet pozitivan ceo broj n,
//   ispisati za svaki pozitivan ceo broj t, koji je strogo manji od njega (dakle t < n),
//   sumu svih pozitivnih celih brojeva od 1 do tog broja (dakle 1 + 2 + 3 + ... + t).
public class Zadatak2 {

    static boolean sumaVecaOdProizvoda (int[] niz){ // uradi fnkciju posebno za sumu i za proizvod
        int suma = 0;                               // return suma(niz) >= proizvod (niz);
        int proizvod = 1;                           // ovako jer je rezultat uslova u if-u u stvari
                                                    // tipa boolean
        for (int i = 0; i < niz.length; i++) {
            suma += niz[i];
        }
        for (int i = 0; i < niz.length; i++) {
            proizvod *= niz[i];
        }
        if (suma >= proizvod){
            return true;
        }
        return false;
    }

    //2. Napisati funkciju koja prima dva imena i niz imena i
//       proverava da li se bilo koje od ta dva prosledjena imena
//       nalaze u prosledjenom nizu imena.

    static  boolean pretragaImena ( String[] niz, String ime1, String ime2){ // Ovako nesto dolazi na testu
        for (int i = 0; i < niz.length; i++) {
            if (niz[i].equalsIgnoreCase (ime1)){
                return true;
            }
            if (niz[i].equalsIgnoreCase (ime2)){
                return true;
            }
        }
        return false;

        /*  if (niz[i].equals (ime1) || niz[i].equals (ime2))

         */
    }

    //3. (13.* prvi deo - da ne zaboravim)
//   Za unet pozitivan ceo broj n,
//   ispisati za svaki pozitivan ceo broj t, koji je strogo manji od njega (dakle t < n),
//   sumu svih pozitivnih celih brojeva od 1 do tog broja (dakle 1 + 2 + 3 + ... + t).

    static void zbir (int n){
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
            System.out.println ("Zbir svih brojeva od 1 do " + i + " je " + suma);
        }

         /*
        

        for (int t = 1; t < n; t++) {
            for (int i = 0; i <= t; i++) {
                suma += i;
            }
            System.out.println (suma);
        }
        */

    }



    public static void main(String[] args) {

        int[] niz1 = {1,2,3,4,5};

        String[] nizStringova = {"Ana", "Pedja", "Marko"};
        String ime1 = "Andjela";
        String ime2 = "Dejan";

        System.out.println (sumaVecaOdProizvoda (niz1));

        System.out.println (pretragaImena (nizStringova, ime1, ime2));

        int x = 3;

        zbir (x);

    }
}
