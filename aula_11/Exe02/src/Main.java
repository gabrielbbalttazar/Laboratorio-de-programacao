public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.marca = "VW";
        carro.modelo = "Jetta";
        carro.numPassageiro = 5;

        System.out.println("Marca: " + carro.marca);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Numero de Passageiros: " + carro.numPassageiro);
    }
}