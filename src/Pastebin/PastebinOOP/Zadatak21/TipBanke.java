package Pastebin.PastebinOOP.Zadatak21;

public enum TipBanke {
    PRIVATNA_BANKA(0),
    JAVNA_BANKA(1);

    private final int broj;
    TipBanke(int i) {
        broj = i;
    }

    public int getBroj() {
        return broj;
    }
}
