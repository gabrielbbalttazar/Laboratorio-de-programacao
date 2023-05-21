public class Biblioteca {
    Livro livro1;
    Livro livro2;
    Livro livro3;
    Livro livro4;
    Livro livro5;

    void adicionarUmLivro(Livro livro) {
        if (livro1 == null) {
            this.livro1 = livro;
        } else if (livro2 == null) {
            this.livro2 = livro;
        } else if (livro3 == null) {
            this.livro3 = livro;
        } else if (livro4 == null) {
            this.livro4 = livro;
        } else if (livro5 == null) {
            this.livro5 = livro;
        } else {
            livro5 = livro;
        }
    }

    void removerUmLivro(Livro livro) {
        if (livro == livro1) {
            this.livro1 = null;
        } else if (livro == livro2) {
            this.livro2 = null;
        } else if (livro == livro3) {
            this.livro3 = null;
        } else if (livro == livro4) {
            this.livro4 = null;
        } else if (livro == livro5) {
            this.livro5 = null;
        } else {
            System.out.println("A Biblioteca não possui este livro!");
        }
    }

    void atualizarDetalhesDoLivro(Livro livro, boolean atualizarDisponibilidade) {
        if (atualizarDisponibilidade) {
            livro.disponibilidades = true;
        } else {
            livro.disponibilidades = false;
        }
    }

    void verificarDispobinilidade() {
        if (livro1 != null) {
            if (livro1.disponibilidades) {
                System.out.println("Está disponível o livro: " + livro1.detalhesDoProduto());
            } else {
                System.out.println("Está indisponível o livro: " + livro1.detalhesDoProduto());
            }
        }
        if (livro2 != null) {
            if (livro2.disponibilidades) {
                System.out.println("Está disponível o livro: " + livro2.detalhesDoProduto());
            } else {
                System.out.println("Está indisponível o livro: " + livro2.detalhesDoProduto());
            }
        }
        if (livro3 != null) {
            if (livro3.disponibilidades) {
                System.out.println("Está disponível o livro: " + livro3.detalhesDoProduto());
            } else {
                System.out.println("Está indisponível o livro: " + livro3.detalhesDoProduto());
            }
        }
        if (livro4 != null) {
            if (livro4.disponibilidades) {
                System.out.println("Está disponível o livro: " + livro4.detalhesDoProduto());
            } else {
                System.out.println("Está indisponível o livro: " + livro4.detalhesDoProduto());
            }
        }
        if (livro5 != null) {
            if (livro5.disponibilidades) {
                System.out.println("Está disponível o livro: " + livro5.detalhesDoProduto());
            } else {
                System.out.println("Está indisponível o livro: " + livro5.detalhesDoProduto());
            }
        }
    }

    void listarLivros() {

        if (livro1 != null) {
            System.out.println(livro1.detalhesDoProduto());
        }
        if (livro2 != null) {
            System.out.println(livro2.detalhesDoProduto());
        }
        if (livro3 != null) {
            System.out.println(livro3.detalhesDoProduto());
        }
        if (livro4 != null) {
            System.out.println(livro4.detalhesDoProduto());
        }
        if (livro5 != null) {
            System.out.println(livro5.detalhesDoProduto());
        }
    }

    void listarLivrosComPreco() {

        if (livro1 != null) {
            System.out.println(livro1.detalhesDoProduto(livro1.preco));
        }
        if (livro2 != null) {
            System.out.println(livro2.detalhesDoProduto(livro2.preco));
        }
        if (livro3 != null) {
            System.out.println(livro3.detalhesDoProduto(livro3.preco));
        }
        if (livro4 != null) {
            System.out.println(livro4.detalhesDoProduto(livro4.preco));
        }
        if (livro5 != null) {
            System.out.println(livro5.detalhesDoProduto(livro5.preco));
        }
    }
}
