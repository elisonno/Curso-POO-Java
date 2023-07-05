package aula12;

public class Canguru extends Mamifero{
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }

    public void usarBolsa(){
        System.out.println("Usando Bolsa");
    }

    @Override
    public String toString() {
        return "-------Canguru-------" +
                "\nPeso: " + this.getPeso() +
                "\nIdade: " + this.getIdade() +
                "\nMembros: " + this.getMembros() +
                "\nCor do pelo: " + this.getCorPelo() +
                "\n";
    }
}
