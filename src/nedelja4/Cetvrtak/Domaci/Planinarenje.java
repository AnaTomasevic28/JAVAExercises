package nedelja4.Cetvrtak.Domaci;
//Napraviti Interfejs Planinarenje koji ce imati metode za:
//-popniSe(Planina p) - Za prosledjenu planinu proveriti da li je njena visina manja od
// maksimalnog uspona Planinara, ako jeste, dodati je u listu Planina.
//-clanarina() - Vraca koliko kosta clanarina, znamo da je fiksno 1000 dinara, plus
// dobijamo 2% popusta za svaku planinu na koju se Planinar popeo.
//-sviUsponi() - Vraca koliko se sve ukupno Planinar popeo kada se saberu sve visine
// planina na koje se on popeo.
//** Opciona metoda= najvecaPlanina() - Vraca najvecu planinu iz liste.
public interface Planinarenje {

    void popniSe(Planina P);
    double clanarina();
    double sviUsponi();
    Planina najvecaPlanina();
}
