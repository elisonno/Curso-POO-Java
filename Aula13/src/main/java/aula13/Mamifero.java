package aula13;

public class Mamifero extends Animal{
    protected String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("Emitir som de mamífero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public String toString() {
        return "------Mamifero------" +
                "\nCor do pelo: " + this.getCorPelo() +
                "\nPeso: " + this.getPeso() +
                "\nIdade: " + this.getIdade() +
                "\nMembros: " + this.getMembros() +
                "\n";
    }
}
