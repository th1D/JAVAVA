import java.util.Scanner;

public class SomaParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        int resultado;

        if (numero % 2 == 0) {
            resultado = numero + 5;
        } else {
            resultado = numero + 8;
        }

        System.out.println("O resultado da operação é: " + resultado);

        scanner.close();
    }
}
