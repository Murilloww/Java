public class App {
    public static void main(String[] args) throws Exception {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        

        m.setPeso(35.5f);
        m.setCorPelo("Marrom");
        m.alimentar();

        r.setPeso(45.5f);
        r.setCorEscama("Azul");
        r.locomover();

        p.setPeso(5.5f);
        p.setIdade(23);
        p.setCorEscama("Amarela");


        a.setPeso(3.5f);
        a.locomover();

        j.locomover();

        c.locomover();

        k.emitirSom();
    }
}
