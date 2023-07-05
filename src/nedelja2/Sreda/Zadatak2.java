package nedelja2.Sreda;

public class Zadatak2 {
    public static void main(String[] args) {

        /*
         *Zadatak 2:
         * Napraviti niz int-ova gde cete kao rezultat vratiti dve vrednosti,
         * jedna ce biti zbir svih parnih,
         * a druga zbir svih neparnih brojeva.
         */

        int [] niz = {1,2,3,4,5,6,7,8,9,10};
        int suma = 0;
        int suma2 = 0;

        for (int i = 0; i < niz.length; i++) {
            if ( niz[i]%2 == 0){
                suma += niz[i];
            }

        }
        System.out.println (suma);

        for (int j = 0; j < niz.length; j++) {
            if (niz[j] % 2 != 0){
                suma2 += niz[j];
            }

        }

        System.out.println (suma2);
    }
}
