package Lezione4_abstract;

public class Triangolo extends Forma {
    private double base;
    private double altezza;

    @Override
    public double calcolaArea() {
        return base*altezza/2;
    }
}
