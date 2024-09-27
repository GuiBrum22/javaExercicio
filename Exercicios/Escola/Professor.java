package Escola;

public class Professor extends Pessoa implements Avaliavel {
    private double salario;

    // Construtor
    public Professor(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    // Getter e Setter
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Sobrescrita do método exibirInformacoes
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Salário: " + salario);
    }

    // Implementação do método avaliarDesempenho
    @Override
    public void avaliarDesempenho() {
        System.out.println("Professor avaliado pelo desempenho em sala de aula.");
    }
}
