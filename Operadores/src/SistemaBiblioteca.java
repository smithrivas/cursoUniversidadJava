import java.util.Scanner;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        System.out.println("*** Sistema Biblioteca ***");
        final var DISTANCIA_PERMTIDA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.print("Tiene credencial de estudiante?: ");
        var credencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("Cuantos kilometros a la redonda vives de la biblioteca?: ");
        var distancia = Integer.parseInt(consola.nextLine());

        var cumpleCondicion = credencial || distancia<= DISTANCIA_PERMTIDA_KM;
        System.out.println("Cumple condición?: "+cumpleCondicion);
    }
}
