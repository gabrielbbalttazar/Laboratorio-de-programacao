public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.nome = "Gabriel";
        cliente.endereco = "Rua Vargas, Nº 40";
        cliente.numeroCartao = 1234;

        System.out.println("Nome: " + cliente.nome);
        System.out.println("Endereço: " + cliente.endereco);
        System.out.println("Nª do cartão: " + cliente.numeroCartao);
    }
}