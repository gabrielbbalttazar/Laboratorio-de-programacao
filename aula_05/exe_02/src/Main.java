import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora1 = new Calculadora();
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Digite um número:");
        calculadora1.numero1 = numero1.nextInt();
        Scanner numero2 = new Scanner(System.in);
        System.out.println("Digite outro número:");
        calculadora1.numero2 = numero2.nextInt();

        System.out.println("A soma de " + calculadora1.numero1 + " + " + calculadora1.numero2 + " é igual a " + calculadora1.somar());
        System.out.println("A subtração de " + calculadora1.numero1 + " + " + calculadora1.numero2 + " é igual a " + calculadora1.subtrair());
        System.out.println("A multiplicação de " + calculadora1.numero1 + " + " + calculadora1.numero2 + " é igual a " + calculadora1.multiplicar());
        System.out.println("A divisão de " + calculadora1.numero1 + " + " + calculadora1.numero2 + " é igual a " + calculadora1.dividir());
    }
}