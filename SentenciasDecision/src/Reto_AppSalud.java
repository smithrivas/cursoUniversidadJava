import java.util.Scanner;

public class Reto_AppSalud {
    public static void main(String[] args) {
        System.out.println("*** Aplicación Salud y Fitness ***");
        final var META_PASOS_DIARIOS = 10000;
        final var CALORIAS_POR_PASO = 0.04;

        System.out.print("Ingresa tu nombre: ");
        var nombre = new Scanner(System.in).nextLine();
        System.out.print("Ingresa la cantidad de pasos caminados en el día: ");
        var pasos = Integer.parseInt(new Scanner(System.in).nextLine());

        var caloriasQuemadas = pasos*CALORIAS_POR_PASO;
        var meta = pasos>=META_PASOS_DIARIOS ? "Cumplida" : "Fallida";

        /*
        System.out.println(nombre+" tu meta diaria de pasos caminados fue: "+meta);
        System.out.println("Pasos: "+pasos);
        System.out.printf("Calorias quemadas: %.2f",caloriasQuemadas);
         */

        System.out.printf("""
                %nUsuario: %s
                Pasos dados hoy: %d
                Calorias quemadas: %.2f
                Meta de pasos diarios: %s
                -------------------------
                Meta de pasos diarios: %d
                """, nombre, pasos, caloriasQuemadas, meta, META_PASOS_DIARIOS);
    }
}
