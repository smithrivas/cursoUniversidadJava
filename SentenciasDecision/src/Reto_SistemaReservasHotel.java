import java.util.Scanner;

public class Reto_SistemaReservasHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema De Reserva De Hotel");
        final var CUARTO_VISTA_MAR = 190.50;
        final var CUARTO_SIN_VISTA_MAR = 150.50;

        var scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        var nombre = scanner.nextLine();
        System.out.print("Cantidad de días de estadía: ");
        var dias = Integer.parseInt(scanner.nextLine());
        System.out.print("Cuarto con vista al mar?(true/false): ");
        var vista = Boolean.parseBoolean(scanner.nextLine());

        // var costoTotal = vista ? CUARTO_VISTA_MAR*dias : CUARTO_SIN_VISTA_MAR*dias;

        String mensaje;
        var costoTotal = 0.0;
        if (vista){
            costoTotal = CUARTO_VISTA_MAR*dias;
            mensaje = "Si :)";
        }else {
            costoTotal = CUARTO_SIN_VISTA_MAR*dias;
            mensaje = "No :(";
        }

        System.out.printf("""
                %n-------- Detalles de la reservación --------
                Cliente: %s
                Días de estadía: %d
                Costo total: %.2f
                Habitación con vista al mar: %s
                """, nombre, dias, costoTotal, mensaje);
    }
}
