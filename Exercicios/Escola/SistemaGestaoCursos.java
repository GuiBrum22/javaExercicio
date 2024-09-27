package Escola;

import java.util.Scanner;

public class SistemaGestaoCursos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando professor e curso
        Professor professor = new Professor("Dr. João", "12345678901", 5000.0);
        Curso curso = new Curso("Programação Orientada a Objetos", professor);

        int opcao = 0;

        do {
            System.out.println("\nMenu de Gestão de Cursos");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Exibir Informações do Curso");
            System.out.println("3. Calcular Média de Notas");
            System.out.println("4. Exibir Alunos Aprovados/Reprovados");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine(); // Consumir nova linha
                    System.out.print("Nome do Aluno: ");
                    String nomeAluno = scanner.nextLine();
                    System.out.print("CPF do Aluno: ");
                    String cpfAluno = scanner.nextLine();
                    System.out.print("Matrícula do Aluno: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Nota do Aluno: ");
                    double nota = scanner.nextDouble();

                    Aluno aluno = new Aluno(nomeAluno, cpfAluno, matricula, nota);
                    curso.adicionarAluno(aluno);
                    System.out.println("Aluno adicionado com sucesso!");
                    break;

                case 2:
                    curso.exibirInformacoesCurso();
                    break;

                case 3:
                    System.out.println("Média das notas: " + curso.calcularMediaNotas());
                    break;

                case 4:
                    curso.exibirAprovadosReprovados();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
