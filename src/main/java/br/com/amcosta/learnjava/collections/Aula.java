package br.com.amcosta.learnjava.collections;

public class Aula implements Comparable {

    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return String.format("[Aula: %s, %d minutos]", this.titulo, this.tempo);
    }

    @Override
    public int compareTo(Object o) {
        Aula aula = (Aula) o;
        return this.titulo.compareTo(aula.titulo);
    }
}
