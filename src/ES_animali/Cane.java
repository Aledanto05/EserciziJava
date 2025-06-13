package ES_animali;

class Cane extends Animale {
    private String nome;
    public Cane(String nome) {
        this.nome=nome;
    }

    @Override
    public void emettiVerso() {
        System.out.println("Bau!");
    }
}