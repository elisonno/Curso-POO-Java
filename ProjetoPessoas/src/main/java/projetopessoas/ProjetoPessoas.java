package projetopessoas;

public class ProjetoPessoas {
   public static void main(String[] args) {

      Visitante p1 = new Visitante();
      p1.setNome("Julia");
      p1.setSexo("F");
      p1.setIdade(19);
      System.out.println(p1.toString());

      Aluno p2 = new Aluno();
      p2.setNome("Maria");
      p2.setSexo("F");
      p2.setIdade(20);
      p2.setCurso("Informática");
      p2.setMatricula(2547);
      System.out.println(p2.toString());
      p2.pagarMensalidade();


      Professor p3 = new Professor();
      p3.setNome("Cláudio");
      p3.setSexo("M");
      p3.setIdade(45);
      p3.receberAumento(499.25f);
      p3.setEspecialidade("POO");
      p3.setSalario(2500.75f);
      System.out.println(p3.toString());

      Funcionario p4 = new Funcionario();
      p4.setNome("Fabiana");
      p4.setSexo("F");
      p4.setIdade(30);
      p4.setSetor("Estoque");
      p4.mudarTrabalho();
      System.out.println(p4.toString());

      Bolsista p5 = new Bolsista();
      p5.setNome("Eduardo");
      p5.setSexo("M");
      p5.setIdade(20);
      p5.setCurso("ADS");
      p5.setMatricula(2222);
      p5.setBolsaEmPorcentual(50.5f);
      System.out.println(p5.toString());
      p5.pagarMensalidade();
      p5.renovarBolsa();

      Tecnico p6 = new Tecnico();
      p6.setNome("Roberta");
      p6.setSexo("F");
      p6.setIdade(26);
      p6.setCurso("ADS");
      p6.setMatricula(1152);
      p6.setRegistroProfissional("134F34");
      System.out.println(p6.toString());
      p6.praticar();

   }




}
