
import java.util.Random;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    public String statusConta;

    public ContaBanco(float saldo, boolean status){  
        Random random = new Random();
        int numContaRandom = random.nextInt(100000);
        this.numConta = numContaRandom;
        this.setSaldo(0);
        this.setStatus(false);

    }
    public void statusConta(){
        System.out.println("------------------------");
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {   
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo){
        this.setStatus(true);
        this.setTipo(tipo);
        if (tipo.equals("CC")){
            this.setSaldo(50);
        } else if (tipo.equals("CP")){
            this.setSaldo(150);
            System.out.println("Conta aberta com sucesso!");
        }
    }

    public void fecharConta(){
        
        if (this.getSaldo() > 0){
            System.out.println("Conta contém saldo");
        } else if(this.getSaldo() < 0){
            System.out.println("Conta em debito");}
            else {this.setStatus(false);
                    System.out.println("Conta fechada com sucesso!");}
    }

    public void depositar(float depositar){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + depositar);
            System.out.println("Deposito realizado com sucesso " + getDono());
        }   else{System.out.println("Abra uma conta para depositar");}
    }

    public void sacar(float sacar){
        if (this.getStatus()){
            if(this.getSaldo() > 0){
            this.setSaldo(this.getSaldo() - sacar);
                System.out.println("Saque realizado com sucesso " + getDono());
            }else {System.out.println("Saldo insuficiente");}
        } else {System.out.println("Nao foi possivel sacar de uma conta fechada");}
    }
    
    public void pagarMensalidade(String tipo){
        int mensalidade = 0;
        if (this.getTipo().equals("CC")){
            mensalidade = 12;
        }else if(this.getTipo().equals("CP")){
            mensalidade = 20;}

        if (this.getStatus()){
            if(getSaldo() > mensalidade){
                setSaldo(getSaldo() - mensalidade);
                System.out.println("Mensalidade paga com sucesso! ");
            } else {System.out.println("Conta sem saldo para pagar a mensalidade");}
        }else {System.out.println("Impossivel pagar uma mensalidade de uma conta fechada ");} 
    } 
}
