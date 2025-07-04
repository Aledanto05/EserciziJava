package Sistema_autenticazione_esameJava;

public interface Autenticabile {
    void autentica(String password) throws AutenticazioneException;
}