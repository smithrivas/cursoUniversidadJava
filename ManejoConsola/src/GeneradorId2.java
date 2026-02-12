import java.util.Random;
import java.util.Scanner;

public class GeneradorId2 {
    public static void main(String[] args) {
        System.out.println("*** generador de ID único ***");
        
        var scanner = new Scanner(System.in);
        var random = new Random();

        // Datos
        System.out.print("Ingresa tu nombre: ");
        var nombre = scanner.nextLine();
        System.out.print("Ingresa tu apellido: ");
        var apellido = scanner.nextLine();
        System.out.print("Ingresa tu año de nacimiento(YYYY): ");
        var añoNacimiento = scanner.nextLine();

        // Datos normalizados
        var nombreId = nombre.strip().substring(0, 2).toUpperCase();        
        var apellidoId = apellido.strip().substring(0, 2).toUpperCase();        
        var añoId = añoNacimiento.strip().substring(2).toUpperCase();

        // Aleatorio
        var id = random.nextInt(9999)+1;

        var idUnico = String.format("%s%s%s%04d",nombreId,apellidoId,añoId,id);
        System.out.printf("""
                %nHola %s,
                \tTu nuevo número de identificación (ID) generado por el sistema es:
                \t%s
                \tFelicidades!
                """,nombre,idUnico);
    }
}
