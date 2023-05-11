public class CartaoDebito extends Pagamento {
    void realizarPagamento() {
        System.out.println("Pagamento: Cartão de Dédito!");
    }

    void emitirRecibo() {
        System.out.println("Recibo Cartão de Dédito");
    }
}
