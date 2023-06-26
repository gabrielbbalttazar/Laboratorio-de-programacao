public class Veterinario extends Funcionario {

    String especialidade;

    public Veterinario(String nome, String cargo, double salario, String especialidade) {
        super(nome, cargo, salario);
        this.especialidade = especialidade;
    }


    void realizarExame(Animal animal) {
        System.out.println("O veterinário " + getNome() + " está realizando um exame no " + animal.getEspecie() + ".");
    }
}
