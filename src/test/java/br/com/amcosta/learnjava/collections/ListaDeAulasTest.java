package br.com.amcosta.learnjava.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListaDeAulasTest {

    private List construirListaPadrao() {
        List<Aula> aulas = new ArrayList<>();
        aulas.add(new Aula("Revistando as ArrayLists", 21));
        aulas.add(new Aula("Listas de objetos", 20));
        aulas.add(new Aula("Relacionamento de listas e objetos", 15));

        return aulas;
    }

    @Test
    public void testVerificarMetodoToString() {
        List<Aula> aulas = this.construirListaPadrao();

        Assert.assertTrue(String.format("[Aula: %s, %d minutos]", "Revistando as ArrayLists", 21).equals(aulas.get(0).toString()));
        Assert.assertTrue(String.format("[Aula: %s, %d minutos]", "Listas de objetos", 20).equals(aulas.get(1).toString()));
        Assert.assertTrue(String.format("[Aula: %s, %d minutos]", "Relacionamento de listas e objetos", 15).equals(aulas.get(2).toString()));
    }

    @Test
    public void testOrdenarListaPeloTempo() {
        List<Aula> aulas = this.construirListaPadrao();
        aulas.sort(Comparator.comparing(Aula::getTempo));

        Assert.assertEquals(15, aulas.get(0).getTempo());
        Assert.assertEquals(20, aulas.get(1).getTempo());
        Assert.assertEquals(21, aulas.get(2).getTempo());
    }

    @Test
    public void testOrdenandoPeloNome() {
        List<Aula> aulas = this.construirListaPadrao();
        Collections.sort(aulas);

        Assert.assertEquals("Listas de objetos", aulas.get(0).getTitulo());
        Assert.assertEquals("Relacionamento de listas e objetos", aulas.get(1).getTitulo());
        Assert.assertEquals("Revistando as ArrayLists", aulas.get(2).getTitulo());
    }
}
