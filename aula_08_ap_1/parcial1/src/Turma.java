public class Turma {

    Aluno aluno1;
    Aluno aluno2;
    Aluno aluno3;

    double calcularMedia() {

        if (aluno1.calcularMedia() == 0 || aluno2.calcularMedia() == 0 || aluno3.calcularMedia() == 0) {
            System.out.println("#ERRO: Não foi possível calcular a média da turma. A soma das notas ultrapassou o limite máximo de 10 pontos. Por favor, verifique as notas inseridas e tente novamente. ERRO#");
            return 0;
        }

        if (aluno1.calcularMedia() != 0 && aluno2.calcularMedia() != 0 && aluno3.calcularMedia() != 0) {
            double mediaTotalTurma = ((aluno1.calcularMedia() + aluno2.calcularMedia() + aluno3.calcularMedia()) / 3);
            return mediaTotalTurma;
        }
        return 0;
    }
}
