import java.util.ArrayList;
public class Biblioteca {

    static ArrayList<Livro> livros = new ArrayList<>();

    public static void adicionar(Livro livro){
        livros.add(livro);
    }

    public static void remover(Livro livro){
        livros.remove(livro);
    }

    public static void buscar(Livro livro){
        System.out.println(livros.get(livros.indexOf(livro)));
    }
}
