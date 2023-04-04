import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro();

        Scanner titulo = new Scanner(System.in);
        System.out.println("Digite o Título do Livro: ");
        livro1.titulo = titulo.next();

        Scanner autor = new Scanner(System.in);
        System.out.println("Digite o Autor do Livro: ");
        livro1.autor = autor.next();

        Scanner editora = new Scanner(System.in);
        System.out.println("Digite a editora do Livro: ");
        livro1.editora = editora.next();

        Scanner numPag = new Scanner(System.in);
        System.out.println("Digite o número de páginas do Livro: ");
        livro1.numPag = numPag.nextInt();

        livro1.exibirDetalhes();
    }
}