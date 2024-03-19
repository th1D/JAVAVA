import java.util.Scanner;

public class CalculoPagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço normal de etiqueta do produto:");
        double preco = scanner.nextDouble();

        System.out.println("Escolha a condição de pagamento:");
        System.out.println("1 - À vista em dinheiro (recebe 10% de desconto)");
        System.out.println("2 - À vista no cartão de crédito (recebe 15% de desconto)");
        System.out.println("3 - Em duas vezes (preço normal de etiqueta sem juros)");
        System.out.println("4 - Em três vezes (preço normal de etiqueta mais juros de 10%)");
        int opcao = scanner.nextInt();

        double valorPago = 0;

        switch (opcao) {
            case 1:
                valorPago = preco - (preco * 0.1);
                break;
            case 2:
                valorPago = preco - (preco * 0.15);
                break;
            case 3:
                valorPago = preco / 2;
                break;
            case 4:
                valorPago = preco * 1.1 / 3;
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        System.out.println("O valor a ser pago é: " + valorPago);

        scanner.close();
    }
}
