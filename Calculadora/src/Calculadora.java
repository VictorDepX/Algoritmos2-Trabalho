import java.util.Scanner;

public class Calculadora {

    public static void sum(double x, double y) {
        System.out.println(x + " + " + y + " = " + (x + y));
    }

    public static void sub( double x, double y) {
        System.out.println(x + " - " + y + " = " + (x - y));
    }

    public static void mult( double x, double y) {
        System.out.println(x + " * " + y + " = " + (x * y));
    }

    public static void div( double x, double y) {
        System.out.println(x + " / " + y + " = " + (x / y));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja Bem vindo ao programa!");
        System.out.println("-----------------------------------------");

        System.out.println("Digite um valor para x: ");
        double x = sc.nextDouble();
        System.out.println("Digite um valor para y: ");
        double y = sc.nextDouble();

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
                Calculadora.sum(x, y);
                break;
            case 2:
                Calculadora.sub(x, y);
                break;
            case 3:
                Calculadora.mult(x, y);
                break;
            case 4:
                Calculadora.div(x, y);
                break;
        }

    }
}