package Pastebin.PastebinOOP.Zadatak20.Geometrija.Baza;

import Pastebin.PastebinOOP.Zadatak20.Geometrija.Interfejsi.MerljivoU3D;

public abstract class Telo extends Oblik implements MerljivoU3D {
    public Telo() {
    }

    @Override
    public String getOsobine() {
        return "Povrsina: " + povrsina() + "\nZapremina: " + zapremina();
    }

}
