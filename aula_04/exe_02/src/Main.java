public class Main {
    public static void main(String[] args) {
        Fracao fracao1 = new Fracao();
        fracao1.numerador = 2;
        fracao1.denominador = 3;

        Fracao fracao2 = new Fracao();
        fracao2.numerador = 5;
        fracao2.denominador = 6;

        Fracao fracao3 = new Fracao();
        fracao3 = fracao1.multiplicar(fracao2);

        System.out.println("O resultado da multiplicação das frações é igual a " + fracao3.numerador + "/" + fracao3.denominador);

    }
}