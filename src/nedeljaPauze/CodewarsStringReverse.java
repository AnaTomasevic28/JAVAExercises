package nedeljaPauze;

public class CodewarsStringReverse {
    public static String solution(String str) { // world
        String reversed = "";


        for (int i = str.length () - 1; i >= 0 ; i--) {

            reversed += str.charAt (i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        String str = "World";

        System.out.println (solution (str));

        System.out.println ();
    }
}
