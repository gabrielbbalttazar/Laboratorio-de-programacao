public class Trapezio {
    double baseMaior;
    double baseMenor;
    double altura;

    double calcularArea(){
        double areaTrapezio;
        areaTrapezio = ((baseMaior + baseMenor) / 2 ) * altura;
        return areaTrapezio;
    }

}
