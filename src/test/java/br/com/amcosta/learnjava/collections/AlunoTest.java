package br.com.amcosta.learnjava.collections;

import org.junit.Test;

public class AlunoTest {

    @Test(expected = NullPointerException.class)
    public void testConstrutorDeAluno() {
        new Aluno(null, 1234);
    }
}
