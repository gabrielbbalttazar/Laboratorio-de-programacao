public class Mamifero extends Animal {

    String tipoPelagem;

    public Mamifero(String nome, int idade, double peso, String especie, String tipoPelagem) {
        super(nome, idade, peso, especie);
        this.tipoPelagem = tipoPelagem;
    }

    void amamentar() {
        System.out.println("O " + getEspecie() + " está amamentando!");
    }
}
