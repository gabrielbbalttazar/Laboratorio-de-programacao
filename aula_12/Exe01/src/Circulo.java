public class Circulo extends FormaGeometrica {

    double raio;
    double calcularArea(){
        return Math.PI * (raio * raio);
    };

    double calcularPerimetro(){
        return 2 * Math.PI * raio;
    };
}
