package Pastebin.Pastebin.Nizovi;

// 17. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".

public class PostebinNizovi17 {

    public static boolean daLiPostojiImeUNizu ( String [] imena, String ime1, String ime2){

        boolean b = false;

        for (int i = 0; i < imena.length; i++) {
            if (imena[i].equalsIgnoreCase (ime1) || imena[i].equalsIgnoreCase (ime2)){
                return true;
            }
        }

        return b;
    }



    public static void main(String[] args) {

        String[] nizImena = {"ana",  "sladja", "gorica", "marko"};

        String ime1 = "Marija";
        String ime2 = "Petar";

        System.out.println (daLiPostojiImeUNizu (nizImena, ime1, ime2));

    }
}
