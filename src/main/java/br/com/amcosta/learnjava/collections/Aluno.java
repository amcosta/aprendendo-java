package br.com.amcosta.learnjava.collections;

public class Aluno {

    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        if (nome.isEmpty()) {
            throw new NullPointerException("O nome do aluno não pode ser vazio");
        }

        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        Aluno aluno = (Aluno) o;
        return this.nome.equals(aluno.nome);
    }

    @Override
    public String toString() {
        return String.format("Aluno: %s, matricula: %d", nome, matricula);
    }
}
