import java.util.Scanner;

public class Calculadora {
    int x;
    int y;

    public Calculadora(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void sum(){
        return x + y
    }

    public static void sub(){
        return x - y
    }

    public static void mult(){
        return x * y
    }

    public static void div(){
        return x / y
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora num = new Calculadora(sc.nextInt(), sc.nextInt());

        System.out.println("Seja Bem vindo ao programa!");
        System.out.println("-----------------------------------------");
        System.out.println("Escolha a operação");
        System.out.println("1. Adição");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        sc.nextLine();
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                num.sum();
                break;
            case 2:
                num.sub();
                break;
            case 3:
                num.mult();
                break;
            case 4:
                num.div();
                break;
        }

    }
}
