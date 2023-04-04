public class Circulo {

    double raio;

    double calcularArea (){
        double areaCirculo = Math.PI * (raio * raio);
        return areaCirculo;
    }

    double calcularPerimetro (){
        double perimetroCirculo = Math.PI * ( 2 * raio);
        return perimetroCirculo;
    }
}
