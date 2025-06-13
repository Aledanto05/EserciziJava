package ES_animali;

class Gatto extends Animale {
    private String nome;
    public Gatto(String nome) {
        this.nome=nome;
    }

    @Override
    public void emettiVerso() {
        System.out.println("Miao!");
    }
}