public class Livro extends Produto {

    String autor;
    int ano;
    boolean disponibilidades;
    double preco;

    public Livro(String autor, int ano, Boolean disponibilidaes, String titulo, double preco) {
        this.setTitulo(titulo);
        this.autor = autor;
        this.ano = ano;
        this.disponibilidades = disponibilidaes;
        this.preco = preco;
    }

    String detalhesDoProduto() {

        String disponivel;

        if (disponibilidades) {
            disponivel = "Disponível";
        } else {
            disponivel = "Indisponível";
        }

        return "Título: " + getTitulo() + " | Autor: " + autor + " | Ano: " + ano;
    }

    String detalhesDoProduto(double preco) {
        this.preco = preco;

        String disponivel;

        if (disponibilidades) {
            disponivel = "Disponível";
        } else {
            disponivel = "Indisponível";
        }

        return "Título: " + getTitulo() + " | Autor: " + autor + " | Ano: " + ano + " | Preço: " + preco;
    }

}
