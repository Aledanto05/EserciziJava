package Coda_Posta;

public class GestionePosta {
    public static void main(String[] args) {
        Posta ufficioPostale = new Posta();
        System.out.println("--- Inizio Simulazione Ufficio Postale ---");

        System.out.println("\nAggiungo persone alla coda:");
        ufficioPostale.entraInCoda(new Persona("Alessio D'Antonio"));
        ufficioPostale.entraInCoda(new Persona("Gabriele Dell'Aquila"));
        ufficioPostale.entraInCoda(new Persona("Danilo Battaglia"));
        ufficioPostale.entraInCoda(new Persona("Paolo Neri")); // Ho mantenuto un quarto nome per avere una coda più lunga

        System.out.println("\n--- Stato attuale della coda ---");
        ufficioPostale.mostraCoda();

        System.out.println("\n--- Prossimo da servire ---");
        ufficioPostale.chiEIlProssimo();

        System.out.println("\n--- Serviamo due persone ---");
        ufficioPostale.servireProssimo();
        ufficioPostale.servireProssimo();

        System.out.println("\n--- Coda rimanente ---");
        ufficioPostale.mostraCoda();

        System.out.println("\n--- Tentativo di servire ulteriori persone ---");
        ufficioPostale.servireProssimo();
        ufficioPostale.servireProssimo();
        ufficioPostale.servireProssimo();

        System.out.println("\n--- Fine Simulazione ---");
    }
}