import java.util.Random;
import java.util.Scanner;

public class GeneradorId {
    public static void main(String[] args) {
        System.out.println("*** Generador de ID unico ***");
        var consola = new Scanner(System.in);
        var random = new Random();

        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Ingresa tu apellido: ");
        var apellido = consola.nextLine();
        System.out.print("Ingresa tu año de nacimiento (YYYY): ");
        var fechaNacimiento = consola.nextLine();

        var nombre2 = nombre.trim().toUpperCase().substring(0,2);
        var apellido2 = apellido.trim().toUpperCase().substring(0,2);
        var fechaNacimiento2 = fechaNacimiento.trim().substring(2);

        var aleatorio = random.nextInt(9999)+1;
        var aleatorio2 = String.format("%04d",aleatorio);

        var idUnico = nombre2+apellido2+fechaNacimiento2+aleatorio2;
        System.out.printf("""
                %nHola %s,
                \tTu número de identificación(ID) generado por el sistema es:
                \t%s
                \tFelicidades!
                """, nombre, idUnico);
    }
}
