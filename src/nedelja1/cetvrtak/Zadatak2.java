package nedelja1.cetvrtak;

import java.util.Scanner;

public class Zadatak2 {

    // 2. Napisati program koji ispisuje sve brojeve deljive sa 3 ili deljive sa 4 od 1 do 100
    public static void main(String[] args) {


    int i = 0;

        while(i< 100){
        if (i % 3 == 0) {
            System.out.println (i);
        }
        else if (i % 4 == 0) {
            System.out.println (i);
        }
        i++;
    }


}

}
