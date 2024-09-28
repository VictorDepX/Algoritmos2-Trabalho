public class Livro {
    private static String titulo;
    private static String autor;
    private static Integer anoPublicacao;

    public Livro(String titulo, String autor, Integer anoPublicacao) {
        Livro.titulo = titulo;
        Livro.autor = autor;
        Livro.anoPublicacao = anoPublicacao;
    }

    public static String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        Livro.titulo = titulo;
    }
    public static String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        Livro.autor = autor;
    }
    public static Integer getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(String anoPublicacao) {
        Livro.anoPublicacao = Integer.valueOf(anoPublicacao);
    }

    public static String showDetails(){
        System.out.println("O livro " + getTitulo() + ", escrito por" + getAutor() + ", publicado no ano de" + getAnoPublicacao());
    }
}
