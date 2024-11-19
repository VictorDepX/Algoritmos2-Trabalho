public abstract class Personagem{
    public String nome;
    public int hp = 10, sp = 10, dano = 5, forca, destreza, ac;

    public Personagem(String nome, int forca, int destreza) {
        this.nome = nome;
        this.forca = forca;
        this.destreza = destreza;
    }

    public void receberDano(int dano){
        hp -=dano;
        if (hp <= 0){
            System.out.println(nome + "Foi derrotado. Game Over!");
        }
        System.out.println("HP Restante: " + hp);
    }

    public String atacar(String alvo){
        return alvo + "recebeu " + dano + " de " + nome;
    }

}
