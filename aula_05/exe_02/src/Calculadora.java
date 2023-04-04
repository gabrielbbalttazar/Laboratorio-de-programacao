public class Calculadora {
    double numero1;
    double numero2;

    double somar() {
        double resultadoSomar;
        resultadoSomar = numero1 + numero2;
        return resultadoSomar;
    }

    double subtrair() {
        double resultadoSubtracao;
        resultadoSubtracao = numero1 - numero2;
        return resultadoSubtracao;
    }

    double multiplicar() {
        double resultadoMultiplicar;
        resultadoMultiplicar = numero1 * numero2;
        return resultadoMultiplicar;
    }

    double dividir() {
        double resultadoDividir;
        resultadoDividir = numero1 / numero2;
        return resultadoDividir;
    }
}
