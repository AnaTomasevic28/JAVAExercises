package Pastebin.Pastebin.Petlje;

public class Postebin16TablicaMnozenja {

    //16. Ispisati tablicu mnozemnja jednocifrenih brojeva (dakle tabela 10x10, 0 u prvom polju, 81 u poslednjem polju)

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.print (i*j);
                if (i*j < 10)
                    System.out.print("  ");
                else
                    System.out.print(" ");
            }
            System.out.println ();
        }


    }
}
