public class Livro implements Publicacao {
    private String titulo, autor;
    private int totalPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    

    public Livro(String titulo, String autor, int totalPaginas, int pagAtual, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public Pessoa getPessoa(){
        return leitor;
    }

    public void setPessoa(Pessoa leitor){
       this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String detalhes() {
        return "Livro \ntitulo= " + titulo + "\nleitor= " + 
        leitor.getNome() + ", idade= " + leitor.getIdade() +
         ", sexo= " + leitor.getSexo() +
        "\nautor= " + autor + "\ntotalPaginas= " + totalPaginas
        + "\npagAtual= " + pagAtual + "\naberto= " + aberto;
    }

    private int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pagina) {
        if(this.getAberto()){
            if(pagina > this.getTotalPaginas()){
            this.setPagAtual(0);
            } else {this.setPagAtual(pagina);}
        } else {System.out.println("O livro está fechado, abra para folhear");}
    }

    @Override
    public void avançarPagina(int avancar) {
        if(this.getAberto() == true){
            if(avancar < this.getTotalPaginas()){
            this.setPagAtual(getPagAtual() + avancar);
            } else {
                this.setPagAtual(getTotalPaginas());
                System.out.println("Impossível avançar mais paginas");}
        } else {System.out.println("O livro está fechado, abra para avancar pagimas");}
    }

    @Override
    public void voltarPagina(int voltar) {
        if(this.getAberto() == true){    
            if(voltar < this.getTotalPaginas()){
            this.setPagAtual(getPagAtual() - voltar);
            }else {
                this.setTotalPaginas(getTotalPaginas());
                System.out.println("Impossivel voltar mais paginas");
            }
        } else {System.out.println("O livro está fechado, abra para voltar paginas");}
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }    
}
