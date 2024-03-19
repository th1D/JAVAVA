import java.util.Scanner;

public class CalculoMediaAproveitamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o número de identificação do aluno:");
        int idAluno = scanner.nextInt();

        System.out.println("Digite a nota da primeira verificação:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da segunda verificação:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota da terceira verificação:");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a média dos exercícios:");
        double mediaExercicios = scanner.nextDouble();

        double mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;

        char conceito;
        if (mediaAproveitamento >= 90) {
            conceito = 'A';
        } else if (mediaAproveitamento >= 75) {
            conceito = 'B';
        } else if (mediaAproveitamento >= 60) {
            conceito = 'C';
        } else if (mediaAproveitamento >= 40) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        System.out.println("Número de identificação do aluno: " + idAluno);
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("Média dos exercícios: " + mediaExercicios);
        System.out.println("Média de aproveitamento: " + mediaAproveitamento);
        System.out.println("Conceito: " + conceito);

        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
