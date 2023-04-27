public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Bob", "Belga", 5);
        Cachorro cachorro2 = new Cachorro("July", "Fox");

        System.out.println("Nome: " + cachorro1.nome + " | Raça: " + cachorro1.raca + " | Idade: " + cachorro1.idade);
        System.out.println("Nome: " + cachorro2.nome + " | Raça: " + cachorro2.raca + " | Idade: " + cachorro2.idade);
    }
}