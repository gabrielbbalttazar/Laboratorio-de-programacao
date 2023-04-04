public class ContaBancaria {

    int numeroDaConta;
    int saldo;
    String titular;

    int dinheiro;

    double depositar() {
        double depositarDinheiro = dinheiro + saldo;
        return depositarDinheiro;
    }

    double sacar() {
        double sacarDinheiro = saldo - dinheiro;
        return sacarDinheiro;
    }

    double transferir() {
        double transferirDinheiro = saldo - dinheiro;
        return transferirDinheiro;
    }
}
