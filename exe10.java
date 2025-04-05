
import java.util.Scanner;

public class exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Contar vogais em uma string
        scanner.nextLine();
        System.out.print("Digite uma string: ");
        String str = scanner.nextLine();
        int contadorVogais = 0;
        for (char c : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                contadorVogais++;
            }
        }
        System.out.println("A quantidade de vogais na string é: " + contadorVogais);

    }
}
