package aula12;

public class Tartaruga extends Reptil{
    @Override
    public void locomover() {
        System.out.println("Bem lenta");
    }

    @Override
    public String toString() {
        return "-------Tartaruga-------" +
                "\nPeso: " + this.getPeso() +
                "\nIdade: " + this.getIdade() +
                "\nMembros: " + this.getMembros() +
                "\nCor da escama: " + this.getCorEscama() +
                "\n";
    }
}
