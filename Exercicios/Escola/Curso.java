package Escola;

import java.util.ArrayList;

public class Curso {
    private String nomeCurso;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    // Construtor
    public Curso(String nomeCurso, Professor professor) {
        this.nomeCurso = nomeCurso;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    // Método para adicionar alunos ao curso
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // Método para exibir informações do curso
    public void exibirInformacoesCurso() {
        System.out.println("Curso: " + nomeCurso);
        professor.exibirInformacoes();
        System.out.println("Alunos:");
        for (Aluno aluno : alunos) {
            aluno.exibirInformacoes();
        }
    }

    // Método para calcular a média de notas dos alunos
    public double calcularMediaNotas() {
        double somaNotas = 0;
        for (Aluno aluno : alunos) {
            somaNotas += aluno.getNota();
        }
        return somaNotas / alunos.size();
    }

    // Método para exibir alunos aprovados e reprovados
    public void exibirAprovadosReprovados() {
        for (Aluno aluno : alunos) {
            System.out.print(aluno.getNome() + ": ");
            aluno.avaliarDesempenho();
        }
    }
}
