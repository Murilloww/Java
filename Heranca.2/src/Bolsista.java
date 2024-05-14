public class Bolsista extends Aluno{
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa(){
        System.out.println("Renovando bolsa do(A) " + this.getNome());
    }
    
    @Override
    public void PagarMensalidade(){
        System.out.println(this.getNome() +" E bolsista");
    }

    @Override
    public void status(){
        super.status();
        System.out.println("Bolsa: " + this.getBolsa());
    }
}
