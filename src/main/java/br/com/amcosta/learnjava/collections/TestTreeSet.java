package br.com.amcosta.learnjava.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String[] args) {

        Recibo r1 = new Recibo();
        Recibo r2 = new Recibo();
        Recibo r3 = new Recibo();

        Set<Recibo> recibos = new TreeSet<>(Comparator.comparing(Recibo::getNumero));
        recibos.add(r1);
        recibos.add(r2);
        recibos.add(r3);
    }
}
