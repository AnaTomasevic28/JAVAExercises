package Pastebin.PastebinOOP.Zadatak20.Geometrija.Baza;

public abstract class Oblik {
    public Oblik() {
    }

    public abstract String getIme();
    public abstract String getOsobine();

    @Override
    public String toString() {
        return getIme() + "\n" + getOsobine();
    }
}
