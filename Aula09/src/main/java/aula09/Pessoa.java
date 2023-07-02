package aula09;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }

    @Override
    public String toString() {
        return "------DETALHES DO LEITOR--------" + "\n" +
                "Nome: " + nome + "\n" +
                "Idade: " +  + idade + "\n" +
                "Sexo: " + (sexo == 'M'? "Masculino":"Feminino")
                +"\n";
    }
}
