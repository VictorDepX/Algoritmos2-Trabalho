public class Eletronico extends Item{
    public String consumoW;

    public Eletronico(String nome, double preco, int estoque, String consumoW) {
        super(nome, preco, estoque);
        this.consumoW = consumoW;
    }

    public String toString(){
        return super.toString() + "Consumo em Watts: " + consumoW;
    }
}
