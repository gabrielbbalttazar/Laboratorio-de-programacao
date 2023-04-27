public class Aluno {

    Prova prova1;
    Prova prova2;

    double calcularMedia() {
        if (prova1.calcularNotaTotal() == 0 || prova2.calcularNotaTotal() == 0) {
            return 0;
        } else {
            double mediaAluno = ((prova1.calcularNotaTotal() + prova2.calcularNotaTotal()) / 2);
            return mediaAluno;
        }
    }
}
