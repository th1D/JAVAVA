import java.util.Scanner;

public class DobroOuTriplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        int resultado;

        if (numero >= 0) {
            resultado = numero * 2;
        } else {
            resultado = numero * 3;
        }

        System.out.println("O resultado é: " + resultado);

        scanner.close();
    }
}
