package Carrello;
public class Main {
    public static void main(String[] args) {
        Carrello carrello = new Carrello(); 
        carrello.aggiungiProdotto("Tablet");
        carrello.aggiungiProdotto("Cuffie", 3);
        carrello.aggiungiProdotto("Caricabatterie");
        carrello.aggiungiProdotto("Adattatore", 0);

        carrello.mostraCarrello();

        carrello.aggiungiProdotto("Mouse", 2);
        carrello.aggiungiProdotto("Tastiera");

        carrello.mostraCarrello();
    }
}