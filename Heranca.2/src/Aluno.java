public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if (this.getIdade() >= 18){
        this.matricula = matricula;
        } else {
            this.matricula = -1;
            System.out.println("Sem idade para se matricular");
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void PagarMensalidade(){
        if (this.getMatricula() != -1){
        System.out.println("Mensalidade do aluno(A) " + getNome() + " paga!");
        } else {System.out.println("Aluno nao matriculado! Impossivel pagar mensalidade");}
        
    }
    
    @Override
    public void status(){
        super.status();
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Curso: " + this.getCurso());
    }
}
