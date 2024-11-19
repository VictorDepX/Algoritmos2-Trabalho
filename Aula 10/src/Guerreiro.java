public class Guerreiro extends Personagem implements Equipar, HabilidadeEspecial{

    public Guerreiro(String nome, int forca, int destreza) {
        super(nome, forca, destreza);
        this.dano = dano + forca;
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println(nome + "Deu uma sequencia de golpes no alvo.");
        System.out.println("Causou " + dano + "de dano no alvo.");
    }

    @Override
    public void equipar(String equipamento) {
        System.out.println(nome + " equipou " + equipamento);
    }
}
