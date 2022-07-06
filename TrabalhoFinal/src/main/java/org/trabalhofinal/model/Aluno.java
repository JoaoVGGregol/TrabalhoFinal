package org.trabalhofinal.model;

public class Aluno {
    private String nome;
    private Number nota;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Number getNota() {
        return nota;
    }

    public void setNota(Number nota) {
        this.nota = nota;
    }
}
