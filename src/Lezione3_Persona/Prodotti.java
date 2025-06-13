package Lezione3_Persona;

import java.time.LocalDate;

public class Prodotti {
    private String nome;
    private String marca;
    private double prezzo;
    private LocalDate scadenza;

    public Prodotti(String nome, String marca, double prezzo, LocalDate scadenza) {
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.scadenza = scadenza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public LocalDate getScadenza() {
        return scadenza;
    }

    public void setScadenza(LocalDate scadenza) {
        this.scadenza = scadenza;
    }

    public boolean isScaduto() {
        return scadenza.isBefore(LocalDate.now());
    }

    public boolean isExpired(LocalDate dataes) {
        return scadenza.isBefore(dataes);
    }


    @Override
    public String toString() {
        return "Lezione3_Persona.Prodotti{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", prezzo=" + prezzo + '€' +
                ", scadenza=" + scadenza +
                '}';
    }
}
