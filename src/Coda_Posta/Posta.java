package Coda_Posta;
import java.util.LinkedList;
import java.util.Queue;

public class Posta {
    private Queue<Persona> coda;

    public Posta() {
        this.coda = new LinkedList<>();
    }

    public void entraInCoda(Persona p) {
        coda.offer(p);
        System.out.println(p.getNome() + " è entrato in coda.");
    }

    public void chiEIlProssimo() {
        Persona prossimo = coda.peek();
        if (prossimo != null) { // Controllo aggiunto
            System.out.println("Il prossimo da servire è: " + prossimo.getNome());
        } else {
            System.out.println("La coda è vuota, nessun prossimo da servire."); // Messaggio per coda vuota
        }
    }

    public void servireProssimo() {
        Persona servito = coda.poll();
        if (servito != null) { // Controllo aggiunto
            System.out.println(servito.getNome() + " è stato servito.");
        } else {
            System.out.println("La coda è vuota, nessuno da servire."); // Messaggio per coda vuota
        }
    }

    public void mostraCoda() {
        if (coda.isEmpty()) { // Controllo aggiunto per mostrare messaggio specifico
            System.out.println("La coda è attualmente vuota.");
            return;
        }
        System.out.println("Persone in coda:");
        int i = 1;
        for (Persona p : coda) {
            System.out.println(i + ". " + p.getNome());
            i++;
        }
    }
}