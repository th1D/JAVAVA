import java.util.Scanner;

public class InfoPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();

        System.out.println("Digite o sexo da pessoa (M para masculino, F para feminino):");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite o estado civil da pessoa (CASADA, SOLTEIRA, DIVORCIADA, VIUVA):");
        String estadoCivil = scanner.next();

        if (sexo == 'F' && estadoCivil.equalsIgnoreCase("CASADA")) {
            System.out.println("Digite o tempo de casamento (em anos):");
            int tempoCasada = scanner.nextInt();
            System.out.println("A pessoa está casada há " + tempoCasada + " anos.");
        }

        scanner.close();
    }
}
