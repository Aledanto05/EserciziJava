package Lezione4_abstract;

public class Cerchio extends Forma {
    private double raggio;

    public Cerchio (double raggio) {
        this.raggio=raggio;
    }

    @Override
    public double calcolaArea() {
        return Math.PI * (raggio * raggio);
    }



}
