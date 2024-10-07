import java.util.ArrayList;

public class Empresa {
    String nome;
    String cnpj;

    static ArrayList<String> funcionarios = new ArrayList<>();

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public static void adicionar(String nome){
        funcionarios.add(nome);
    }

    public static void remover(String nome){
        funcionarios.remove(nome);
    }

    public static void folha(){
        for (String func : funcionarios){
            System.out.println(func);
        }
    }
}