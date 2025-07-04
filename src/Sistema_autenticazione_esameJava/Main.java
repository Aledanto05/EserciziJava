package Sistema_autenticazione_esameJava;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Alessio", "alessio.d@mail.com", "A280924");
        Studente studente2 = new Studente("Veronica", "veronica.r@mail.com", "V987654");
        Studente studente3 = new Studente("Cristiano", "cristiano.r@mail.com", "CR7000");

        Professore professore1 = new Professore("Gabriele", "gabriele.d@mail.com", "Fisica");
        Professore professore2 = new Professore("Marco", "marco.m@mail.com", "Storia dell'Arte");
        Professore professore3 = new Professore("Lionel", "lionel.m@mail.com", "Economia");
        Segreteria segreteria1 = new Segreteria("Danilo", "danilo.b@mail.com", "Ufficio Esami");
        Segreteria segreteria2 = new Segreteria("Lamine", "lamine.y@mail.com", "Ufficio Orientamento");
        Utente utenteGenerico1 = new Utente("Simone", "simone.d@mail.com");



        ArrayList<Utente> listaUtenti = new ArrayList<>();

        listaUtenti.add(studente1);
        listaUtenti.add(professore1);
        listaUtenti.add(segreteria1);
        listaUtenti.add(professore2);
        listaUtenti.add(studente2);
        listaUtenti.add(utenteGenerico1);
        listaUtenti.add(studente3);
        listaUtenti.add(professore3);
        listaUtenti.add(segreteria2);

        System.out.println("--- Gestione Utenti ---");

        for (Utente utente : listaUtenti) {
            utente.presentati();
        }
    }
}