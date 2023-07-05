package aula13;

public class Lobo extends Mamifero{
    @Override
    public void emitirSom() {
        System.out.println("Auuuuuuuuuuuuuuuu!");
    }

    @Override
    public String toString() {
        return "------Lobo------" +
                "\nCor do pelo: " + this.getCorPelo() +
                "\nPeso: " + this.getPeso() +
                "\nIdade: " + this.getIdade() +
                "\nMembros: " + this.getMembros() +
                "\n";
    }
}
