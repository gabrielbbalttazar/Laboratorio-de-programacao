public class exe_01 {
    public static void main(String[] args) {

        int numero = 11;
        int contador = 0;
        int soma = 0;

        while (contador < numero) {

            contador++;
            soma += contador;
        }
        System.out.println("A soma dos números naturais é igual a " + soma + "!");
    }
}