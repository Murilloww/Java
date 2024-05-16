public class Peixe extends Animal {
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo coisas de peixe");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao emite som");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }
}
