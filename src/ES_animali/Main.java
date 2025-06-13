package ES_animali;

abstract class Main {
    public static void main(String[] args) {
        Cane c1 = new Cane("ciccio");
        Gatto g1=new Gatto("pippo");

        Rifugio r1=new Rifugio();
        r1.aggiungiAnimale(c1);
        r1.aggiungiAnimale(g1);

        r1.stampaVersi();
    }
}

