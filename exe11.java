
import java.util.Scanner;

public class exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Sequência de Fibonacci
        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.println("Sequência de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        System.out.println();
    }
}
