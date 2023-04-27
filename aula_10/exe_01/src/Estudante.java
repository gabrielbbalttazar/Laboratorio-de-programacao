public class Estudante {
    private String nome;
    private double matricula;
    private String curso;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Estudante(String nome, double matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public Estudante(String nome, double matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = "Contabilidade";
    }



}
