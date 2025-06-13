package ES_Utentepermessi;
public class Main {
    public static void main(String[] args) {
        Admin admin1 = new Admin("Alessio", "aledanto05@email.com");
        Admin admin2 = new Admin("Gabriele", "gabriele009@email.com");

        Cliente cliente1 = new Cliente("Danilo", "danilo28@email.com");
        Cliente cliente2 = new Cliente("Veronica", "veronica@email.com");

        GestioneUtenti Utenti = new GestioneUtenti();
        Utenti.aggiungiUtente(admin1);
        Utenti.aggiungiUtente(admin2);
        Utenti.aggiungiUtente(cliente1);
        Utenti.aggiungiUtente(cliente2);

        Utenti.stampaPermessi();
    }
}
