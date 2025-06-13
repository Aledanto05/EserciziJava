package Lezione3_Persona;

public class Main {
    public static void main(String[] args) {
        Studente s1 = new Studente("Mario", "Rossi", 19, "0000", 7);
        Docente d1= new Docente("Andrea", "Nero", 59, 1350, "italiano" );
        System.out.println(s1.toString());
        System.out.println(d1.toString());


    }
}