public class exe9 {
    public static void main(String[] args) {
        // Números primos de 1 a 100
        System.out.println("Números primos de 1 a 100:");
        for (int i = 2; i <= 100; i++) {
            boolean primo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
