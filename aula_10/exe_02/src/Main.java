public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Código limpo", "Robert", 20);
        Livro livro2 = new Livro("Todo dia é dia", "Felipe");

        System.out.println("Título: " + livro1.titulo + " | Autor: " + livro1.getAutor() + " | R$" + livro1.preco);
        System.out.println("Título: " + livro2.titulo + " | Autor: " + livro2.getAutor() + " | R$" + livro2.preco);

    }
}