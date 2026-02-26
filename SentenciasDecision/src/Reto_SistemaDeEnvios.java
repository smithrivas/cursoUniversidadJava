import java.util.Scanner;

public class Reto_SistemaDeEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de envíos ***");
        final var NACIONAL = 10.00;
        final var INTERNACIONAL = 20.00;

        System.out.print("Ingresa el destino del paquete (nacional/internacional): ");
        var destino = new Scanner(System.in).nextLine();
        System.out.print("Ingresa el peso del paquete (en kg): ");
        var peso = Double.parseDouble(new Scanner(System.in).nextLine().strip().toLowerCase());

        Double costoEnvio = switch (destino){
            case "nacional" -> peso*NACIONAL;
            case "internacional" -> peso*INTERNACIONAL;
            default -> {
                System.out.println("Destino invalido. Ingresa nacional/internacional");
                yield null;
            }
        };

        if (costoEnvio != null)
            System.out.printf("El costo del envío del paquete es: $%.2f", costoEnvio);
    }
}
