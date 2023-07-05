package aula12;

public class Cachorro extends Mamifero{
    public void enterrarOsso() {
        System.out.println("Enterrando osso");
    }
    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }

    @Override
    public String toString() {
        return "-------Cachorro-------" +
                "\nPeso: " + this.getPeso() +
                "\nIdade: " + this.getIdade() +
                "\nMembros: " + this.getMembros() +
                "\nCor do pelo: " + this.getCorPelo() +
                "\n";
    }
}
