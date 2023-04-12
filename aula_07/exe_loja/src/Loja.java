public class Loja {
    Produto produto1;
    Produto produto2;
    Produto produto3;

    void adicionarProduto(Produto produto) {
        if (produto1 == null) {
            this.produto1 = produto;
        } else if (produto2 == null) {
            this.produto2 = produto;
        } else if (produto3 == null) {
            this.produto3 = produto;
        } else System.out.println("Estoque Cheio!");
    }

    void removerProduto(Produto produto) {
        if (produto == produto1) {
            this.produto1 = null;
        } else if (produto == produto2) {
            this.produto2 = null;
        } else if (produto == produto3) {
            this.produto3 = null;
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    void listarProduto() {
        if (produto1 != null){
            System.out.println("Produto: " + produto1.nome + " | Quantidade: " + produto1.quantidade);
        }
        if (produto2 != null){
            System.out.println("Produto: " + produto2.nome + " | Quantidade: " + produto2.quantidade);
        }
        if (produto3 != null){
            System.out.println("Produto: " + produto3.nome + " | Quantidade: " + produto3.quantidade);
        }

    }

    void venderProduto(Produto produto, int quantidade) {
        if (produto == produto1 && quantidade <= produto1.quantidade) {
            this.produto1.quantidade = produto1.quantidade - quantidade;
        } else if (produto == produto2 && quantidade <= produto2.quantidade) {
            this.produto2.quantidade = produto2.quantidade - quantidade;
        } else if (produto == produto3 && quantidade <= produto3.quantidade) {
            this.produto3.quantidade = produto3.quantidade - quantidade;
        } else {
            System.out.println("Estoque Insuficiente");
        }
    }

    void adicionarEstoque(Produto produto, int quantidade) {
        if (produto == produto1) {
            this.produto1.quantidade = produto1.quantidade + quantidade;
        } else if (produto == produto2) {
            this.produto2.quantidade = produto2.quantidade + quantidade;
        } else if (produto == produto3) {
            this.produto3.quantidade = produto3.quantidade + quantidade;
        } else {
            System.out.println("Produtos inexistentes");
        }
    }
}
