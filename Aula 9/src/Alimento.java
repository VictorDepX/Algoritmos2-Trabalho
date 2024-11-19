import java.time.LocalDateTime;

public abstract class Alimento extends Item {
    public LocalDateTime validade;


    public Alimento(String nome, double preco, int estoque, LocalDateTime validade) {
        super(nome, preco, estoque);
        this.validade = validade;
    }

    @Override
    public void vender(int qtde){
        super.vender(qtde);
        boolean venda = true;
        if (LocalDateTime.now().isAfter(validade)){
            System.out.println("Produto está vencido, venda cancelada.");
        }
        else {
            System.out.println(venda);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Validade: " + validade;
    }

    public abstract void vender(int qtde, int idade);
}
