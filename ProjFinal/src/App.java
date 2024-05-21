public class App {
    public static void main(String[] args) throws Exception {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 JAVA");
        v[1] = new Video("Aula 2 JAVA");
        v[2] = new Video("Aula 3 JAVA");

        Usuario user[] = new Usuario[2];
        user[0] = new Usuario("Sheyla", "F", 19, "sheyla2005@gmail.com");
        user[1] = new Usuario("Enzo", "M", 22, "enzo2002@gmail.com");

        Visualizacao visu[] = new Visualizacao[5];
        visu[1] = new Visualizacao(user[0], v[1]);
        visu[1].avaliar();
        System.out.println(visu[1].toString());

        visu[1] = new Visualizacao(user[0], v[2]);
        visu[1].avaliar(35.0f);
        System.out.println(visu[1].toString());
    }
}
