package Pastebin.PastebinOOP.Zadatak21;

import java.util.ArrayList;

public class Banka extends ApstraktnaBanka{
    private String slogan;

    public Banka(TipBanke tipBanke, String naziv, ArrayList<String> valuteKojePrima, String slogan) {
        super(tipBanke, naziv, valuteKojePrima);
        this.slogan = slogan;
    }

    public Banka() {
        this.slogan = "";
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    @Override
    public String pozdrav() {
        return slogan;
    }


    //Banka uzima proviziju od 10% | 20%
    @Override
    public double promeniNovac(double val, String fromCurr, String toCurr) {
        switch (fromCurr){
            case "RSD":
                switch (toCurr){
                    case "RSD":
                        if (getTipBanke() == TipBanke.PRIVATNA_BANKA)
                            return val * 0.8;
                        else return val * 0.9;
                    case "EUR":
                        if (getTipBanke() == TipBanke.PRIVATNA_BANKA)
                            return val * 1/123.17 * 0.8;
                        else return val * 1/123.17 * 0.9;
                    case "JPY":
                        if (getTipBanke() == TipBanke.PRIVATNA_BANKA)
                            return val * 1.07 * 0.8;
                        else return val * 1.07 * 0.9;
                }
            case "EUR": return 0;
            case "JPY": return 0;
        }
        return 0; //Ili baciti neku novu gresku!
    }

    @Override
    public void ispisiDevize() {
        System.out.println (getValuteKojePrima ());
    }
}
