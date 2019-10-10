package br.com.amcosta.learnjava.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CursoTest {

    private List construirAulas() {
        List<Aula> aulas = new ArrayList<>();
        aulas.add(new Aula("Revistando as ArrayLists", 21));
        aulas.add(new Aula("Listas de objetos", 20));
        aulas.add(new Aula("Relacionamento de listas e objetos", 15));

        return aulas;
    }

    private Curso construirCurso() {
        Curso curso = new Curso("Dominando Coleções", "Paulo Silveira");

        List<Aula> aulas = this.construirAulas();
        for (Aula aula : aulas) {
            curso.adicionar(aula);
        }

        return curso;
    }

    @Test
    public void testDeveAdicionarAulas() {
        Curso curso = this.construirCurso();
        Assert.assertEquals(3, curso.getAulas().size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testNaoDeveModificarAListaDeAulas() {
        Curso curso = this.construirCurso();
        List<Aula> aulas = curso.getAulas();
        aulas.add(new Aula("Nova aula", 9));
    }
}
