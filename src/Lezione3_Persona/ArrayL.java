package Lezione3_Persona;

import java.util.*;

public class ArrayL {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Stringa1");
        lista.add("Stringa2");
        lista.add("Stringa3");
        lista.add("Stringa4");
        lista.add("Stringa5");

        lista.remove(2);

        lista.set(3, "NuovaStringaconset");

        System.out.println(lista);
    }
}
