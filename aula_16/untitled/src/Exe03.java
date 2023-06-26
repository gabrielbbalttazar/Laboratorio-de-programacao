public class Exe03 {
    public static void main(String[] args) {

        int[] valores = {23, 1, 34, 89, 2};

        int maior = valores[0];

        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
        }

        System.out.println("O maior número é: " + maior);

    }
}
