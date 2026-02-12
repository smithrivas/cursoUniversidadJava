import java.util.Scanner;

public class RecetasCocina2 {
    public static void main(String[] args) {
        System.out.println("*** Recetas Cocina ***");
        var scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre de la receta: ");
        var receta = scanner.nextLine();
        System.out.print("Ingredientes principales: ");
        var ingredientes = scanner.nextLine();
        System.out.print("Tiempo de preparación en minutos: ");
        var tiempo = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingresa la dificultad (facil/media/alta): ");
        var dificultad = scanner.nextLine();

        System.out.println("\n*** Receta de cocina ***");
        System.out.println("\tReceta: "+receta);
        System.out.println("\tIngredientes: "+ingredientes);
        System.out.println("\tTiempo: "+tiempo+" minutos");
        System.out.println("\tDificultad: "+dificultad);
    }
}
