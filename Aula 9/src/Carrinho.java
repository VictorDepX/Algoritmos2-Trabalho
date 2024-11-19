import java.util.ArrayList;

public class Carrinho {
    public ArrayList<Item> itens;

    public Carrinho(){
        itens = new ArrayList<>();
    }

    public void addItem(Item item){
        itens.add(item);
    }
}
