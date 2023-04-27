public class Main {
    public static void main(String[] args) {
        Equipe equipe1 = new Equipe("Equipe 1");
        Equipe equipe2 = new Equipe("Equipe 2");
        Equipe equipe3 = new Equipe("Equipe 3");

        equipe1.registrarVitoria();
        equipe1.registrarVitoria();
        equipe1.registrarVitoria();
        equipe1.registrarEmpate();
        equipe1.registrarEmpate();

        equipe2.registrarVitoria();
        equipe2.registrarEmpate();
        equipe2.registrarDerrota();

        equipe3.registrarEmpate();
        equipe3.registrarEmpate();
        equipe3.registrarEmpate();
        equipe3.registrarDerrota();
        equipe3.registrarVitoria();

        System.out.println("Nome: " + equipe1.getNome() + " | Vitórias: " + equipe1.getVitorias() + " | Empates: " + equipe1.getEmpates() + " | Derrotas: "+ equipe1.getDerrotas());
        System.out.println("Nome: " + equipe2.getNome() + " | Vitórias: " + equipe2.getVitorias() + " | Empates: " + equipe2.getEmpates() + " | Derrotas: "+ equipe2.getDerrotas());
        System.out.println("Nome: " + equipe3.getNome() + " | Vitórias: " + equipe3.getVitorias() + " | Empates: " + equipe3.getEmpates() + " | Derrotas: "+ equipe3.getDerrotas());

    }
}