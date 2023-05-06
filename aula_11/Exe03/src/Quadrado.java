public class Quadrado extends FiguraGeometrica {

    double lado;

    double calcularArea() {
        double area = lado * lado;
        return area;
    }

    double calcularPerimetro() {
        double perimetro = lado * 4;
        return perimetro;
    }

}
