package nedelja1.petak;

import java.util.Scanner;

public class Domaci1 {
    /*
    * Domaci Zadatak 1:
Uneti neki ceo broj N preko Scannera. Proci kroz svaki broj od 0 do N i za svaki broj koji je
deljiv sa 3 istampati “Fizz”, za svaki broj koji je deljiv sa 5 ispisujemo “Buzz”, a u slucaju da
je broj deljiv i sa 5 i sa 3, ispisujemo “FizzBuzz” (Obratiti paznju da broj bude pozitivan).
    *
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println ("Uneti jedan ceo broj: ");
        int N = sc.nextInt (); // 15

        // 3 , 5 , 6 , 9 , 10 , 12 , 15 --> Fizz, Buzz, Fizz, Fizz, Buzz, Fizz, FizzBuzz

        for (int i = 1; i <= Math.abs (N); i++){
            if ((i % 5 != 0) && ( i % 3 != 0) ){
                System.out.println (i);
            }
            if ( (i % 5 == 0) && ( i % 3 == 0) ){
                System.out.println (i + ": FizzBuzz");
            }
            else if ( i % 5 == 0){
                System.out.println (i + ": Buzz");
            }
            else if ( i % 3 == 0) {
                System.out.println (i + ": Fizz");
            }
        }

       }

    }

