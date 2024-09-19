import java.util.ArrayList;

class Carrinho {
    private ArrayList<Produto> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    // Adicionar produto ao carrinho
    public void adicionarProduto(Produto produto) {
        itens.add(produto);
        System.out.println(produto.getNome() + " adicionado ao carrinho.");
    }

    // Remover produto do carrinho
    public void removerProduto(Produto produto) {
        if (itens.remove(produto)) {
            System.out.println(produto.getNome() + " removido do carrinho.");
        } else {
            System.out.println(produto.getNome() + " não está no carrinho.");
        }
    }

    // Calcular o valor total
    public double calcularTotal() {
        double total = 0;
        for (Produto item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    // Mostrar itens do carrinho
    public void mostrarCarrinho() {
        if (itens.isEmpty()) {
            System.out.println("Carrinho vazio.");
        } else {
            System.out.println("Itens no carrinho:");
            for (Produto item : itens) {
                System.out.println(item);
            }
        }
    }
}
