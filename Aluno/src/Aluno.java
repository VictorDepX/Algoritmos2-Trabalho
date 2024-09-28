public class Aluno{
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome(){
        return nome;
    }
    public double getNota1(){
        return nota1;
    }
    public  double getNota2(){
        return nota2;
    }

    public void media(){
        double media = (getNota1() + getNota2()) / 2;
        System.out.println("Media do aluno " + getNome() + 'é' + media );
        if (media>=7){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
    }




}