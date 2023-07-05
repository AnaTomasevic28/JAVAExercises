package nedeljaPauze;

public class CodewarsNumberToString {
//
//    We need a function that can transform a number (integer) into a string.
//
//    What ways of achieving this do you know?
//
//    Examples (input --> output):
//            123  --> "123"
//            999  --> "999"
//            -100 --> "-100"
    public static String numberToString(int num) {
        String stringBroja = String.valueOf (num);

        return stringBroja;
    }

    public static void main(String[] args) {
        int num = 123;

        System.out.println (numberToString (num));
    }
}

