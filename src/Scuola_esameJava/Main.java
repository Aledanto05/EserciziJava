package Scuola_esameJava;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Alessio", "D'antonio", "A280924");
        Studente studente2 = new Studente("Gabriele", "Dell'Aquila", "G361832");
        Studente studente3 = new Studente("Danilo", "Battaglia", "D345687");
        Professore professore1 = new Professore("Marco", "Mazzotta", "Matematica");
        Professore professore2 = new Professore("Veronica", "Raffa", "Informatica");
        Professore professore3 = new Professore("Simone", "Di Fede", "Inglese");
        Persona personaGenerica1 = new Persona("Cristiano", "Ronaldo");
        Persona personaGenerica2 = new Persona("Lionel", "Messi");
        Persona personaGenerica3 = new Persona("Lamine", "Yamal");

        ArrayList<Persona> scuola = new ArrayList<>();

        scuola.add(studente1);
        scuola.add(studente2);
        scuola.add(studente3);

        scuola.add(professore1);
        scuola.add(professore2);
        scuola.add(professore3);

        scuola.add(personaGenerica1);
        scuola.add(personaGenerica2);
        scuola.add(personaGenerica3);

        System.out.println("--- Presentazione delle Persone nella scuola: ---");
        for (Persona p : scuola) {
            p.presentati();
        }
    }
}