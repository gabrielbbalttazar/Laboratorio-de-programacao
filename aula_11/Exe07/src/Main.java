public class Main {
    public static void main(String[] args) {
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel();
        produtoPerecivel.codigo = 1010;
        produtoPerecivel.preco = 12.50;
        produtoPerecivel.dataDeValidade = "05/06/2023";


        System.out.println("Códidgo do produto: " + produtoPerecivel.codigo);
        System.out.println("Preço: R$" + produtoPerecivel.preco);
        System.out.println("Data de validade: " + produtoPerecivel.dataDeValidade);
    }
}