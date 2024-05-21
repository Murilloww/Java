public abstract class Pessoa {
    protected String nome, sexo;
    protected float experiencia;
    protected int idade;

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.experiencia = 0;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public float getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void ganharExperiencia(){
        this.setExperiencia(experiencia);
    }

    @Override
    public String toString() {
        return "Pessoa " + 
        "{nome=" + nome + ", sexo=" 
        + sexo + ", experiencia=" + experiencia + ", idade=" + idade + "}";
    }

    
}
