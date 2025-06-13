package ES_animali;

public abstract class Animale {

        private String nome;

        public Animale(String nome) {
            this.nome = nome;
        }

    protected Animale() {
    }

    public void descrizione() {
            System.out.println("Sono un animale di nome " + nome);
        }

        public abstract void emettiVerso();
}
