import java.time.LocalDateTime;

public class Bebida extends Alimento{
    public int alcool;

    public Bebida(String nome, double preco, int estoque, LocalDateTime validade, int alcool) {
        super(nome, preco, estoque, validade);
        this.alcool = alcool;
    }

    @Override
    public void vender(int qtde, int idade){
        super.vender(qtde);
        boolean venda = true;
        if (idade < 18){
            System.out.println("Venda proibida à menor de idade.");
        }
        else if (idade > 18 && LocalDateTime.now().isAfter(validade)){
            System.out.println(venda);
        }
    }
}
