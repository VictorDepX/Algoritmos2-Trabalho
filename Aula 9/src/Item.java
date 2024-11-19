public abstract class Item {
    public String nome;
    public double preco = 0.0;
    public int estoque;

    public Item(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void vender(int qtde){
        boolean venda = true;
        if (qtde >= estoque){
            System.out.println("Não temos essa quantidade no estoque.");
        }
    }

    public String toString(){
        return "Nome: " + nome + ", Preço: " + preco + ", Quantidade em Estoque: " + estoque;
    }
}
