import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        // Leer distintos tipos de datos
        // Int
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextLine();
        System.out.println("edad = " + edad);
        // Double
        System.out.print("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);
        consola.nextLine();
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        // Conversión de datos
        System.out.print("Ingresa un valor entero: ");
        /*
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        */
        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);
        // tipo flotante
        System.out.print("Ingresa un valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);
    }
}
