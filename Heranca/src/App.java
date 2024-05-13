public class App {
    public static void main(String[] args) throws Exception {
       Pessoa pessoa1 = new Pessoa();
       Aluno pessoa2 = new Aluno();
       Professor pessoa3 = new Professor();
       Funcionario pessoa4 = new Funcionario();

       pessoa1.setNome("Pedro");
       pessoa2.setNome("Maria");
       pessoa3.setNome("Claudio");
       pessoa4.setNome("Fabiana");

       pessoa1.setSexo("Masculino");
       pessoa2.setSexo("Feminino");

       pessoa1.setIdade(18);
       pessoa2.setIdade(17);
       pessoa3.setIdade(52);
       pessoa4.setIdade(37);
       pessoa2.fazerAniversario();
        
       pessoa2.setMatricula(15154);
       pessoa2.setCurso("Matematica");
       pessoa3.setSalario(2500.70f);
       pessoa4.setSetor("TI");
        

       System.out.println(pessoa1.toString());
       System.out.println(pessoa2.toString());
       System.out.println(pessoa3.toString());
       System.out.println(pessoa4.toString());
    }
}
