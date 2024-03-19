import java.util.Scanner;

public class CalculoAtribuicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        int a = scanner.nextInt();

        System.out.println("Digite o valor de B:");
        int b = scanner.nextInt();

        int c;

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }

        System.out.println("O valor de C é: " + c);

        scanner.close();
    }
}
