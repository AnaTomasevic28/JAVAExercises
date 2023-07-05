package nedeljaPauze;

//  *Napisati funkciju koja prima ceo broj n i vraca broj cifara tog prosledjenog broja.
public class StrahinjaBrojCifara {
  
    public static int brojCifaraBroja (int n){

        int brojac = 0;

        while ( n != 0){
            brojac++;
            n /= 10;
        }

        return brojac;
    }
    
    

    public static void main(String[] args) {
      int n = 123456;

        System.out.println (brojCifaraBroja (n));
        
    }
}
