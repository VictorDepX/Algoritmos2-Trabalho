public class Livro extends Item{
    public String autor;

    public Livro(String nome, double preco, int estoque, String autor) {
        super(nome, preco, estoque);
        this.autor = autor;
    }

    public String toString(){
        return super.toString() + "Autor: " + autor;
    }
}
