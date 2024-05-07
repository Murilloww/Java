public class App {
    public static void main(String[] args) throws Exception {
        Lutador l[] = new Lutador[6];
        Luta luta = new Luta();

        l[0] = new Lutador("A", "Franca", 31, 15, 6,
        0, 1.72f, 70.9f);
        l[1] = new Lutador("B", "Alemanha", 26, 16, 7,
        6, 1.70f, 52.2f);
        l[2] = new Lutador("C", "Brasil", 39, 14, 5,
        0, 1.95f, 55f);
        l[3] = new Lutador("D", "Estado Unidos", 35, 20, 0,
        2, 1.62f, 68.9f);      
        l[4] = new Lutador("E", "Japao", 22, 12, 12,
        4, 1.82f, 103.2f);
        l[5] = new Lutador("F", "Jamaica", 15, 2, 1,
        6, 1.73f, 58.8f);

        luta.marcarLuta(l[4], l[3]);
        luta.lutar();
        
        l[4].apresentar();
        l[3].apresentar();
    }
}
