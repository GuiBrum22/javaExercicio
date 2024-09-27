package Escola;

public class Aluno extends Pessoa implements Avaliavel {
    private String matricula;
    private double nota;

    // Construtor
    public Aluno(String nome, String cpf, String matricula, double nota) {
        super(nome, cpf);
        this.matricula = matricula;
        this.nota = nota;
    }

    // Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Sobrescrita do método exibirInformacoes
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota: " + nota);
    }

    // Implementação do método avaliarDesempenho
    @Override
    public void avaliarDesempenho() {
        if (nota >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else if(nota>=5 && nota<7){
            System.out.println("Recuperação!"); 
        }else{
            System.out.println("Aluno reprovado!");
        }
    }
}
