package org.trabalhofinal.model;

import java.util.List;

public class ComposicaoNota {

    private Disciplina disciplina;
    private Aluno aluno;
    private List<Trabalho> trabalhos;
    private List<Prova> prova;

    public ComposicaoNota( Disciplina disciplina, Aluno aluno, List<Trabalho> trabalhos, List<Prova> prova) {
        this.disciplina = disciplina;
        this.aluno = aluno;
        this.trabalhos = trabalhos;
        this.prova = prova;
    }
    public Number calculaNotaFinal() {
        Integer notaTrabalhos = 0;
        Integer notaProva = 0;
        Integer pesoTrabalho = 0;
        Integer pesoProva = 0;
        Integer pesoFinal = 0;
        Integer notaFinal = 0;


        for (Trabalho trabalho : this.getTrabalhos()) {
             notaTrabalhos += trabalho.getNota().intValue();
             pesoTrabalho = trabalho.getPeso().intValue();
        }
        for (Prova prova : this.getProva()){
            notaProva += prova.getNota().intValue();
            pesoProva = prova.getPeso().intValue();
        }

        pesoFinal = (pesoProva + pesoTrabalho)  / 2;
        notaFinal = notaProva + notaTrabalhos;

        return notaTrabalhos;
    }

    public String retornaStatus(){
        Integer notaFinal = 0;
        notaFinal = this.getTrabalhos().get(0).getNota().intValue() + this.getProva().get(0).getNota().intValue();
        if (notaFinal >= 5) {
            return "Aprovado!";
        } else {
            return "Reprovado!";
        }

    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<Trabalho> getTrabalhos() {
        return trabalhos;
    }

    public void setTrabalhos(List<Trabalho> trabalhos) {
        this.trabalhos = trabalhos;
    }

    public List<Prova> getProva() {
        return prova;
    }

    public void setProva(List<Prova> prova) {
        this.prova = prova;
    }
}
