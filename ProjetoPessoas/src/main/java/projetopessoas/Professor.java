package projetopessoas;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void receberAumento (float aumento){
        this.setSalario(this.getSalario() + aumento);
    }

    /*public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }*/

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return  "\n------Professor------" +
                "\nNome: " + this.getNome() +
                "\nIdade: " + this.getIdade() +
                "\nSexo: " + this.getSexo() +
                "\nEspecialidade: " + especialidade +
                "\nSalario: " + salario + "\n";
    }
}