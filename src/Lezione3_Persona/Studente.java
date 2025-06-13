package Lezione3_Persona;

public class Studente extends Persona {
    String id;
    float media;

    public Studente(String nome, String cognome, int eta, String id, float media) {
        super(nome, cognome, eta);
        this.id = id;
        this.media = media;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Lezione3_Persona.Studente{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", media=" + media +
                '}';
    }
}
