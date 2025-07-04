package Sistema_autenticazione_esameJava;

public class Professore extends Utente implements Autenticabile {
    private String materia;

    public Professore(String username, String email, String materia) {
        super(username, email);
        this.materia = materia;
    }

    @Override
    public void presentati() {
        System.out.println("Professore: " + username + ", insegna: " + materia);
    }

    @Override
    public void autentica(String password) throws AutenticazioneException {
        if (!"profstevejobs2025".equals(password)) {
            throw new AutenticazioneException("Password errata per il professore " + username);
        }
        System.out.println("Autenticazione riuscita per il professore " + username);
    }
}