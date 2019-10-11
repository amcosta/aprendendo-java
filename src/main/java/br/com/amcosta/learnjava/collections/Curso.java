package br.com.amcosta.learnjava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void adicionar(Aula aula) {
        aulas.add(aula);
    }

    public List getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public int getTempoTotal() {
        return aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return String.format("Curso: %s, tempo: %d", nome, getTempoTotal());
    }
}
