public interface Publicacao {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int pagina);
    public abstract void avançarPagina(int avancar);
    public abstract void voltarPagina(int voltar);
}
