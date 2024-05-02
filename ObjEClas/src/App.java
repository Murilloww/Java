public class App {
    public static void main(String[] args) throws Exception {
        ContaBanco pessoa1 = new ContaBanco(0, false);
        pessoa1.setDono("Valter");
        pessoa1.abrirConta("CC");
        pessoa1.depositar(100);
        pessoa1.sacar(150);
        pessoa1.fecharConta();

        ContaBanco pessoa2 = new ContaBanco(0, false);
        pessoa2.setDono("Jane");
        pessoa2.abrirConta("CP");
        pessoa2.depositar(500);
        pessoa2.sacar(100);

        pessoa1.statusConta();
        pessoa2.statusConta();
    }

}
