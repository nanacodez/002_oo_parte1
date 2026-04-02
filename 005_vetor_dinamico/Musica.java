import java.util.Arrays;

public class Musica implements Comparable <Musica> {
    private String titulo;
    private int avaliacao;

    public Musica(String titulo){
        this.titulo = titulo;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    //(titulo, avaliacao)
    @Override
    public String toString() {
      return String.format("(%s, %d)", titulo, avaliacao);
    }

    @Override
    public int compareTo(Musica outraMusica){
        return this.titulo.compareTo(outraMusica.getTitulo());
    }
}
