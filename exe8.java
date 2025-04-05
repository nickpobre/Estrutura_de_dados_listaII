
import java.util.Scanner;


public class exe8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Média de uma lista de números
        System.out.print("Digite a quantidade de números para calcular a média: ");
        int quantidade = scanner.nextInt();
        int somaNumeros = 0;
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            somaNumeros += scanner.nextInt();
        }
        double media = (double) somaNumeros / quantidade;
        System.out.println("A média é: " + media);
    }
}
