package projetopessoas;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;


    public Aluno() {
    }

    public void pagarMensalidade(){
        System.out.println(this.getNome() + ", sua mensalidade foi paga com sucesso");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return  "\n------Aluno------" +
                "\nNome: " +  this.getNome() +
                "\nIdade: " + this.getIdade() +
                "\nSexo: " + this.getSexo() +
                "\nMatricula: " + this.getMatricula() +
                "\nCurso: " + this.getCurso()+ "\n";
    }
}
