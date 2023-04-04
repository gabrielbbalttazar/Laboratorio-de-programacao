public class Retangulo {
    double base;
    double altura;

    double calcularArea() {
        double areaRetangulo;
        areaRetangulo = base * altura;
        return areaRetangulo;
    }

    double calcularPerimetro() {
        double perimetroRetangulo;
        perimetroRetangulo = 2 * (base * altura);
        return perimetroRetangulo;
    }

}
