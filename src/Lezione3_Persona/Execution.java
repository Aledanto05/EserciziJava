package Lezione3_Persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class Execution {
    public static void main(String[] args) {
        ArrayList<Prodotti> listaProdotti = new ArrayList<>();

        listaProdotti.add(new Prodotti("Latte", "Parmalat", 1.49, LocalDate.of(2025, 7, 1)));
        listaProdotti.add(new Prodotti("Pasta", "Barilla", 0.99, LocalDate.of(2026, 1, 10)));
        listaProdotti.add(new Prodotti("Biscotti", "Mulino Bianco", 2.59, LocalDate.of(2025, 9, 15)));
        listaProdotti.add(new Prodotti("Pane", "Mulino Bianco", 1.20, LocalDate.of(2025, 6, 10)));
        listaProdotti.add(new Prodotti("Yogurt", "Danone", 0.89, LocalDate.of(2025, 6, 20)));
        listaProdotti.add(new Prodotti("Succo di frutta", "Valfrutta", 1.99, LocalDate.of(2025, 10, 5)));
        listaProdotti.add(new Prodotti("Olio d'oliva", "Monini", 4.50, LocalDate.of(2026, 3, 1)));
        listaProdotti.add(new Prodotti("Cioccolato", "Perugina", 2.10, LocalDate.of(2025, 12, 25)));
        listaProdotti.add(new Prodotti("Riso", "Scotti", 1.75, LocalDate.of(2025, 8, 30)));
        listaProdotti.add(new Prodotti("Caffè", "Lavazza", 3.99, LocalDate.of(2026, 2, 14)));

        System.out.println("METODO 1");
        LocalDate data= LocalDate.of(2025,8,27);
        for (Prodotti p : listaProdotti) {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Marca: " + p.getMarca());
            System.out.println("Prezzo: " + p.getPrezzo() + " €");
            System.out.println("Scadenza: " + p.getScadenza());
            if (p.isExpired(data)){
            System.out.println("Prodotto SCADUTO");
             } else {
            System.out.println("Prodotto valido");
             }
            System.out.println("***********************");
        }

        System.out.println("METODO 2");
        for (Prodotti p : listaProdotti) {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Marca: " + p.getMarca());
            System.out.println("Prezzo: " + p.getPrezzo() + " €");
            System.out.println("Scadenza: " + p.getScadenza());

            if (p.getScadenza().isBefore(LocalDate.now())) {
                System.out.println("Prodotto SCADUTO");
            } else {
                System.out.println("Prodotto valido");
            }

            System.out.println("-----------------------------");
        }

    }



}
