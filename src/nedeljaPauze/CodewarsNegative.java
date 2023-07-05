package nedeljaPauze;

import java.util.Scanner;

public class CodewarsNegative {

    static int negativanBroj (final int x){
        if (x > 0) {
            return -1 * x;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

       final int x = sc.nextInt ();

        System.out.println (negativanBroj (x));
    }
}
