package ES_Utentepermessi;

import java.util.ArrayList;

class GestioneUtenti {
    private ArrayList<Utente> utenti;

    public GestioneUtenti() {
        utenti = new ArrayList<>();
    }

    public void aggiungiUtente(Utente u) {
        utenti.add(u);
    }

    public void stampaPermessi() {
        for (Utente u : utenti) {
            u.stampaInfo();
            System.out.println("Permessi: " + u.getPermessi());
            System.out.println();
        }
    }
}
