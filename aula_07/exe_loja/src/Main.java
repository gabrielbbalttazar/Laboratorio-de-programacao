public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.nome = "Bolacha";
        produto1.preco = 5;
        produto1.quantidade = 10;

        Produto produto2 = new Produto();
        produto2.nome = "Refrigerante";
        produto2.preco = 8;
        produto2.quantidade = 20;

        Produto produto3 = new Produto();
        produto3.nome = "Chocolate";
        produto3.preco = 5 ;
        produto3.quantidade = 15;

        Loja loja1 = new Loja();

        System.out.println("* Adicionando os produtos a loja: ");

        System.out.println("-------------------------------------------------------------");
        loja1.adicionarProduto(produto1);
        loja1.adicionarProduto(produto2);
        loja1.adicionarProduto(produto3);

        loja1.listarProduto();

        System.out.println("-------------------------------------------------------------");

        loja1.removerProduto(produto3);

        System.out.println("* Listando produtos depois da REMOÇÃO do produto 'Chocolate'!");

        System.out.println("-------------------------------------------------------------");

        loja1.listarProduto();

        System.out.println("-------------------------------------------------------------");

        Produto produto4 = new Produto();
        produto4.nome = "Açucar";
        produto4.preco = 4;
        produto4.quantidade = 5;

        loja1.adicionarProduto(produto4);

        System.out.println("* Listando produtos depois da ADIÇÃO do produto 'Açucar'!");

        System.out.println("-------------------------------------------------------------");

        loja1.listarProduto();

        System.out.println("-------------------------------------------------------------");

        System.out.println("* Vendendo 5 unidades de 'refrigerante'!");

        System.out.println("-------------------------------------------------------------");

        loja1.venderProduto(produto2,5);

        loja1.listarProduto();

        System.out.println("-------------------------------------------------------------");

        System.out.println("* Adicionando 15 unidades de 'refrigerante'!");

        System.out.println("-------------------------------------------------------------");

        loja1.adicionarEstoque(produto2,15);

        loja1.listarProduto();
    }
}