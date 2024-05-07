public class Lutador {
    private String nome, nacionalidade, categoria;
    private int idade, vitoria, derrota, empate;
    private float altura, peso;

    

    public Lutador(String nome, String nacionalidade, int idade, int vitoria, 
    int derrota, int empate, float altura,float peso) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        if (verificarIdade(idade)){
        this.setVitoria(vitoria);
        this.setDerrota(derrota);
        this.setEmpate(empate);
        this.setAltura(altura);
        this.setPeso(peso);
        } else {
            this.setVitoria(0);
            this.setDerrota(0);
            this.setEmpate(0);
            this.setAltura(0f);
            this.setPeso(0f);
            System.out.println(getNome() +
             " nao tem idade para competir, stats zerados!");
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    
    private void setCategoria() {
        if (this.getPeso() < 52.2f){
            this.categoria = "Invalido";

        } else if (this.getPeso() <= 70.3f){
            this.categoria = "Leve";

        } else if (this.getPeso() <= 83.9f){
            this.categoria = "Medio";

        } else if(this.getPeso() <= 120.2f){
            this.categoria = "Pesado";
        } 
        else {
            this.categoria = "Invalido";
        }
        
    }
    public int getVitoria() {
        return vitoria;
    }
    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }
    public int getDerrota() {
        return derrota;
    }
    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }
    public int getEmpate() {
        return empate;
    }
    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public void apresentar(){
        System.out.println("================================");
        System.out.print("Lutador " + getNome()+ ",");        
        System.out.print(" origem " + getNacionalidade() + ",");
        System.out.print(" " + getIdade() + " anos,");        
        System.out.print(" " + getAltura() + " m de altura,");
        System.out.print(" pesando " + getPeso() + " Kg.");
        System.out.println(" Com " + getVitoria() + " vitorias, ");        
        System.out.print(getDerrota() + " derrotas");        
        System.out.print(" e " + getEmpate() + " empates");    
        System.out.println(".");    
    }

    public void status(){
        System.out.print(getNome());
        System.out.print(", peso " + getCategoria());
        System.out.print(" com " + getVitoria() + " vitorias");
        System.out.print(", " + getDerrota() + " derrotas");
        System.out.print("e " + getEmpate() + " empates");
        System.out.println(".");
    }

    public void ganharLuta(){
        this.setVitoria(getVitoria() + 1);
    }

    public void perderLuta(){
        this.setDerrota(getDerrota() + 1);       
    }

    public void empatarLuta(){
        this.setEmpate(getEmpate() + 1);
    }

    private boolean verificarIdade(int idade){
        return idade > 17;
    }
}
