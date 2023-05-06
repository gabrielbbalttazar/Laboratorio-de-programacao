public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.limite = 15000;
        contaCorrente.numero = 1010;
        contaCorrente.saldo = 25000;

        System.out.println("Número da Conta: " + contaCorrente.numero);
        System.out.println("Limite: R$" + contaCorrente.limite);
        System.out.println("Saldo: R$" + contaCorrente.saldo);
    }
}