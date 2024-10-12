import java.util.ArrayList;

public class Empresa {
    String nome;
    String cnpj;
    static double salario;

    static ArrayList<Empresa> funcionarios = new ArrayList<>();

    public Empresa(String nome, String cnpj, double salario) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.salario = salario;
    }

    public static void adicionar(Empresa func){
        funcionarios.add(func);
    }

    public static void remover(Empresa func){
        funcionarios.remove(func);
    }

    public static double getSalario(){
        return salario;
    }

    public static void folha(){
        for (Empresa func : funcionarios) {
            System.out.println(func.nome + " - " + salario);
        }
    }
}