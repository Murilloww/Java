public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao, likes, views;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.likes = 0;
        reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        int novaAvaliacao;
        novaAvaliacao = (this.avaliacao + avaliacao) / this.views;
        this.avaliacao = novaAvaliacao;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    @Override
    public void like() {
        this.setLikes(getLikes() + 1);
    }

    @Override
    public String toString() {
        return "{titulo = " + titulo + ", avaliacao=" + avaliacao + ", likes=" + likes + ", views=" + views
                + ", reproduzindo=" + reproduzindo + "}";
    }

}
