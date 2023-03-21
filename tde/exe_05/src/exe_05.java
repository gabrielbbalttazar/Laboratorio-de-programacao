public class exe_05 {
    public static void main(String[] args) {

        int numero = 505;

        for (int contador = 1; contador <= numero; contador++) {
            if (contador % 2 != 0 || contador == 1) {
                if (contador == 1) {
                    System.out.println(contador);
                } else {
                    System.out.println(contador);
                }
            }
        }
        if (numero % 2 == 0) {
            System.out.println(numero);
        }
    }
}

