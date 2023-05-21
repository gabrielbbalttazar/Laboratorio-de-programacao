public class Main {
    public static void main(String[] args) {

        Gerente g1 = new Gerente("Gabriel");

        Vendedor v1 = new Vendedor(500, "gustavo");
        double salario;
        salario = v1.calcularHoraTrabalhada(50, 50);
        System.out.println("salário " + salario);
        System.out.println(g1.nome);
        g1.realizarTarefa();
        g1.setSetor("vendas",true);
    }
}