//package nedelja1.Postebin.Nizovi;
////24.*  Napisati funkciju koja vraca konvertovani zadati iznos zadate valute u neku drugu zadatu valutu,
////      ako su moguce valute i njihovi kursevi zadati kao:
////      EUR = 117.26 RSD        EUR = 144.76 JPY (117.26/0.81)       EUR = 1.09 USD (117.26/107.79)
////      USD = 107.79 RSD        USD = 133.07 JPY (107.79/0.81)       USD = 0.92 EUR (107.79/117.26)
////      JPY = 0.81 RSD          JPY = 0.01 EUR (0.81/117.26)         JPY = 0.01 USD (0.81/107.79)
////pod uslovom da su prodajni i kupovni kursevi isti.
////      Npr:
////      "EUR", "RSD", 10 -> 1172.6
////      "EUR", "JPY", 100 -> 14476.54
////      "USD", "USD", 0.26 -> 0.26
//public class PostebinNizovi24 {
//
//    static double konvertovanaValuta(String prijemnaVulata, double iznos, String izlaznaValuta){
//
//        double eUR = 117.26;
//        double uSD = 107.79;
//        double jPY = 0.81;
//        double rezultat = 1;
//        double dinari = 1;
//
//
//        switch (prijemnaVulata) {
//            case ("EUR"):
//                dinari = iznos * eUR;
//
//                rezultat = iznos * 1;
//                break;
//            case ("USD"):
//                rezultat = iznos * eUR / uSD;
//                break;
//            case ("JPY"):
//                rezultat = iznos * eUR / jPY;
//                break;
//            case ("RSD"):
//                rezultat = iznos * eUR;
//                break;
//        }

//        switch (valuta2) {      //usd
//            case ("EUR"):
//                rezultat = iznos * uSD / eUR;
//                break;
//            case ("USD"):
//                rezultat = iznos * 1;
//                break;
//            case ("JPY"):
//                rezultat = iznos * uSD / jPY;
//                break;
//            case ("RSD"):
//                rezultat = iznos * uSD;
//                break;
//        }
//
//        switch (valuta3) {      // jpy
//            case ("EUR"):
//                rezultat = iznos * jPY / eUR;
//                break;
//            case ("USD"):
//                rezultat = iznos * jPY / uSD;
//                break;
//            case ("JPY"):
//                rezultat = iznos * 1;
//                break;
//            case ("RSD"):
//                rezultat = iznos * jPY;
//                break;
//        }
//
//        switch (valuta4) {          // rsd
//            case ("EUR"):
//                rezultat = iznos * eUR;
//                break;
//            case ("USD"):
//                rezultat = iznos * uSD;
//                break;
//            case ("JPY"):
//                rezultat = iznos * jPY;
//                break;
//            case ("RSD"):
//                rezultat = iznos * 1;
//                break;
//        }
//        return rezultat;
//    }
//
//    public static void main(String[] args) {
//        String ulaznaValuta = "EUR";
//        double iznos = 100.0;
//        String izlaznaVAluta = "RSD";
//
//        System.out.println (konvertovanaValuta (ulaznaValuta, iznos, izlaznaVAluta));
//
//    }
//
//}
