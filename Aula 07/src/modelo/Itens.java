package modelo;

public class Itens {

    private String nomeItem;
    private String codigoItem;
    private double precoItem;

    public Itens(String nomeItem, String codigoItem, double precoItem) {
        this.nomeItem = nomeItem;
        this.codigoItem = codigoItem;
        this.precoItem = precoItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(String codigoItem) {
        this.codigoItem = codigoItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public void Exibir() {
        System.out.println("Nome: " + nomeItem + " Codigo: " + codigoItem + " Preco: " + precoItem);
    }
}
