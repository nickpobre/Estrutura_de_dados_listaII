
import java.util.Scanner;

public class exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Valor máximo em um array de inteiros
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        int[] numeros = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int maximo = numeros[0];
        for (int i = 1; i < tamanho; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        System.out.println("O valor máximo é: " + maximo);
    }
}
