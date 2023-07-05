package nedelja1.utorak;

import java.util.Scanner;

public class Domaci21 {
    /*
    Domaci Zadatak 1:
Napisati program koji ce racunati platu za unetu vrednost satnice i broja radnih sati.
Uneti satnicu i broj radnih sati preko konzole. Ukoliko je ukupna plata negativan broj,
ispisati neku poruku, u suprotnom samo ispisati ukupnu platu.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int satnica, brojRadnihSati;

        System.out.println("Uneti kolika je vrednost jednog radnog sata: ");
        satnica = sc.nextInt();

        System.out.println("Uneti broj radnih sati: ");
        brojRadnihSati = sc.nextInt();

        if (satnica < 0 || brojRadnihSati < 0){
            System.out.println("Neispravno uneti podaci! Ukupna plata ne moze biti negativna.");
        }
        else {
            System.out.println("Satnica je: " + satnica);
            System.out.println("Broj radnih sati je: " + brojRadnihSati);
            System.out.println("Vasa plata je: " + satnica * brojRadnihSati);
        }

    }






}
