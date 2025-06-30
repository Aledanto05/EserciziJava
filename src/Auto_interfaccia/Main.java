package Auto_interfaccia;

public class Main {
    public static void main(String[] args) {
        AutoIbrida miaAuto = new AutoIbrida(50);

        miaAuto.statoAutoIbrida();

        miaAuto.connetti();
        miaAuto.statoAutoIbrida();
        miaAuto.disconnetti();
        miaAuto.statoAutoIbrida();

        System.out.println("\nEseguo la ricarica dell'auto...");
        miaAuto.ricarica();
        miaAuto.statoAutoIbrida();

        System.out.println("\nCarico la batteria del veicolo base a 20 per dimostrazione...");
        miaAuto.livelloBatteria = 20;
        miaAuto.statoAutoIbrida();
        miaAuto.caricaBatteriaACento();
        miaAuto.statoAutoIbrida();
    }
}