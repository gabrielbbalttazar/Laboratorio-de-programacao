import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo();

        Scanner raio = new Scanner(System.in);
        System.out.println("Digite o Raio do circulo: ");
        circulo1.raio = raio.nextInt();

        System.out.println("A area do circulo é igual a " + circulo1.calcularArea() + " e seu perimetro é igual a " + circulo1.calcularPerimetro() + "!");
    }
}