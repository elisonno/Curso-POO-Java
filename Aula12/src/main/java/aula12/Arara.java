package aula12;

public class Arara extends Ave{

    @Override
    public String toString() {
        return "-------Arara-------" +
                "\nPeso: " + this.getPeso() +
                "\nIdade: " + this.getIdade() +
                "\nMembros: " + this.getMembros() +
                "\nCor da pena: " + this.getCorPena() +
                "\n";
    }
}
