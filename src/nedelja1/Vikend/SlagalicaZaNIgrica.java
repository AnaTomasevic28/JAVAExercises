package nedelja1.Vikend;

import java.util.Scanner;

public class SlagalicaZaNIgrica {
 /*   --Petlje
1.Slagalica za n igraca
    TV emisija Slagalica koja se emituje na RTS 1 je promenila svoj format. Naime,
    sada je moguce da u jednoj emisiji ucestvuje proizvoljan broj takmicara. Potrebno
    je napisati novi program za deklarisanja pobednicke reci.
    Korisnik unosi reci koje su ucesnici dobili u 1. igri emisije sve dok se ne unese
    rec sacinjena samo od jedne tacke (tj. string "."). Na standardnom izlazu treba
    ispisati koja je pobednicka rec, tj. koja rec je najduza, kao i broj osvojenih
    poena za datu rec. Ukoliko ima vise pobednickih reci ispisati:
    a) prvu koja se unela (>)
    b) poslednju koja se unela (>=)
    Broj osvojenih poena se racuna tako sto se za svako slovo u pobednickoj reci
    dodeli 2 poena pobedniku.
            ------------------------------------------------------------------------------------
    Primer 1a)
    Input:
            "Slagalica" "JE" "super" "kvIZ"
    Output:
            "Slagalica"
            18
    Primer 1b)
    Input:
            "Slagalica" "JE" "super" "kvIZ"
    Output:
            "Slagalica"
            18
    Primer 2a)
    Input:
            "Ovi" "Zadaci" "Uopste" "Nisu" "Toliko" "Teski" "Kada" "Malo" "Razmis" "lite" "O" "Njima"
    Output:
            "Zadaci"
            12
    Primer 2b)
    Input:
            "Ovi" "Zadaci" "Uopste" "Nisu" "Toliko" "Teski" "Kada" "Malo" "Razmis" "lite" "O" "Njima"
    Output:
            "Razmis"
            12

  */
 public static void main(String[] args) {

  Scanner sc = new Scanner (System.in);

  System.out.println ("Molimo unesite reci koje su takmicari dobili u prvoj igri.");

String najduzaRec = "";
 String unos = sc.next();

   while (!unos.equals(".")) {
    if (unos.length() > najduzaRec.length()) {
     najduzaRec = unos;
    }
    unos = sc.next();
   }



/*
  String najduzaRec = sc.nextLine ();

  while (!najduzaRec.equals (".")) {
   String unos = sc.nextLine ();
   if (unos.length () > najduzaRec.length ()) {
    najduzaRec = unos;
   }
   if (unos.length () == najduzaRec.length ()){
    najduzaRec = unos;
   }
   if (unos.equals ("."))
    break;
  }

 */

   System.out.println ("Najduza rec je : " + najduzaRec);
   System.out.println ("Broj osvojenih bodova je: " + (najduzaRec.length () * 2));

 }
}

