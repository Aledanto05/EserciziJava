package Stack_Browser;
public class Main {
    public static void main(String[] args) {
        Browser browser = new Browser();

        System.out.println("--- Inizio Simulazione Cronologia Browser ---");

        browser.PaginaVisitata("https://www.google.com");
        browser.PaginaVisitata("https://www.wikipedia.org");
        browser.PaginaVisitata("https://www.youtube.com");

        browser.printHistory();

        System.out.println("\n--- Usiamo il tasto 'Indietro' ---");
        browser.goBack();
        browser.goBack();

        browser.printHistory();

        System.out.println("\n--- Tentativo di tornare ancora indietro ---");
        browser.goBack();
        browser.goBack();

        browser.printHistory();

        System.out.println("\n--- Fine Simulazione ---");
    }
}