package br.com.amcosta.learnjava.collections;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Nico");

        alunos.forEach(aluno -> System.out.println(aluno));
        System.out.println(String.format("Tamaho da coleção: %d", alunos.size()));

        alunos.add("Paulo");
        alunos.add("Alberto");
        System.out.println(String.format("Tamaho da coleção: %d", alunos.size()));
    }
}
