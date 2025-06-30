package Auto_interfaccia;

public class Veicolo {
    protected int livelloBatteria;

    public Veicolo(int livelloBatteriaIniziale) {
        if (livelloBatteriaIniziale < 0 || livelloBatteriaIniziale > 100) {
            System.out.println("Attenzione: Il livello iniziale della batteria deve essere tra 0 e 100.");
            this.livelloBatteria = 0;
        } else {
            this.livelloBatteria = livelloBatteriaIniziale;
        }
    }

    public void caricaBatteriaACento() {
        this.livelloBatteria = 100;
        System.out.println("Batteria del veicolo caricata al 100%.");
    }

    public int getLivelloBatteria() {
        return livelloBatteria;
    }
}