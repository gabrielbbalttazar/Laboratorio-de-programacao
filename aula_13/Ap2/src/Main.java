public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Jeremia", 580, true, "1 Reis", 100);
        Livro livro2 = new Livro("Moisés", 1512, true, "Gênesis", 100);
        Livro livro3 = new Livro("Samuel", 1100, true, "Juízes", 100);
        Livro livro4 = new Livro("Moisés", 1512, true, "Êxodo", 100);
        Livro livro5 = new Livro("Esdras", 460, true, "Crônicas", 100);

        biblioteca.adicionarUmLivro(livro1);
        biblioteca.adicionarUmLivro(livro2);
        biblioteca.adicionarUmLivro(livro3);
        biblioteca.adicionarUmLivro(livro4);
        biblioteca.adicionarUmLivro(livro5);

        System.out.println("Lista de livros adicionados a Biblioteca: ");

        biblioteca.listarLivros();

        System.out.println("=================================================================================================================================");
        System.out.println("Exibindo lista de livros com suas disponibilidades:");

        biblioteca.verificarDispobinilidade();

        System.out.println("=================================================================================================================================");
        System.out.println("Atualizando a diponibilidade de 2 livros inseridos para indisponível e logo em seguida exibindo a lista com as disponibilidades: ");

        biblioteca.atualizarDetalhesDoLivro(livro2, false);
        biblioteca.atualizarDetalhesDoLivro(livro4, false);

        biblioteca.verificarDispobinilidade();

        System.out.println("=================================================================================================================================");

        System.out.println("Inserindo um novo item substituindo um livro que já tenha sido colocado: ");

        Livro livro6 = new Livro("Davi", 1000, true, "Salmos", 100);
        biblioteca.adicionarUmLivro(livro6);

        biblioteca.listarLivros();

        System.out.println("=================================================================================================================================");

        System.out.println("Removendo um livro e exibindo a lista de disponibilidades: ");

        biblioteca.removerUmLivro(livro3);
        biblioteca.verificarDispobinilidade();

        System.out.println("=================================================================================================================================");

        System.out.println("Exibindo agora a lista de livros com o valor dos preços utilizando a Sobrecarga de Métodos: ");

        biblioteca.listarLivrosComPreco();

        System.out.println("=================================================================================================================================");


    }
}