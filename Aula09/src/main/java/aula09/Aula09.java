package aula09;

public class Aula09 {
    public static void main(String[] args) {
        Pessoa[] pesssoa = new Pessoa[2];
        Livro[] livro = new Livro[3];

        pesssoa[0] = new Pessoa("Pedro", 22, 'M');
        pesssoa[1] = new Pessoa("Maria", 25, 'F');

        livro[0] = new Livro("Aprendendo Java", "José da Silva", 300, pesssoa[0]);
        livro[1] = new Livro("Aprendendo POO", "Pedro Paulo", 500, pesssoa[1]);
        livro[2] = new Livro("Java Avançado","Mara do Carmo",800,pesssoa[0]);

        livro[0].abrir();
        livro[0].folhear(50);
        livro[0].voltarPag();
        System.out.println(livro[0].detalhes());

        livro[1].abrir();
        livro[1].folhear(400);
        livro[1].avacarPag();
        System.out.println(livro[1].detalhes());

        livro[2].abrir();
        livro[2].folhear(1);
        livro[2].voltarPag();
        livro[2].fechar();
        System.out.println(livro[2].detalhes());

    }
}
