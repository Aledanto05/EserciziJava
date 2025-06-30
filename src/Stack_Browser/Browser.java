package Stack_Browser;
import java.util.Stack;

public class Browser {
    private Stack<String> cronologia;

    public Browser() {
        this.cronologia = new Stack<>();
    }

    // IL NOME DEL METODO QUI DEVE ESSERE 'PaginaVisitata'
    public void PaginaVisitata(String url) {
        cronologia.push(url);
        System.out.println("Visitato: " + url);
    }

    public void goBack() {
        if (cronologia.size() <= 1) {
            System.out.println("Nessuna pagina precedente.");
            if (!cronologia.isEmpty()) {
                System.out.println("Sei sulla prima pagina visitata: " + cronologia.peek());
            }
        } else {
            String paginaCorrente = cronologia.pop();
            String paginaPrecedente = cronologia.peek();
            System.out.println("Tornato indietro da " + paginaCorrente + " a: " + paginaPrecedente);
        }
    }

    public void printHistory() {
        if (cronologia.isEmpty()) {
            System.out.println("La cronologia è vuota.");
            return;
        }
        System.out.println("\n--- Cronologia di Navigazione (dal più recente al meno recente) ---");
        for (String url : cronologia) {
            System.out.println("- " + url);
        }
        System.out.println("------------------------------------------------------------------");
    }
}