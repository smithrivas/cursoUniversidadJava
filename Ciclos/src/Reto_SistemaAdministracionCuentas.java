import java.util.Scanner;

public class Reto_SistemaAdministracionCuentas {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var salir = false;
        while (!salir){
            System.out.print("""
                *** Sistema de administración de cuentas ***
                Menú:
                \t1. Crear cuenta
                \t2. Eliminar cuenta
                \t3. Salir
                
                Escoje una opción:\s""");
            var opcion = scanner.nextLine();

            switch (opcion){
                case "1"->System.out.println("Creando tu cuenta...\n");
                case "2"->System.out.println("Eliminando tu cuenta...\n");
                case "3"->{
                    System.out.println("Saliendo del sistema. Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opción invalida!\n");
            }
        }
        System.out.println("Saliendo sistema de administración de cuentas");
    }
}
