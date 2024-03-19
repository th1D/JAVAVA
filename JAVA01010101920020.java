import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso (em kg):");
        double peso = scanner.nextDouble();

        System.out.println("Digite a altura (em metros):");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("O IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Condição: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Condição: Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Condição: Acima do peso");
        } else {
            System.out.println("Condição: Obeso");
        }

        scanner.close();
    }
}
