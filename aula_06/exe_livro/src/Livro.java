public class Livro {

    String titulo;
    String autor;
    String editora;
    int numPag;

    void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Numero de páginas: " + numPag);
    }
}
