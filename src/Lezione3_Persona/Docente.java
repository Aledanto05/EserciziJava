package Lezione3_Persona;

public class Docente extends Persona {
    int stipendio;
    String materia;

    public Docente(String nome, String cognome, int eta, int stipedio, String materia) {
        super(nome, cognome, eta);
        this.stipendio = stipendio;
        this.materia=materia;
    }

    public int getStipendio() {
        return stipendio;
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Lezione3_Persona.Docente{" +

                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                "stipendio=" + stipendio +
                ", materia='" + materia + '\'' +
                '}';
    }
}
