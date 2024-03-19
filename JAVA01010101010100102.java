import java.util.Scanner;

public class VerificaBooleanos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor booleano (true/false):");
        boolean valor1 = scanner.nextBoolean();

        System.out.println("Digite o segundo valor booleano (true/false):");
        boolean valor2 = scanner.nextBoolean();

        if (valor1 && valor2) {
            System.out.println("Ambos os valores são VERDADEIROS.");
        } else {
            System.out.println("Um ou ambos os valores são FALSOS.");
        }

        scanner.close();
    }
}
