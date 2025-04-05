
import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Par ou ímpar
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }
}
