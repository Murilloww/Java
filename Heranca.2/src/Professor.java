public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public final void receberAumento(float aumento){
        this.setSalario(getSalario() + aumento);
    }
    
    @Override
    public void status(){
        super.status();
        System.out.println("Especialidade: " + this.getEspecialidade());
        System.out.println("Salario: " + this.getSalario());
    }
}
