import java.util.Scanner;

public class DibujaTriangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibuja un triangulo ***");
        var consola = new Scanner(System.in);
        System.out.println("Ingresa el número de filas: ");
        var numeroFilas = consola.nextInt();

        for (var fila = 1; fila<=numeroFilas; fila++){
            var espaciosBlanco = " ".repeat(numeroFilas-fila);
            var asterisco = "*".repeat(2*fila-1);
            System.out.println(espaciosBlanco+asterisco);
        }
    }
}
