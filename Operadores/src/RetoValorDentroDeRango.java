import java.util.Scanner;

public class RetoValorDentroDeRango {
    public static void main(String[] args) {
        System.out.println("*** Valor dentro de rango ***");

        // Límites
        final var MINIMO = 0;
        final var MAXIMO = 5;

        System.out.print("Ingresa un valor entre 0 y 5: ");
        var valor = Integer.parseInt(new Scanner(System.in).nextLine());
        var rango = valor >= MINIMO && valor <= MAXIMO;
        System.out.println("Está dentro de rango? = " + rango);
    }
}
