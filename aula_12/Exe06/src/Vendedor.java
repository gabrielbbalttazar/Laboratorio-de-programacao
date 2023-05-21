public class Vendedor extends Funcionario {

    double comissao;

    void calcularSalario() {
        System.out.println("Calcular salário!");
    }

    void realizarTarefa() {
        System.out.println("Realizar Tarefa!");
    }

    public Vendedor(double comissao, String nome) {
        super(nome);
        this.comissao = comissao;

    }

    double calcularHoraTrabalhada(double hora, double valor) {

        return (hora * valor) + comissao;
    }
}
