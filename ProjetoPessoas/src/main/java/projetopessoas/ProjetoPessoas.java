package projetopessoas;

public class ProjetoPessoas {
   public static void main(String[] args) {
      Pessoa p1 = new Pessoa();
      Aluno p2 = new Aluno();
      Professor p3 = new Professor();
      Funcionario p4 = new Funcionario();

      p1.setNome("Pedro");
      p2.setNome("Maria");
      p3.setNome("Cláudio");
      p4.setNome("Fabiano");

      p1.setSexo("M");
      p2.setSexo("F");
      p3.setSexo("M");
      p4.setSexo("F");

      p1.setIdade(18);
      p2.setIdade(20);
      p3.setIdade(45);
      p4.setIdade(30);

      p2.setCurso("Informática");
      p2.setMatricula(2547);
      p3.receberAumento(499.25f);
      p3.setEspecialidade("POO");
      p3.setSalario(2500.75f);
      p4.setSetor("Estoque");
      p4.mudarTrabalho();

      System.out.println(p1.toString());
      System.out.println(p2.toString());
      System.out.println(p3.toString());
      System.out.println(p4.toString());

   }




}
