package org.trabalhofinal;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.trabalhofinal.model.*;

import java.util.Arrays;

public class AppTest
{
    Disciplina disciplina;
    Aluno aluno;
    Trabalho trabalho;
    Prova prova;
    ComposicaoNota composicaoNota;



    @Test
    public void calculaNotaFinal()
    {
        disciplina = new Disciplina("Português");
        aluno = new Aluno("Joao");
        trabalho = new Trabalho(10, 5, disciplina);
        prova = new Prova(10, 5, disciplina);
        composicaoNota = new ComposicaoNota(disciplina, aluno, Arrays.asList(trabalho), Arrays.asList(prova));

       Number notaFinal = composicaoNota.calculaNotaFinal();

       assertEquals(notaFinal, 5);
    }

    @Test
    public void testeStatusAprovado() {
        disciplina = new Disciplina("Português");
        aluno = new Aluno("Joao");
        trabalho = new Trabalho(10, 5, disciplina);
        prova = new Prova(10, 5, disciplina);
        composicaoNota = new ComposicaoNota(disciplina, aluno, Arrays.asList(trabalho), Arrays.asList(prova));

        String status = composicaoNota.retornaStatus();

        assertEquals("Aprovado!", status);
    }

    @Test
    public void testeStatusReprovado() {
        disciplina = new Disciplina("Português");
        aluno = new Aluno("Joao");
        trabalho = new Trabalho(10, 1, disciplina);
        prova = new Prova(10, 3, disciplina);
        composicaoNota = new ComposicaoNota(disciplina, aluno, Arrays.asList(trabalho), Arrays.asList(prova));

        String status = composicaoNota.retornaStatus();

        assertEquals("Reprovado!", status);
    }
}
