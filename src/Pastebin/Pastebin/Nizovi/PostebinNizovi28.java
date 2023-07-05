package Pastebin.Pastebin.Nizovi;
//28. Napisati fuknciju koja vraca double duzinu stranice kvadrata
//    za prosledjenu double povrsinu kvadrata.
public class PostebinNizovi28 {

static double stranicaKvadrata ( double povrsina) {

    return Math.sqrt(povrsina);
}

    public static void main(String[] args) {

        double povrsinaKvadrata = 16.16;
        System.out.println (stranicaKvadrata (povrsinaKvadrata));

    }
}
