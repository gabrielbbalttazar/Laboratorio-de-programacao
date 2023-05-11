public class Triangulo extends FormaGeometrica {

    double lado;

    double calcularArea() {
        return (lado * lado) / 2;
    }

    double calcularPerimetro() {
        return lado * 3;
    }

}
