public class Exe02 {
    public static void main(String[] args) {

        double[] notas = {8.5, 7.0, 9.0, 6.5, 10.0};

        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("A média das notas é: " + media);
    }
}
