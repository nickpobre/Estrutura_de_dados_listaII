import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Soma de dois números inteiros
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma é: " + soma);
    }
}
