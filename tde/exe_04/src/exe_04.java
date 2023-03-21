public class exe_04 {
    public static void main(String[] args) {

        int numero = 101;
        int contador = 1;

        System.out.println(1);

        while (contador <= numero) {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
            contador++;
        }
        if (numero % 2 == 0) {

        } else {
            System.out.println(numero);
        }
    }
}
