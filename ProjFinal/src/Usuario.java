public class Usuario extends Pessoa {
    private String login;
    private int totalAssistido;

    public Usuario(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totalAssistido = 0;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotalAssistido() {
        return totalAssistido;
    }
    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    public void viuMaisUm(){
        this.setTotalAssistido(getTotalAssistido() + totalAssistido);
    }

    @Override
    public String toString() { 
        super.toString();
        return
        "Usuario {login=" + login + ", totalAssistido=" + totalAssistido + "}";
    }

    
}
