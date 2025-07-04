package Sistema_autenticazione_esameJava;

public class Studente extends Utente implements Autenticabile {
    private String matricola;

    public Studente(String username, String email, String matricola) {
        super(username, email);
        this.matricola = matricola;
    }

    @Override
    public void presentati() {
        System.out.println("Studente: " + username + ", matricola: " + matricola);
    }

    @Override
    public void autentica(String password) throws AutenticazioneException {
        if (!"studentestevejobs2025".equals(password)) {
            throw new AutenticazioneException("Password errata per lo studente " + username);
        }
        System.out.println("Autenticazione riuscita per lo studente " + username);
    }
}