package Calcolatrice;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Calcolatrice calcolatrice = new Calcolatrice();
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("SOMMA NUMERI INTERI");
        System.out.print("Inserisci il primo numero intero: ");
        int int1 = inputScanner.nextInt();
        System.out.print("Inserisci il secondo numero intero: ");
        int int2 = inputScanner.nextInt();
        int sommaDueInteri = calcolatrice.sum(int1, int2);
        System.out.println("Somma di " + int1 + " + " + int2 + ": " + sommaDueInteri);
        System.out.println();

        System.out.print("Inserisci il terzo numero intero (per la somma a tre): ");
        int int3 = inputScanner.nextInt();
        int sommaTreInteri = calcolatrice.sum(int1, int2, int3);
        System.out.println("Somma di " + int1 + " + " + int2 + " + " + int3 + ": " + sommaTreInteri);
        System.out.println();

        System.out.println("SOMMA 2 DOUBLE");
        System.out.print("Inserisci il primo numero decimale (es. 15,5): ");
        double double1 = inputScanner.nextDouble();
        System.out.print("Inserisci il secondo numero decimale (es. 2,3): ");
        double double2 = inputScanner.nextDouble();
        double sommaDueDouble = calcolatrice.sum(double1, double2);
        System.out.println("Somma di " + double1 + " + " + double2 + ": " + sommaDueDouble);
        System.out.println();


        System.out.println("CONCATENAZIONE DI DUE STRINGHE");
        System.out.print("Inserisci la prima stringa: ");
        String stringa1 = inputScanner.nextLine();
        System.out.print("\n Inserisci la seconda stringa: ");
        String stringa2 = inputScanner.nextLine();
        String stringaConcatenata = calcolatrice.sum(stringa1, stringa2);
        System.out.println("Concatenazione di \"" + stringa1 + "\" + \"" + stringa2 + "\": " + stringaConcatenata);
        System.out.println();

    }
}
