package br.com.amcosta.learnjava.collections;

import java.util.Comparator;

public class OrdenarPorIdade implements Comparator {

    @Override
    public int compare(Object o, Object t1) {
        Funcionario f1 = (Funcionario) o;
        Funcionario f2 = (Funcionario) t1;

        return Integer.compare(f1.getIdade(), f2.getIdade());
    }
}
