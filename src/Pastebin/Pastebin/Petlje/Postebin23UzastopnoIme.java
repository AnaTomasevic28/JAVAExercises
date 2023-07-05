package Pastebin.Pastebin.Petlje;
/*
23.*    Korisnik unosi pozitivan ceo broj n, n >= 2 sa konzole. Zatim se unose imena korisnika. Ispisati "da" ako
        su uneta dva korisnika sa istim imenom za redom (jedan za drugim), a "ne" inace.
        Npr:
        "Ana", "Marija", "Milica", "Milica", "Jelena", "Zorica" -> "da" (zbog "Milica", "Milica")
        "Branko", "Aleksandar", "Marko" -> "ne"
        "Tara", "Jana", "Tara", "Jana" -> "ne" (iako imamo duplikate nisu uneti za redom)
 */


import java.util.Scanner;

public class Postebin23UzastopnoIme {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite jedan ceo broj n koji je jednak ili veci od 2: ");

        int n = sc.nextInt();

        String[] imena = new String[n];

        sc.nextLine ();  // bez ovoga iz nekog razloga preskace jedan unos kod formiranja niza u for petlji. ne znam zasto

        System.out.println ("Molim uneti imena n puta: ");

        for (int i = 0; i < imena.length; i++) {
                String ime = sc.nextLine ();
                imena[i] = ime;
        }

/*
        for (int i = 0; i < imena.length; i++) {
            System.out.print (imena[i] + " ");
        }

 */



        boolean b = false;

        for (int i = 1; i < imena.length; i++) {
            if(imena[i].equalsIgnoreCase (imena[i-1])){
                b = true;
                break;
            }
            else
                b= false;
        }

        if(b){
            System.out.println ("Da");
        }
        else
            System.out.println ("Ne");







    }
}
