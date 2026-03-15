public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("*** Break y Continue");

        // Ejemplo break
        System.out.println("\nPalabra break: ");
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
                break;
            }
        }

        // Ejemplo continue
        System.out.println("\nPalabra continue: ");
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
