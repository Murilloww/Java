public class App {
    public static void main(String[] args) throws Exception {
        Visitante visitante = new Visitante();
        visitante.setNome("Matilde");
        visitante.setIdade(74);
        visitante.setSexo("F");

        Professor professor = new Professor();
        professor.setNome("Marcos");
        professor.setIdade(43);
        professor.setSexo("M");
        professor.setEspecialidade("Informatica");
        professor.setSalario(1500.00f);
        professor.receberAumento(150.20f);

        Aluno aluno = new Aluno();
        aluno.setNome("Angela");
        aluno.setIdade(18);
        aluno.setMatricula(1245);
        aluno.setSexo("F");
        aluno.setCurso("Analise e desenvolvimento de sistemas");
        aluno.PagarMensalidade();

        Bolsista bolsista = new Bolsista();
        bolsista.setNome("Airton");
        bolsista.setIdade(22);
        bolsista.setSexo("M");
        bolsista.setBolsa(55532f);
        bolsista.setCurso("A selecionar");
        bolsista.setMatricula(5321);

        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Amanda");
        tecnico.setIdade(19);
        tecnico.setRegistroProfissional(1507120521);
        tecnico.setCurso("Informatica");
        tecnico.setMatricula(2352151);

        aluno.status();
        tecnico.status();
        bolsista.status();
        professor.status();
        visitante.status();
    }
}
