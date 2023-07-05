package nedelja3.Ponedeljak.Domaci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  Za domaci, odraditi onaj zadatak sa duplikatima preko liste.
public class Strahinja_Domaci {

    /*
     * Definisati listu nekih imena, kao rezultat vratiti istu listu ali bez duplikata.
     * Kreiramo novu listu koji nema duplikate u sebi
     */

    static List<String> listaBezDuplikata(List<String> lista){ // bez pravljenja nove liste

        List<String> jedinstvenaLista = new ArrayList<> ();

        for (int i = 0; i < lista.size (); i++) {
            for (int j = i+1; j < lista.size (); j++) {
                if (lista.get (j).equalsIgnoreCase (lista.get (i))){
                    lista.remove (j);
                }
            }
        }
        return lista;
    }

    static List<String> listaBezDuplikata2(List<String> lista){  // sa pravljenjem nove liste

        List<String> jedinstvenaLista = new ArrayList<> ();

        for (int i = 0; i < lista.size (); i++) {
            for (int j = i+1; j < lista.size (); j++) {
                if (lista.get (j).equalsIgnoreCase (lista.get (i))){
                    lista.remove (j);
                }
            }
            jedinstvenaLista.add (lista.get (i));
        }
        return jedinstvenaLista;
    }
    public static void main(String[] args) {

        List<String> lista = new ArrayList<> (Arrays.asList ("Ana","Ana", "mama", "Paki", "Paki", "Dunja", "tata","tata", "Dalibor"));

        System.out.println (listaBezDuplikata (lista));
        System.out.println (listaBezDuplikata2 (lista));
    }
}
