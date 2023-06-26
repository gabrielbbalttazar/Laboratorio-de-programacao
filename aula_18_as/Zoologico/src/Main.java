public class Main {
    public static void main(String[] args) {
        Mamifero mamifero1 = new Mamifero("Garfield", 1, 5, "Gato", "Listrado");
        Animal animal1 = new Animal("Simba", 5, 50, "Leão");
        Ave ave1 = new Ave("Louro José", 2, 4, "Papagaio", 4);
        Animal animal2 = new Animal("Beethoven", 10, 30, "Cachorro");

        Veterinario veterinario1 = new Veterinario("Drauzio Varella", "Veterinário", 5000, "Full Stack");
        Funcionario funcionario1 = new Funcionario("Luiza Mel", "Gerente", 3000);
        Funcionario funcionario2 = new Funcionario("Alberto", "Auxiliar", 2000);

        Zoo zoo = new Zoo(3, 2);

        System.out.println("-------------------- Adicionando Animais --------------------");
        zoo.adicionarAnimal(mamifero1);
        zoo.adicionarAnimal(animal1);
        zoo.adicionarAnimal(ave1);
        zoo.adicionarAnimal(animal2);

        System.out.println("-------------------- Adicionando Fucionários --------------------");
        zoo.adicionarFuncionario(veterinario1);
        zoo.adicionarFuncionario(funcionario1);
        zoo.adicionarFuncionario(funcionario2);

        System.out.println("---------- Movimentações dos animais com carga e sobrecarga ----------");
        animal1.movimentar("Correndo");
        animal1.movimentar();

        System.out.println("-------------------- Puxando o método amamentar --------------------");
        mamifero1.amamentar();

        System.out.println("-------------------- Puxando o método voar e realizar truque --------------------");
        ave1.voar();
        ave1.realizarTruque();

        System.out.println("-------------------- Puxando o método realizar exame --------------------");
        veterinario1.realizarExame(animal1);

    }
}