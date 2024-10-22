package modelo;

public class Eletronicos extends Itens {
    private Integer consumoW;
    private boolean bivolt;

    public Eletronicos(String nomeItem, String codigoItem, double precoItem, Integer consumoW, boolean bivolt) {
        super(nomeItem, codigoItem, precoItem);
        if (consumoW <= 0){
            throw new IllegalArgumentException("O consumo do item deve ser maior que zero");
        }else {
            this.consumoW = consumoW;
        }
        this.bivolt = bivolt;
    }

    public Integer getConsumoW() {
        return consumoW;
    }

    public void setConsumoW(Integer consumoW) {
        this.consumoW = consumoW;
    }

    public boolean isBivolt() {
        return bivolt;
    }

    public void setBivolt(boolean bivolt) {
        this.bivolt = bivolt;
    }

    @Override
    public void Exibir() {
        super.Exibir();
        System.out.println("Consumo: " + consumoW + ", Bivoltado: " + bivolt);
    }

}
