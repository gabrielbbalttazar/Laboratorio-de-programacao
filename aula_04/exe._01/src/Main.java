public class Main {
    public static void main(String[] args) {

        Relogio relogio = new Relogio();

        relogio.acertarRelogio(7, 15, 35);
        System.out.println(relogio.getHora() + " Horas.");
        System.out.println(relogio.getMinuto() + " Minutos.");
        System.out.println(relogio.getSegundo() + " Segundos. ");

    }
}