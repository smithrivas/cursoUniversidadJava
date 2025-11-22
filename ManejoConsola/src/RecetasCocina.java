import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de Cocina ***");
        var consola = new Scanner(System.in);
        System.out.print("Ingresa el nombre de la receta: ");
        var nombre = consola.nextLine();
        System.out.print("Ingresa los ingredientes: ");
        var ingredientes = consola.nextLine();
        System.out.print("Ingresa el tiempo de preparación (min): ");
        var tiempo = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa la dificultad (fácil/media/alta): ");
        var dificultad = consola.nextLine();

        System.out.println("\n--- Receta de cocina ---");
        System.out.println("\tNombre receta: "+nombre);
        System.out.println("\tIngredientes: "+ingredientes);
        System.out.println("\tTiempo de preparación: "+tiempo+ " Minutos");
        System.out.println("\tDificultad: "+dificultad);
    }
}
