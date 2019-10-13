package br.com.amcosta.learnjava.collections;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> alunosMatriculados = new HashMap<>();

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

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
        this.alunosMatriculados.put(aluno.getMatricula(), aluno);
    }

    public Set getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    @Override
    public String toString() {
        return String.format("Curso: %s, tempo: %d", nome, getTempoTotal());
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(int matricula) {
        return this.alunosMatriculados.get(matricula);
    }
}
