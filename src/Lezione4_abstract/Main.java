package Lezione4_abstract;

public class Main {
    public static void main(String[] args) {
        Cerchio c = new Cerchio(5);
        double areaCerchio = c.calcolaArea();
        System.out.println("L'area del cerchio è:"+areaCerchio);

        Rettangolo rettangolo = new Rettangolo(5,10);
        double areaRettangolo = rettangolo.calcolaArea();
        System.out.println("L'area del rettangolo è:" +areaRettangolo);
    }
}
