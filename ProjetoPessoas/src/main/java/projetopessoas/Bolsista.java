package projetopessoas;

public class Bolsista extends Aluno{
    private float bolsaEmPorcentual;

    public void renovarBolsa(){
        System.out.println("Bolsa de " + this.getNome() + " renovada com sucesso!");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " É bolsista, desconto de " + this.getBolsaEmPorcentual() + "% na mensalidade");
    }

    public float getBolsaEmPorcentual() {
        return bolsaEmPorcentual;
    }

    public void setBolsaEmPorcentual(float bolsa) {
        this.bolsaEmPorcentual = bolsa;
    }

    @Override
    public String toString() {
        return "\n------Bolsista------" +
                "\nNome: " +  this.getNome() +
                "\nIdade: " + this.getIdade() +
                "\nSexo: " + this.getSexo() +
                "\nMatricula: " + this.getMatricula() +
                "\nCurso: " + this.getCurso()+
                "\nBolsa: " + this.getBolsaEmPorcentual() + "\n";
    }
}
