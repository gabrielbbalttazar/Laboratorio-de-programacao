public class Main {
    public static void main(String[] args) {

        Turma turma = new Turma();

        Aluno aluno1 = new Aluno();
        aluno1.prova1 = new Prova();
        aluno1.prova2 = new Prova();
        turma.aluno1 = aluno1;

        Aluno aluno2 = new Aluno();
        aluno2.prova1 = new Prova();
        aluno2.prova2 = new Prova();
        turma.aluno2 = aluno2;

        Aluno aluno3 = new Aluno();
        aluno3.prova1 = new Prova();
        aluno3.prova2 = new Prova();
        turma.aluno3 = aluno3;

        aluno1.prova1.notaParte1 = 4;
        aluno1.prova1.notaParte2 = 2.5;
        aluno1.prova2.notaParte1 = 1;
        aluno1.prova2.notaParte2 = 7;

        aluno2.prova1.notaParte1 = 6.5;
        aluno2.prova1.notaParte2 = 3.5;
        aluno2.prova2.notaParte1 = 0;
        aluno2.prova2.notaParte2 = 3;

        aluno3.prova1.notaParte1 = 5;
        aluno3.prova1.notaParte2 = 4;
        aluno3.prova2.notaParte1 = 6;
        aluno3.prova2.notaParte2 = 1.5;

        System.out.println("A média do Aluno 1 é igual a " + aluno1.calcularMedia() + "!");
        System.out.println("A média do Aluno 2 é igual a " + aluno2.calcularMedia() + "!");
        System.out.println("A média do Aluno 3 é igual a " + aluno3.calcularMedia() + "!");

        System.out.println("A média Total da turma é igual a " + turma.calcularMedia() + "!");
    }
}