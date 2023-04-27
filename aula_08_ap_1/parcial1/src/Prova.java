
public class Prova {

    double notaParte1;
    double notaParte2;

    double calcularNotaTotal() {

        if (notaParte1 + notaParte2 > 10) {
            return 0;
        } else
            return notaParte1 + notaParte2;
    }
}

