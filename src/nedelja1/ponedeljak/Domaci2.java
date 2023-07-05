package nedelja1.ponedeljak;
/*Domaci zadatak 2:
        Deklarisati i inicijalizovati dve promenljive x i y (njihove vrednosti su opcione).
        Ispisati u svakom redu posebno rezultat od proizvoda, deljenja, sabiranje i oduzimanja dva broja.
        (Primer na slici za x = 5 i y = 3)
         U drugom zadatku ispisati i kvadratnu vrednost od x
*/
public class Domaci2 {
    public static void main(String[] args) {
        int x;
        int y;
        x = 7;
        y = 2;
        System.out.println( "Sabiranje: " + (x + y));
        System.out.println( "Oduzimanje: " + (x -y));
        System.out.println("Mnozenje: " + x * y);
        System.out.println("Deljenje: " + x / y);
        System.out.println("X na kvadrat je: " + (x*x));
    }

}
