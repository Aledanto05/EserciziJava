package ES_animali;

import java.util.ArrayList;

public class Rifugio {
    ArrayList<Animale> lista_animali;

    public Rifugio(){
        lista_animali= new ArrayList<>();
    }

    public void aggiungiAnimale (Animale a) {
        lista_animali.add(a);
    }
    public void stampaVersi() {
        for (Animale a : lista_animali) {
            a.descrizione();
            a.emettiVerso();
        }
    }
}
