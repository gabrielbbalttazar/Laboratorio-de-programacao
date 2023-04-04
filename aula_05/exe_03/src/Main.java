import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo();
        Scanner base = new Scanner(System.in);
        System.out.println("Digite a base do Retangulo:");
        retangulo1.base = base.nextInt();
        Scanner altura = new Scanner(System.in);
        System.out.println("Digite a altura do Retangulo:");
        retangulo1.altura = altura.nextInt();

        System.out.println("A area desse retângulo é " + retangulo1.calcularArea() + " e seu perímetro é igual a " + retangulo1.calcularPerimetro() + "!");

    }
}