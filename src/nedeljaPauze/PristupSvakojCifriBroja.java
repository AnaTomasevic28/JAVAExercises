package nedeljaPauze;

import java.util.Scanner;

public class PristupSvakojCifriBroja {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println ("Molimo unesite neki broj: ");
        String strNumber = sc.nextLine ();
        int digit = 0;

        for (int i = 0; i < strNumber.length (); i++) {
            if (i == 0) {
                digit = Character.getNumericValue (strNumber.charAt (i));
                System.out.println (digit);
            } else if (i == 1) {
                digit = Character.getNumericValue (strNumber.charAt (i));
                System.out.println (digit);
            } else if (i==2) {
                digit = Character.getNumericValue (strNumber.charAt (i));
                System.out.println (digit);
            }
        }




/**Ova linija koda uzima karakter iz niske strNumber na poziciji i,
 a zatim pretvara taj karakter u odgovarajuću numeričku vrednost pomoću metode
 Character.getNumericValue().
 Npr, ako je strNumber niska koja sadrži broj "123", poziv strNumber.charAt(0) će vratiti karakter '1',
 a Character.getNumericValue(strNumber.charAt(0)) će vratiti numeričku vrednost 1 kao int.
 Ova linija koda se obično koristi u petljama za prolazak kroz sve cifre u broju koji je zapisan kao niska.
 */

    }
}
