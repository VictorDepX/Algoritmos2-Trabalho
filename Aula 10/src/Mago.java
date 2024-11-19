public class Mago extends Personagem implements  Equipar, HabilidadeEspecial{

    public Mago(String nome, int forca, int destreza) {
        super(nome, forca, destreza);
        super.sp+=5;
    }


    @Override
    public void equipar(String equipamento) {
        System.out.println(nome + " equipou " + equipamento);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println(nome + "Castou Uma Magia.");
        System.out.println("Causou " + dano + "de dano mágico.");
    }
}
