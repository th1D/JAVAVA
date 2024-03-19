import java.util.Scanner;

public class SomaMenorQueC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        int a = scanner.nextInt();

        System.out.println("Digite o valor de B:");
        int b = scanner.nextInt();

        System.out.println("Digite o valor de C:");
        int c = scanner.nextInt();

        if (a + b < c) {
            System.out.println("A soma de A + B é menor que C.");
        } else {
            System.out.println("A soma de A + B não é menor que C.");
        }

        scanner.close();
    }
}
