package br.com.amcosta.learnjava.collections;

import java.util.HashMap;
import java.util.Map;

public class ExercicioIterandoSobreMapa {

    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();
        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");

        pessoas.forEach((idade, nome) -> System.out.println(String.format("Nome: %s, idade: %d", nome, idade)));

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        System.out.println("Iterando sobre o nome: ");
        nomesParaIdade.keySet().forEach(nome -> System.out.println(nome));

        System.out.println("Iterando sobre a idade: ");
        nomesParaIdade.values().forEach(idade -> System.out.println(idade));
    }
}
