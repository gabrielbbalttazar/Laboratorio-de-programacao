public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "João Augusto";
        funcionario.idade = 25;
        funcionario.cargo = "Contador";

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Idade: " + funcionario.idade);
        System.out.println("Cargo: " + funcionario.cargo);

    }
}