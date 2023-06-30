package aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco("Jubileu", 1111);
        p1.abriConta("CC");

        ContaBanco p2 = new ContaBanco("Creuza", 2222);
        p2.abriConta("CP");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);
        p1.sacar(150);
        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();

    }
}
