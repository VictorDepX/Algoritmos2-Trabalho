import java.util.ArrayList;

public class Biblioteca {

    static ArrayList<String> livros = new ArrayList<String>();

    public static String adicionar(String titulo, String autor, Integer anopublicacao) {
        livros.add(new Livro(titulo, autor, anopublicacao).toString());
    }

    public static void main(String[] args) {
        ArrayList<String> livros = new ArrayList<String>();



    }
}