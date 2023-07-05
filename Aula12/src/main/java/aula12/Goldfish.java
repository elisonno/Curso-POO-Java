package aula12;

public class Goldfish extends Peixe{

    @Override
    public String toString() {
        return "-------Goldfish-------" +
                "\nPeso: " + this.getPeso() +
                "\nIdade: " + this.getIdade() +
                "\nMembros: " + this.getMembros() +
                "\nCor da escama: " + this.getCorEscama() +
                "\n";
    }
}
