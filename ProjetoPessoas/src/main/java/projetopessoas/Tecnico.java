package projetopessoas;

public class Tecnico extends Aluno{
    private String registroProfissional;

    public void praticar(){
        System.out.println("Praticando");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return "\n------Bolsista------" +
                "\nNome: " +  this.getNome() +
                "\nIdade: " + this.getIdade() +
                "\nSexo: " + this.getSexo() +
                "\nMatricula: " + this.getMatricula() +
                "\nCurso: " + this.getCurso()+
                "\nRegistro Profissional: " + this.getRegistroProfissional() + "\n";
    }
}
