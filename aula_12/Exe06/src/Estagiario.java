public class Estagiario extends Funcionario {

    double valorBolsa;

    void calcularSalario() {
        System.out.println("Calcular salário!");
    }

    void realizarTarefa() {
        System.out.println("Realizar Tarefa!");
    }

    public Estagiario(double valorBolsa, String nome) {
        super(nome);
        this.valorBolsa = valorBolsa;

    }

    double calcularHoraTrabalhada(double hora, double valor) {

        return (hora * valor) + valorBolsa;
    }
}
