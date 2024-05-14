public class Tecnico extends Aluno{
    private int registroProfissional;

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public final void praticar(){
    System.out.println("Aluno tecnico" + getNome() + "esta praticando");
    }

    @Override
    public void status(){
        super.status();
        System.out.println("Registro profissional: " 
        + this.getRegistroProfissional());
    }
}
