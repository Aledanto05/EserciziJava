package ES_CLASSE;

import java.util.Scanner;

public class Array_nomi {

    public static void main(String[] args) {
        String[] nomi = {"Alice", "Marco", "Sofia", "Luca", "Chiara"};

        try (Scanner inputScanner = new Scanner(System.in)) {
            System.out.print("Inserisci un numero (da 1 a 5) per visualizzare il nome corrispondente: ");

            try {
                int numeroScelto = inputScanner.nextInt();
                int indiceArray = numeroScelto - 1;

                System.out.println("Il nome nella posizione " + numeroScelto + " è: " + nomi[indiceArray]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Errore: Il numero inserito è maggiore o minore del numero di elementi nell'array.");
                System.err.println("Assicurati di inserire un numero tra 1 e " + nomi.length + ".");
            }
        }
        System.out.println("\nProgramma terminato.");
    }
}