public class Main {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 5;
        quadrado.calcularPerimetro();
        quadrado.calcularArea();

        System.out.println("O perímetro do número " + quadrado.lado + " é igual a " + quadrado.calcularPerimetro() + " e a área é igual a " + quadrado.calcularArea());


    }
}