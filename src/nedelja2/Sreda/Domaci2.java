package nedelja2.Sreda;

public class Domaci2 {

    //Domaci Zadatak 2:
    //
    // Definisati dva jednaka niza brojeva,
    // kao rezultat vratiti niz gde ce se sabrati svi elementi sa istim indeksima.

    public static void main(String[] args) {
        int[] niz1 = {1,2,3,4,5};
        int[] niz2 = {6,7,8,9,10};

        int[] rezultat = new int[niz1.length];


        for (int i = 0; i < niz1.length; i++) {
            rezultat[i] = niz1[i] + niz2[i];
        }

        System.out.print ("[");

        for (int i = 0; i < rezultat.length - 1; i++) {
            System.out.print (rezultat[i] + ", ");
        }
        System.out.print (rezultat[rezultat.length-1]);
        System.out.println ("]");


    }
}
