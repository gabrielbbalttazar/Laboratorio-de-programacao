public class Retangulo extends FormaGeometrica {

    double base;
    double altura;

    double calcularArea() {
        return base * altura;
    }

    double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }

}
