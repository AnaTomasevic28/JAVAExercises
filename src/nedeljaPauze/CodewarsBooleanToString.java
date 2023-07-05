package nedeljaPauze;

public class CodewarsBooleanToString {

    /*
    Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.
     */
    public static String boolToWord(boolean b){
        String yes = "Yes";
        String no = "No";

        if ( b == true)
            return yes;

        else
            return no;

    }


    public static void main(String[] args) {
        boolean b = false;

        System.out.println (boolToWord (b));
    }
}
