package it.develhope.check_exe_5;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Negozio {

    private String name;
    private List<Articolo> articoli;

    public void addArticolo(Articolo a) {
        articoli.add(a);
    }

    public void removeArticolo(Articolo a) {
        articoli.remove(a);
    }

    public Articolo getArticolo(String name) {
        for (Articolo a : articoli) {
            if (a.getName().equals(name)) {
                return a;
            }
        }
        System.out.println("Articolo non trovato");
        return null;
    }

    public void applicaScontoPerTipo(TipoProdotto tp, double sconto) {
        for (Articolo a : articoli) {
            if (a.getTipoProdotto().equals(tp)) {
                a.applicaSconto(sconto);
            }
        }
    }
    public void salvaCatalogo() {

    }
}