import java.util.Scanner;

public class RetoSistemaDescuentos {
    public static void main(String[] args) {
        System.out.println("*** Sistema Descuentos VIP ***");
        final var ARTICULOS_MIN = 10;

        System.out.print("Cuantas articulos ha comprado en el día?: ");
        var articulos = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Tiene membresía de la tienda? (S/N): ");
        var membresia = new Scanner(System.in).nextLine().toUpperCase();

        var descuento = articulos >= ARTICULOS_MIN && membresia.equals("S");
        System.out.println("Tiene acceso al descuento? = " + descuento);
    }
}
