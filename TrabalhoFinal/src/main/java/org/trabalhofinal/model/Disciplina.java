package org.trabalhofinal.model;

import java.util.List;

public class Disciplina {
    private String nome;
    private List<Aluno> alunos;
    private List<ComposicaoNota> composicaoNotas;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<ComposicaoNota> getComposicaoNotas() {
        return composicaoNotas;
    }

    public void setComposicaoNotas(List<ComposicaoNota> composicaoNotas) {
        this.composicaoNotas = composicaoNotas;
    }
}
