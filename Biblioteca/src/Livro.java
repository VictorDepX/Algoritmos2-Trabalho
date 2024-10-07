public class Livro {
    static String titulo;
    static String autor;
    static Integer anoPublicacao;

    public Livro(String titulo, String autor, Integer anoPublicacao) {
        Livro.titulo = titulo;
        Livro.autor = autor;
        Livro.anoPublicacao = anoPublicacao;
    }

    public static String getTitulo() {
        return titulo;
    }

    public static String getAutor() {
        return autor;
    }

    public static Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    //Methods

    public static void exibirDetalhes(){
        System.out.println("O livro " + getTitulo() + ", escrito por" + getAutor() + ", publicado no ano de" + getAnoPublicacao());
    }
}
