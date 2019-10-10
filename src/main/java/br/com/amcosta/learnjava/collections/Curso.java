package br.com.amcosta.learnjava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

    private String nome;
    private List<Aula> aulas = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public void adicionar(Aula aula) {
        aulas.add(aula);
    }

    public List getAulas() {
        return Collections.unmodifiableList(aulas);
    }


}
