package Divisione;
import java.util.Scanner;

public class Divisione {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il primo numero intero (dividendo): ");
        int numero1 = input.nextInt();

        System.out.print("Inserisci il secondo numero intero (divisore): ");
        int numero2 = input.nextInt();

        try {
            int risultato = numero1 / numero2;
            System.out.println("Il risultato intero della divisione è: " + risultato);
        } catch (ArithmeticException e) {
            System.out.println("Errore: Impossibile dividere per zero.");
        }finally{
            input.close();
        }
    }
}