public class App {
    public static void main(String[] args) throws Exception {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("Aprendendo java",
         "Jose da silva", 300, 0,  p[0]);

        l[1] = new Livro("POO para iniciantes", 
        "Maria Candido", 320, 0,  p[1]);

        l[2] = new Livro("Java avancado",
         "Pedro Paulo", 500, 0, p[0]);
        
        l[0].abrir();
        l[0].avançarPagina(222);        
        l[0].voltarPagina(1);        
        
        System.out.println(l[0].detalhes());
    }
}
