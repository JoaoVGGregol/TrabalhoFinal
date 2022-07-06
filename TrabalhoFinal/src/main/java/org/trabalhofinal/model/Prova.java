package org.trabalhofinal.model;

public class Prova {

    private Integer peso;
    private Integer nota;
    private Disciplina disciplina;

    public Prova(Integer peso, Integer nota, Disciplina disciplina) {
        this.peso = peso;
        this.nota = nota;
        this.disciplina = disciplina;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
