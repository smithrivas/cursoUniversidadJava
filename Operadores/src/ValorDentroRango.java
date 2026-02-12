import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Número entre rango 0 - 5 ***");
        final var MAXIMO = 5;
        final var MINIMO = 0;
        System.out.print("Ingrese un número: ");
        var numeroUsuario = Integer.parseInt(new Scanner(System.in).nextLine());
        var resultado = (numeroUsuario>=0) && (numeroUsuario<=5);
        System.out.println("Número dentro del rango?: "+resultado);
    }
}
