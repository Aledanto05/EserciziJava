package Studente_esameJava;

public class Main {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Alessio", "D'antonio", 2005);

        Studente studente2 = new Studente("Gigi", "Buffon", 1978);

        System.out.println("--- Schede Studenti ---");

        studente1.stampaScheda();

        studente2.stampaScheda();
    }
}