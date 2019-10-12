package br.com.amcosta.learnjava.collections;

import java.util.*;

public class TestandoIterator {

    public static void main(String[] args) {

        List<String> alfabeto = new ArrayList<>();
        alfabeto.add("A");
        alfabeto.add("B");
        alfabeto.add("C");
        alfabeto.add("D");
        alfabeto.add("E");
        alfabeto.add("F");

        Iterator iterator = alfabeto.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
