package br.com.amcosta.learnjava.collections;

import javax.swing.plaf.synth.SynthSliderUI;
import java.lang.reflect.Array;
import java.util.*;

public class TestaPerformanceSet {

    public static void main(String[] args) {

        Collection<Integer> numeros = new LinkedList<>();
        long inicio  = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {
            numeros.add(i);
        }
        System.out.println(String.format("Tempo gasto na inserção : %d", System.currentTimeMillis() - inicio));

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        System.out.println(String.format("Tempo gasto: %d", System.currentTimeMillis() - inicio));
    }
}
