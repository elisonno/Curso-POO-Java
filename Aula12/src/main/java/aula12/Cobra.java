package aula12;

public class Cobra extends Reptil{
    @Override
    public String toString() {
        return "-------Cobra-------" +
                "\nPeso: " + this.getPeso() +
                "\nIdade: " + this.getIdade() +
                "\nMembros: " + this.getMembros() +
                "\nCor da escama: " + this.getCorEscama() +
                "\n";
    }
}
