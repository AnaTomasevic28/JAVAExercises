package Pastebin.PastebinOOP.Zadatak20.Geometrija.Baza;

import Pastebin.PastebinOOP.Zadatak20.Geometrija.Interfejsi.MerljivoU2D;

public abstract class Figura extends Oblik implements MerljivoU2D {

    public Figura() {
    }

    @Override
    public String getOsobine() {
        return "Obim: " + obim() + "\nPovrsina: " + povrsina();
    }
}
