import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public Luta(){

    }

    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador lutador1, Lutador lutador2){
        if(lutador1.getCategoria().equals(lutador2.getCategoria())
        && lutador1 != lutador2){
            this.setAprovada(true);
            this.setDesafiado(lutador1);
            this.setDesafiante(lutador2);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            System.out.println("Luta reprovada, categorias diferentes, lutadores iguais ou lutador com idade inválida");
        }
    }

    public void lutar(){
        if(getAprovada()){
            System.out.println("---DESAFIADO---");
            this.getDesafiado().apresentar();
            System.out.println("---DESAFIANTE---");
            this.getDesafiante().apresentar();
            System.out.println("---RESULTADO---");
            Random random = new Random();
            int vencedor = random.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empate!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println("O desafiado " +
                    getDesafiado().getNome()+" venceu!");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2:
                    System.out.println("O desefiante " +
                     getDesafiante().getNome()+" venceu!");
                     this.getDesafiante().ganharLuta();
                     this.getDesafiado().perderLuta();
                    break;
            }
        }else{System.out.println("A luta nao pode acontecer pois nao foi aprovada");}
    }
}