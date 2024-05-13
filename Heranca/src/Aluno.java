public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        if(this.getIdade() > 17){
        this.matricula = matricula;
        } else {
            this.matricula = 0;
            System.out.println("Aluno(A) " + getNome() + " sem idade para se matricular");}
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        if (this.getMatricula() > 0){
        this.curso = curso;
        System.out.println("Aluno " +getNome()+ " matriculado no curso: " + this.getCurso());
        } else{
            this.curso = null;
            System.out.println("Aluno(A) " + this.getNome() + " nao matriculado");}
    }

    public void cancelarMatricula(){
        this.setMatricula(0);
        System.out.println("Matricula cancelada.");
    }
    
}
