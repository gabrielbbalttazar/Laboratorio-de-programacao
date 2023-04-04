public class exe_01 {

    public static void main(String[] args) {

        double nota1 = 8.5;
        double nota2 = 7.5;
        double nota3 = 6.0;

        int peso1 = 3;
        int peso2 = 2;
        int peso3 = 5;

        double parcial1 = nota1 * peso1;
        double parcial2 = nota2 * peso2;
        double parcial3 = nota3 * peso3;

        double media = (parcial1 + parcial2 + parcial3) / 10;

        System.out.println("A média é igual a " + media);

    }

}
