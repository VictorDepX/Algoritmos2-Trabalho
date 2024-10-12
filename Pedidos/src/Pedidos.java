import java.util.ArrayList;
public class Pedidos {
    Integer numero;
    String nome;
    double data;
    double preco;

    static ArrayList<Pedidos> ped = new ArrayList<>();

    public Pedidos(Integer numero, String nome, double data, ArrayList<Pedidos> pedidos) {
        this.numero = numero;
        this.nome = nome;
        this.data = data;
        this.preco = preco;
    }

    public static void adicionar(Pedidos pedido) {
        ped.add(pedido);
    }
    public static void remover(Pedidos pedido) {
        ped.remove(pedido);
    }
    public static void calc(){
        double soma = 0;
        for (Pedidos pedido : ped) {
            soma += pedido.preco;
        }
        System.out.println(soma);
    }
}