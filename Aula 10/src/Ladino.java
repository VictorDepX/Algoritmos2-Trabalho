public class Ladino extends Personagem implements Equipar, HabilidadeEspecial{

    public Ladino(String nome, int forca, int destreza, int ac) {
        super(nome, forca, destreza);
        this.ac = ac + destreza;
    }

    @Override
    public void equipar(String equipamento) {
        System.out.println(nome + " equipou " + equipamento);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println(nome + "ficou invisível.");
    }
}
