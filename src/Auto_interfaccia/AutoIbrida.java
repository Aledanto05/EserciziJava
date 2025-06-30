package Auto_interfaccia;

public class AutoIbrida extends Veicolo implements Connettivita, Ricaricabile {
    private boolean connessoBluetooth;

    public AutoIbrida(int livelloBatteriaIniziale) {
        super(livelloBatteriaIniziale);
        this.connessoBluetooth = false;
    }

    @Override
    public void connetti() {
        if (!connessoBluetooth) {
            this.connessoBluetooth = true;
            System.out.println("Auto ibrida connessa al dispositivo Bluetooth.");
        } else {
            System.out.println("Auto ibrida è già connessa.");
        }
    }

    @Override
    public void disconnetti() {
        if (connessoBluetooth) {
            this.connessoBluetooth = false;
            System.out.println("Auto ibrida disconnessa dal dispositivo Bluetooth.");
        } else {
            System.out.println("Auto ibrida è già disconnessa.");
        }
    }

    @Override
    public boolean isConnesso() {
        return connessoBluetooth;
    }

    @Override
    public void ricarica() {
        caricaBatteriaACento();
        System.out.println("Auto ibrida in fase di ricarica... ricarica completata!");
    }

    public void statoAutoIbrida() {
        System.out.println("--- Stato Auto Ibrida ---");
        System.out.println("Livello Batteria: " + getLivelloBatteria() + "%");
        System.out.println("Stato Connessione Bluetooth: " + (isConnesso() ? "Connesso" : "Disconnesso"));
        System.out.println("-------------------------");
    }
}