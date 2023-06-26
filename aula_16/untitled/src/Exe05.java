public class Exe05 {
    public static void main(String[] args) {

        int[] numerosImpares = new int[10];

        for (int i = 0, numero = 1; i < numerosImpares.length; i++, numero += 2) {
            numerosImpares[i] = numero;
        }

        for (int i = 0; i < numerosImpares.length; i++) {
            System.out.println(numerosImpares[i]);
        }
    }
}
