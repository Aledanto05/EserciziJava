package Scuola_esameJava;

public class Studente extends Persona {
    private String matricola;

    public Studente(String nome, String cognome, String matricola) {
        super(nome, cognome);
        this.matricola = matricola;
    }

    @Override
    public void presentati() {
        System.out.println("Mi chiamo " + nome + " " + cognome + "e la mia matricola è: " + matricola);
    }
}

