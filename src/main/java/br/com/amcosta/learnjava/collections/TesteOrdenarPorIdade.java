package br.com.amcosta.learnjava.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteOrdenarPorIdade {

    public static void main(String[] args) {

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenarPorIdade());
        funcionarios.add(new Funcionario("Barney", 12));
        funcionarios.add(new Funcionario("Jonatan", 9));
        funcionarios.add(new Funcionario("Guaraciara", 13));

        Iterator<Funcionario> iterator = funcionarios.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getNome());
        }
    }
}
