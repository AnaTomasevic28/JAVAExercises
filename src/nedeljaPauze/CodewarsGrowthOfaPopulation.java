package nedeljaPauze;

public class CodewarsGrowthOfaPopulation {
    public static int nbYear(int p0, double percent, int aug, int p) {

        int years = 0;
        while(p0 < p){
            p0 += p0 * (percent/100) + aug;
            years++;
        }

        return years;
    }

    public static void main(String[] args) {

        int p0 = 1000;
        double percent = 2;
        int aug = 50;
        int p = 1200;

        System.out.println (nbYear (p0, percent, aug, p));
    }
}