import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor inteiro:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo valor inteiro:");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro valor inteiro:");
        int numero3 = scanner.nextInt();

        int maior = numero1;
        if (numero2 > maior) {
            maior = numero2;
        }
        if (numero3 > maior) {
            maior = numero3;
        }

        int menor = numero1;
        if (numero2 < menor) {
            menor = numero2;
        }
        if (numero3 < menor) {
            menor = numero3;
        }

        int meio = (numero1 != maior && numero1 != menor) ? numero1 : ((numero2 != maior && numero2 != menor) ? numero2 : numero3);

        System.out.println("Em ordem decrescente:");
        System.out.println(maior);
        System.out.println(meio);
        System.out.println(menor);

        scanner.close();
    }
}
