public class exe_05 {
    public static void main(String[] args) {
        int dia = 30;
        int mes = 4;
        int ano = 2000;

        if (ano > 1000 && ano < 3000) {
            if (dia <= 31) {
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    System.out.println("Data Válida");
                }
            }
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia >= 32)
                    System.out.println("Data Inválida");
            }

            if (dia <= 30) {
                if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    System.out.println("Data Válida");
                }
            }
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia >= 31)
                    System.out.println("Data Inválida");
            }
            if (dia <= 28) {
                if (mes == 2) {
                    System.out.println("Data Válida");
                }

            }
            if (mes == 2) {
                if (dia >= 29)
                    System.out.println("Data Inválida");
            }
        } else {
            System.out.println("Data Inválida Ano");
        }
    }
}

