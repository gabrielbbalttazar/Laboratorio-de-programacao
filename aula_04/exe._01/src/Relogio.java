public class Relogio {
    Ponteiro ponteiroHora = new Ponteiro();
    Ponteiro ponteiroMinuto = new Ponteiro();
    Ponteiro ponteiroSegundo = new Ponteiro();

    void acertarRelogio ( int Hora, int Minuto, int Segundo){
        ponteiroHora.posicao = Hora;
        ponteiroMinuto.posicao = Minuto / 5;
        ponteiroSegundo.posicao = Segundo / 5;

    }
    int getHora(){
        return ponteiroHora.posicao;
    }
    int getMinuto(){
        return ponteiroMinuto.posicao * 5;
    }
    int getSegundo(){
        return ponteiroSegundo.posicao * 5;
    }
}