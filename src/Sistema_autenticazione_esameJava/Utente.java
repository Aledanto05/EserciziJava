package Sistema_autenticazione_esameJava;

public class Utente {
    protected String username;
    protected String email;

    public Utente(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void presentati() {
        System.out.println("Utente generico: " + username + ", email: " + email);
    }
}