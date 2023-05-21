public class Gerente extends Funcionario {

    private String setor;
    private boolean disponivel;

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setSetor(String setor, boolean disponivel) {
        this.disponivel = disponivel;
        this.setor = setor;
    }


    void calcularSalario() {
        System.out.println("Calcular salário!");
    }

    void realizarTarefa() {
        System.out.println(super.nome + " Realizou a Tarefa!");
    }

    public Gerente(String nome) {
        super(nome);
    }

    double calcularHoraTrabalhada(double hora, double valor) {
        var resultado = super.multiplicaDoisValores(hora, valor);
        return resultado * 2;
    }
}
