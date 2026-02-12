import java.util.Scanner;

public class RetoPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema Prestamo De Libros***");
        final var KILOMETROS = 3;

        System.out.print("Tiene credencial de estudiante?(true/false): ");
        var credencial = new Scanner(System.in).nextBoolean();
        System.out.print("A cuantos kilometros de la biblioteca vive?: ");
        var kilometros = new Scanner(System.in).nextDouble();

        var prestamo = credencial || kilometros <= 3;
        System.out.println("Se puede prestar el libro? :" + prestamo);
    }
}
