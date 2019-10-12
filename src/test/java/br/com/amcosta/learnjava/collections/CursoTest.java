package br.com.amcosta.learnjava.collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CursoTest {

    private Curso curso;

    @Before
    public void setUpBefore() {
        this.curso = this.construirCurso();
    }

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

    @Test
    public void testOrdenandoAsAulasPeloNome() {
        Curso curso = this.construirCurso();
        List<Aula> aulas = new ArrayList<>(curso.getAulas());

        Collections.sort(aulas);

        Assert.assertEquals("Listas de objetos", aulas.get(0).getTitulo());
        Assert.assertEquals("Relacionamento de listas e objetos", aulas.get(1).getTitulo());
        Assert.assertEquals("Revistando as ArrayLists", aulas.get(2).getTitulo());
    }

    @Test
    public void testSomarOTempoDasAulasParaOCurso() {
        Curso curso = this.construirCurso();
        Assert.assertEquals(56, curso.getTempoTotal());
    }

    @Test
    public void testCursoToString() {
        Curso curso = this.construirCurso();
        Assert.assertEquals("Curso: Dominando Coleções, tempo: 56", curso.toString());
    }

    @Test
    public void testAdicionarAlunosAoCurso() {
        this.curso.matricular(new Aluno("Alex Moreno", 123));
        this.curso.matricular(new Aluno("Talita Rodrigues", 456));
        this.curso.matricular(new Aluno("Danilo Costa", 789));

        Assert.assertEquals(3, this.curso.getAlunos().size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testNaoDeveModificarAListaDeAlunos() {
        Set<Aluno> alunos = this.curso.getAlunos();
        alunos.add(new Aluno("Neymar Santos", 111));
    }
}
