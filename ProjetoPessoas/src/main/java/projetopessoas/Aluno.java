package projetopessoas;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;


    public Aluno() {
    }

    public void cancelarMatricula(){
        System.out.println("Matricula será cancelada");
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
