package modelo;

public class Alimentos extends Itens {
    private String validade;
    private boolean organico;

    public Alimentos(String nomeItem, String codigoItem, double precoItem, String validade, boolean organico) {
        super(nomeItem, codigoItem, precoItem);
        if (validade == null || validade.isEmpty()) {
            throw new IllegalArgumentException("A data de validade não pode ser vazia ou nula.");
        } else {
            this.validade = validade;
        }
        this.organico = organico;

    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        if (validade == null || validade.isEmpty()) {
            throw new IllegalArgumentException("A data de validade não pode ser vazia ou nula.");
        } else {
            this.validade = validade;
        }
    }

    public boolean isOrganico() {
        return organico;
    }

    public void setOrganico(boolean organico) {
        this.organico = organico;
    }

    @Override
    public void Exibir() {
        super.Exibir();
        System.out.println("Validade: " + validade + ", Organico: " + organico);
    }
}
