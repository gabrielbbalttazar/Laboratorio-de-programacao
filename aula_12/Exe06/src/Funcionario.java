public abstract class Funcionario {

    String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    double multiplicaDoisValores(double v1, double v2) {
        return v1 * v2;

    }

    abstract void calcularSalario();

    abstract void realizarTarefa();

    abstract double calcularHoraTrabalhada(double hora, double valor);


}
