import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando o usuário
        System.out.print("Digite seu nome: ");
        Usuario usuario = new Usuario(scanner.nextLine());
        System.out.println("Bem-vindo(a), " + usuario.getNome() + "!");

        // Criando a lista de produtos disponíveis
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(new Produto("Camisa", 49.99));
        listaProdutos.add(new Produto("Calça", 89.99));
        listaProdutos.add(new Produto("Tênis", 120.00));
        listaProdutos.add(new Produto("Boné", 29.99));

        // Carrinho de compras
        Carrinho carrinho = new Carrinho();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Mostrar produtos");
            System.out.println("2. Adicionar produto ao carrinho");
            System.out.println("3. Remover produto do carrinho");
            System.out.println("4. Mostrar carrinho");
            System.out.println("5. Finalizar compra");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nLista de produtos:");
                    for (int i = 0; i < listaProdutos.size(); i++) {
                        System.out.println((i + 1) + ". " + listaProdutos.get(i));
                    }
                    break;

                case 2:
                    System.out.print("Digite o número do produto que deseja adicionar: ");
                    int produtoIndex = scanner.nextInt() - 1;
                    if (produtoIndex >= 0 && produtoIndex < listaProdutos.size()) {
                        carrinho.adicionarProduto(listaProdutos.get(produtoIndex));
                    } else {
                        System.out.println("Produto inválido.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o número do produto que deseja remover: ");
                    produtoIndex = scanner.nextInt() - 1;
                    if (produtoIndex >= 0 && produtoIndex < listaProdutos.size()) {
                        carrinho.removerProduto(listaProdutos.get(produtoIndex));
                    } else {
                        System.out.println("Produto inválido.");
                    }
                    break;

                case 4:
                    carrinho.mostrarCarrinho();
                    System.out.println("Valor total da compra: R$ " + carrinho.calcularTotal());
                    break;

                case 5:
                    System.out.println("Compra Efetuada com sucesso, volte sempre!");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        System.out.println("Obrigado por comprar conosco, " + usuario.getNome() + "!");
        scanner.close();
    }
}
