package Carrello;

import java.util.ArrayList;
import java.util.List;


public class Carrello {
    private List<String> prodotti;

    public Carrello() {
        this.prodotti = new ArrayList<>();
    }

    public void aggiungiProdotto(String nomeProdotto) {
        prodotti.add(nomeProdotto);
        System.out.println("Il prodotto: " + nomeProdotto + " è stato aggiunto");
    }

    public void aggiungiProdotto(String nomeProdotto, int quantita) {
        prodotti.add(nomeProdotto + " (Qtà: " + quantita + ")");
        System.out.println("Aggiunto: " + nomeProdotto + " (Qtà: " + quantita + ")");
    }

    public void mostraCarrello() {

        System.out.println("\n--- Carrello ---");
        for (String prodotto : prodotti) {
            System.out.println("- " + prodotto);
        }
        System.out.println("----------------");
    }
}