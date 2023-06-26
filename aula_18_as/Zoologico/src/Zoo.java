public class Zoo {

    Animal[] animais;
    Funcionario[] funcionarios;
    int numAnimais;
    int numFuncionarios;

    public Zoo(int tamanhoAnimais, int tamanhoFuncionarios) {
        animais = new Animal[tamanhoAnimais];
        funcionarios = new Funcionario[tamanhoFuncionarios];
        numAnimais = 0;
        numFuncionarios = 0;
    }

    public void adicionarAnimal(Animal animal) {
        if (numAnimais < animais.length) {
            animais[numAnimais] = animal;
            numAnimais++;
            System.out.println("Animal adicionado ao Zoológico: " + animal.getNome());
        } else {
            System.out.println("Não é possível adicionar o animal " + animal.getNome() + ". O Zoológico está lotado.");
        }
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (numFuncionarios < funcionarios.length) {
            funcionarios[numFuncionarios] = funcionario;
            numFuncionarios++;
            System.out.println("Funcionário adicionado ao Zoológico: " + funcionario.getNome());
        } else {
            System.out.println("Não é possível adicionar funcionários " + funcionario.getNome() + ". O Zoológico está com sua equipe completa.");
        }
    }

}
