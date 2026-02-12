import java.util.Scanner;

public class SistemaDescuentoVIP {
    public static void main(String[] args) {
        System.out.println("*** Sistema Descuento VIP ***");
        final var NO_PRODUCTOS_DESCUENTO = 10;
        var consola = new Scanner(System.in);

        System.out.print("Cuantos productos compraste hoy?: ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("Tienes membresia de la tienda(true/false)?: ");
        var membresia = Boolean.parseBoolean(consola.nextLine());

        var descuento = cantidadProductos>=10 && membresia;
        System.out.println("Descuento VIP: "+descuento);
    }
}
