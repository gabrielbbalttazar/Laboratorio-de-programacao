import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Quadrado quadrado1 = new Quadrado();
        Scanner lado = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado: ");
        quadrado1.lado = lado.nextInt();
        System.out.println("A Área do quadrado é igual a " + quadrado1.calcularArea());

        Circunferencia circunferencia1 = new Circunferencia();
        Scanner raio = new Scanner(System.in);
        System.out.println("Digite o raio da circunferência: ");
        circunferencia1.raio = raio.nextInt();
        System.out.println("A Área da circunferência é igual a " + circunferencia1.carcularArea());

        Trapezio trapezio1 = new Trapezio();
        Scanner baseMaior = new Scanner(System.in);
        System.out.println("Digite a base maior do trapézio: ");
        trapezio1.baseMaior = baseMaior.nextInt();
        Scanner baseMenor = new Scanner(System.in);
        System.out.println("Digite a base menor do trapézio: ");
        trapezio1.baseMenor = baseMenor.nextInt();
        Scanner altura = new Scanner(System.in);
        System.out.println("Digite a altura do trapézio: ");
        trapezio1.altura = altura.nextInt();
        System.out.println("A Área do trapézio é igual a " + trapezio1.calcularArea());

        Triangulo triangulo1 = new Triangulo();
        Scanner alturaTriangulo = new Scanner(System.in);
        System.out.println("Digite a altura do Triangulo: ");
        triangulo1.altura = alturaTriangulo.nextInt();
        Scanner base = new Scanner(System.in);
        System.out.println("Digite a base do triangulo: ");
        triangulo1.base = base.nextInt();
        System.out.println("A Área do triangulo é igual a " + triangulo1.calcularArea());

    }
}